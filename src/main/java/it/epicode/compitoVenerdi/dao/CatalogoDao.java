package it.epicode.compitoVenerdi.dao;

import it.epicode.compitoVenerdi.entities.Catalogo;
import jakarta.persistence.*;

import javax.xml.catalog.Catalog;
import java.util.List;

//@NamedQuery(name = "cercaautore",query = "select c from Catalogo c where c.autore=:autore")
public class CatalogoDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public CatalogoDao() {
        emf = Persistence.createEntityManagerFactory("catalogo");
        em  = emf.createEntityManager();


    }
public void salva(Catalogo c){
    EntityTransaction et=em.getTransaction();
    et.begin();
    em.persist(c);
    et.commit();





    }
    public Catalogo getById(int id){
        return  em.find(Catalogo.class,id);
    }

    public void deleteCatalogo(int id){
        EntityTransaction et=em.getTransaction();
        et.begin();
        Catalogo c=getById(id);
        em.remove(c);
        et.commit();

    }
    public List<Catalogo> getautore(String a){
Query query=em.createQuery("select c from Catalogo c where  c.autore=:autore");
query.setParameter("autore",a);
 List<Catalogo> a1 =query.getResultList();

return a1;
    }
    public List<Catalogo> getanno(int annoPubblicazione){
        return em.createQuery("SELECT c FROM Catalogo c WHERE c.annoPubblicazione =:annoPubblicazione", Catalogo.class).setParameter("annoPubblicazione",annoPubblicazione).getResultList();

    }


}
