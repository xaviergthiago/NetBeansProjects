/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_06_01_noite;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sicsu
 */
public class Aula_2020_06_01_Noite {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner ent = new Scanner(System.in);
    Carro carro = new Carro();
    int valor1, valor2, divisao;
    boolean continua = true;
    int vetor[] = new int[5];
    /*while (continua) {
      try {
        System.out.println("Digite o valor1:");
        valor1 = Integer.parseInt(ent.nextLine());
        System.out.println("O valor1 é:" + valor1);
        System.out.println("Digite o valor2:");
        valor2 = ent.nextInt();
        System.out.println("O valor2 é:" + valor2);
        divisao = valor1 / valor2;
        System.out.println("A divisão é:" + divisao);
        carro.entrada();
        vetor[6] = 10;
        continua = false;
      } catch (NumberFormatException e) {
        System.out.println("Gerou uma exceção de entrada de dados do valor 1!");
        System.out.println(e.getMessage());
      } catch (InputMismatchException e) {
        System.out.println("Gerou uma exceção de entrada de dados do valor 2!");
        System.out.println(e.getMessage());
      } catch (ArithmeticException e) {
        System.out.println("Gerou uma exceção aritmética!");
        System.out.println(e.getMessage());
      } catch (RuntimeException e) {
        System.out.println("Gerou uma exceção capturada em Exception!");
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println("Gerou uma exceção capturada em Exception!");
        System.out.println(e.getMessage());
      } finally {
        ent.nextLine();
      }
    }*/
    try {
      Apoio a = new Apoio();
      System.out.println("Digite o número para calcular o Fatorial :");
      System.out.println("O Fatorial é:" + a.fatorial(Integer.parseInt(ent.nextLine())));
    } catch (IllegalArgumentException e) {
      System.out.println("Gerou uma exceção de argumento!");
      System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Gerou uma exceção capturada em Exception!");
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Gerou uma exceção capturada em Exception!");
      System.out.println(e.getMessage());
    }
  }
}
