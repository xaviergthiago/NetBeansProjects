/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author sicsu
 */
public class Quadrado {

  protected double base;

  public Quadrado() {
  }

  public Quadrado(double base) {
    this.setBase(base);
  }

  protected void setBase(double base) {
    if (base > 0) {
      this.base = base;
    }
  }

  public double getBase() {
    return this.base;
  }

  public double area() {
    return this.base * this.base;
  }

  public double volume() {
    return this.area() * this.base;
  }

}
