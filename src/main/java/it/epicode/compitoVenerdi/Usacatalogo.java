package it.epicode.compitoVenerdi;

import it.epicode.compitoVenerdi.dao.CatalogoDao;
import it.epicode.compitoVenerdi.entities.Libri;
import it.epicode.compitoVenerdi.entities.Periodicita;
import it.epicode.compitoVenerdi.entities.Riviste;

import java.time.LocalDate;

public class Usacatalogo {
    public static void main(String[] args) {
        Libri libri = new Libri("ciccio", 20,20,"sempronio","lutto");
        Libri libro2 = new Libri("ciccia", 2019,30,"caio","giallo");

        CatalogoDao d=new CatalogoDao();
        d.salva(libri);
        d.salva(libro2);
        System.out.println( d.getautore("caio"));


        Riviste r1=new Riviste("Chi",2019,20, Periodicita.SEMESTRALE);
        d.salva(r1);
        Riviste r2=new Riviste("donnaModerna",2030,30,Periodicita.SETTIMANALE);
        d.salva(r2);
        System.out.println(  d.getanno(2019));
        System.out.println(d.getautore("Chi"));
        System.out.println(d.getIsbn(354));
    }
}
