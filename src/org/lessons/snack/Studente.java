package org.lessons.snack;

public class Studente {

  public String nome;
  public String cognome;
  public int età;

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
