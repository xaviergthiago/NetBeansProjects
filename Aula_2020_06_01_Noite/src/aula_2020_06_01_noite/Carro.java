/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_06_01_noite;

import java.util.Scanner;

/**
 *
 * @author sicsu
 */
public class Carro {

  double preco;

  public void entrada() {
    Scanner ent = new Scanner(System.in);
    System.out.println("Digite o preço do carro:");
    preco = Double.parseDouble(ent.nextLine());
  }

}
