package it.epicode.compitoVenerdi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//manytoone
@Entity
@Table(name = "libri")
public class Libri extends Catalogo {
   @Column(nullable = false)
    private String autore;
    private String genere;

public Libri(){}

    public Libri(String autore, String genere) {

        this.autore = autore;
        this.genere = genere;
}

    public Libri( String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super( titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}

