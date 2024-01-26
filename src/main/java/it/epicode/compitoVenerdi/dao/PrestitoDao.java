package it.epicode.compitoVenerdi.dao;

import it.epicode.compitoVenerdi.entities.Catalogo;
import it.epicode.compitoVenerdi.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PrestitoDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public PrestitoDao() {
        emf = Persistence.createEntityManagerFactory("catalogo");
        em  = emf.createEntityManager();
    }

public void salva(Prestito c){
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

}}

