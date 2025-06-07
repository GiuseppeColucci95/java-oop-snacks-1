package org.lessons.snack;

public class Main {

  public static void main(String[] args) {

    Studente firstStudente = new Studente("Giuseppe", "Colucci", 29);
    Studente secondStudente = new Studente("Davide", "Morisco", 27);

    System.out.println(firstStudente.getFullStudente());

    RegistroStudenti studenti = new RegistroStudenti();

    studenti.addStudente(firstStudente);
    studenti.addStudente(secondStudente);

    studenti.getRegistro();
  }
}
