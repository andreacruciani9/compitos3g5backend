package it.epicode.compitoVenerdi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
//manytoone
@Entity
@Table(name = "riviste")
public class Riviste extends Catalogo {
    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Riviste (){}

    public Riviste(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    public Riviste(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }



    @Override
    public String toString() {
        return "Magazine{" +
                "titolo='" + getTitolo() + " " +'\'' +
        "annoPubblicazioner='" + getAnnoPubblicazione() + " " +'\'' +
        "NumeroPagine='" + getNumeroPagine() + " " +'\'' +
        "periodicita=" + periodicita + " " +
                "ISBN='" + getCodiceISBN() + " " + '\'' +
        "}";
    }
}
