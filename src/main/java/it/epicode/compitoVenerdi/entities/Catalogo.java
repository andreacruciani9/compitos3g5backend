package it.epicode.compitoVenerdi.entities;

import jakarta.persistence.*;
//onetomeny




@Entity
@Table(name = "catalogo")
@Inheritance(strategy =InheritanceType.TABLE_PER_CLASS )
public class Catalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codiceISBN;
    @OneToOne(mappedBy = "catalogo")
    private Prestito prestito;
    private String titolo;
    @Column(name = "anno_pubblicazione")
    private  int annoPubblicazione;
    private int numeroPagine;

    public Catalogo(){}

    public Catalogo( String titolo, int annoPubblicazione, int numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public long getCodiceISBN() {
        return codiceISBN;
    }

    public void setCodiceISBN(int codiceISBN) {
        this.codiceISBN = codiceISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
