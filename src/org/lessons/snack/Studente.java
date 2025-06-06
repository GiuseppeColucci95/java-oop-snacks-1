package org.lessons.snack;

public class Studente {

  private String nome;
  private String cognome;
  private int età;

  // constructor
  public Studente(String nome, String cognome, int età) {
    this.nome = nome;
    this.cognome = cognome;
    this.età = età;
  }

  // other methods
  public String getFullStudente() {

    return nome + " " + cognome + ", " + età + " anni";
  }
}
