/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFiguras;

import Figuras.Quadrado;
import Figuras.Retangulo;
/**
 *
 * @author sicsu
 */
public class Encapsulamento {

  public static void main(String[] args) {
   /*
    double lado = 6.0;
    Quadrado q1 = new Quadrado(lado);
    //q1.base=lado;
    //q1.setBase(lado);
    System.out.println("Q1 - Area = " + q1.area());
*/
    double lado = 5.0, altura;
    Quadrado q1 = new Quadrado(lado);
    // q1.base = lado;	  	Base has protected access in Enc.Quadrado
    // q1.setBase(lado); 	//setBase(double) has protected access in Enc.Quadrado
    altura = 6.0;
    Retangulo r1 = new Retangulo();
    // r1.base = lado;		Base has protected access in Enc.Quadrado
    // r1.setBase(lado);	setBase(double) has protected access in Enc.Quadrado
    //q1.setBase(lado);
    r1.setBase(lado);
    r1.setAltura(altura);
    System.out.println("R1 - Area = " + r1.area());
  }

}
