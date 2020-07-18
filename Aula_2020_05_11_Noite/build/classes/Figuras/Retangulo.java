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
public class Retangulo extends Quadrado {

  private double altura;

  public Retangulo() {
  }

  public Retangulo(double base, double altura) {
    super(base);
    this.setAltura(altura);
  }

  public void setAltura(double altura) {
    if (altura > 0) {
      this.altura = altura;
    }
  }

  public double getAltura() {
    return this.altura;
  }

  public double area() {
    return getBase() * altura;
  }

  public double volume() {
    return super.area() * altura;
  }

  public void setBase(double base) {
    super.setBase(base);
  }

}
