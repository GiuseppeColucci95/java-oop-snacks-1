package org.lessons.snack;

public class ContoBancario {

  private int numeroDiConto;
  private double saldo;

  // constructor
  public ContoBancario(int numeroDiConto) {
    this.numeroDiConto = numeroDiConto;
    this.saldo = 0d;
  }

  // other methods
  public void addDenaro(double denaroDaDepositare) {
    this.saldo += denaroDaDepositare;
  }

  public double getDenaro(double denaroDaPrelevare) {
    if (this.saldo >= denaroDaPrelevare) {
      this.saldo -= denaroDaPrelevare;
      return this.saldo;
    }
    return this.saldo;
  }

  public double getSaldoCorrente() {
    return this.saldo;
  }
}
