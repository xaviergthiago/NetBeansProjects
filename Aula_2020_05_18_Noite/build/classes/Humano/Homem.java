/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humano;

/**
 *
 * @author sicsu
 */
public class Homem extends Humano {

  boolean barba, bigode;
  double peitoral;

  public Homem() {
    this.sexo = "Masculino";
  }

  public void setBarba(boolean barba) {
    this.barba = barba;
  }

  public void setBigode(boolean bigode) {
    this.bigode = bigode;
  }

  public void setPeitoral(double peitoral) {
    this.peitoral = peitoral;
  }

  public boolean getBarba() {
    return this.barba;
  }

  public boolean getBigode() {
    return this.bigode;
  }

  public double getPeitoral() {
    return this.peitoral;
  }

  public String amamentar() {
    return "Homens usam mamadeiras!";
  }
}
