package it.epicode.compitoVenerdi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utente")
public class Utente {

   @OneToMany(mappedBy = "utente")

   private List<Prestito> prestiti;
   @Column(nullable = false)
   private String nome;
   @Column(nullable = false)
   private String cognome;
   @Column(name = "data_di_nascita")
   private LocalDate DataDiNascita;
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "numero_di_tessera")
   private int NumeroDiTessera;

   public Utente() {
   }

   public Utente( String nome, String cognome, LocalDate dataDiNascita, int numeroDiTessera) {
      prestiti =new ArrayList<Prestito>();
      this.nome = nome;
      this.cognome = cognome;
      DataDiNascita = dataDiNascita;
      NumeroDiTessera = numeroDiTessera;
   }

   public List<Prestito> getPrestiti() {
      return prestiti;
   }

   public void setPrestiti(List<Prestito> prestiti) {
      this.prestiti = prestiti;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCognome() {
      return cognome;
   }

   public void setCognome(String cognome) {
      this.cognome = cognome;
   }

   public LocalDate getDataDiNascita() {
      return DataDiNascita;
   }

   public void setDataDiNascita(LocalDate dataDiNascita) {
      DataDiNascita = dataDiNascita;
   }

   public int getNumeroDiTessera() {
      return NumeroDiTessera;
   }

   public void setNumeroDiTessera(int numeroDiTessera) {
      NumeroDiTessera = numeroDiTessera;
   }

   @Override
   public String toString() {
      return "Utente{" +
              "prestiti=" + prestiti +
              ", nome='" + nome + '\'' +
              ", cognome='" + cognome + '\'' +
              ", DataDiNascita=" + DataDiNascita +
              ", NumeroDiTessera=" + NumeroDiTessera +
              '}';
   }
}

