package it.epicode.compitoVenerdi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "prestito")

public class Prestito {
@ManyToOne
    @JoinColumn(name = "utente_fk")
    private Utente utente;
@Id
private int id;
@OneToOne
@JoinColumn(name = "catalogo_fk")
 private Catalogo catalogo;


    @Column(name = "data_inizio_prestito")
    private LocalDate DataInizioPrestito;

    @Column(name = "data_restituzione_prevista")
    private LocalDate DataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private LocalDate DatarestituzioneEffittiva;

    public Prestito() {
    }

    public Prestito(Utente utente, Catalogo catalogo) {
        this.utente = utente;
        this.id = id;
        this.catalogo = catalogo;

      this.DataInizioPrestito = LocalDate.now();
       this.DataRestituzionePrevista = DataInizioPrestito.plusDays(30); ;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public LocalDate getDataInizioPrestito() {
        return DataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        DataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return DataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        DataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDatarestituzioneEffittiva() {
        return DatarestituzioneEffittiva;
    }

    public void setDatarestituzioneEffittiva(LocalDate datarestituzioneEffittiva) {
        DatarestituzioneEffittiva = datarestituzioneEffittiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", id=" + id +
                ", catalogo=" + catalogo +
                ", DataInizioPrestito=" + DataInizioPrestito +
                ", DataRestituzionePrevista=" + DataRestituzionePrevista +
                ", DatarestituzioneEffittiva=" + DatarestituzioneEffittiva +
                '}';
    }
}
