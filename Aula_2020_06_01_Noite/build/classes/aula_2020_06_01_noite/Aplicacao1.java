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
public class Aplicacao1 {

  public static void main(String args[]) {
    try {
      int a[] = new int[2]; // Declaração de vetor de 2 elementos
      System.out.println(a[4]); // Tentativa de impressão do conteúdo do elemento de índice 4.
    } catch (ArrayIndexOutOfBoundsException e) {
      // tratamento da exceção imprime a mensagem que causou a exceção
      System.out.println("Exceção gerada: " + e.getMessage());
      // imprime a pilha de erros gerados
      System.out.println("\nPilha de erros");
      e.printStackTrace();
      System.out.println("Você tentou acessar um índice fora da faixa de escopo do vetor");
    } finally {
      System.out.println("O finally é sempre executado");
    }
  }
}
