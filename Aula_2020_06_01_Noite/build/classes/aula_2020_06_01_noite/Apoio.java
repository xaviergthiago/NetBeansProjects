/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_06_01_noite;

/**
 *
 * @author sicsu
 */
public class Apoio {

  public int fatorial(int n) throws IllegalArgumentException, NumberFormatException {
    int fatorial = 1;
    if (n < 0) {
      throw new IllegalArgumentException("n deve ser positivo!");
    }
    if (n >= 32) {
      throw new IllegalArgumentException("n deve ser < 32!");
    }
    for (int i = n; i > 0; i--) {
      fatorial *= i;
    }
    return fatorial;
  }
}
