package org.lessons.snack;

public class RegistroStudenti {

  private Studente[] registro;

  // constructor
  public RegistroStudenti() {
    this.registro = new Studente[0];
  }

  // other methods
  public void addStudente(Studente studente) {

    // new array
    Studente[] newArray = new Studente[this.registro.length + 1];
    for (int i = 0; i < this.registro.length; i++) {
      newArray[i] = this.registro[i];
    }
    newArray[newArray.length - 1] = studente;
    this.registro = newArray;
  }

  // getter and setter
  public void getRegistro() {

    for (int i = 0; i < this.registro.length; i++) {
      System.out.println(this.registro[i].getFullStudente());
    }
  }
}
