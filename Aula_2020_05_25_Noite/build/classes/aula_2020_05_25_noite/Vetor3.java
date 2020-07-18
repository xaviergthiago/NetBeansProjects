/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_25_noite;

/**
 *
 * @author sicsu
 */
import java.util.Scanner;
public class Vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* declarando dois arrays do tipo int*/
       int[] a1;
       int[] a2;
      /* instanciando os dois arrays */
      a1 = new int[ 10 ]; // array com 10 posições de int
      a2 = new int[ 30 ]; // array com 30 posições de int
      /* imprimindo o tamanho dos array a1 e a2 */
      System.out.println("a1 tamanho : " + a1.length);
      System.out.println("a2 tamanho : " + a2.length);
      /* declarando, instanciando e atribuindo valores ao array notas */
      float[] notas = { 7.5f , 9.0f , 10.0f };
      /* imprimindo as posições do array notas */
      System.out.println("Notas : " + notas[0] + " - " + notas[1] + " - " + notas[2]);
      String[] str =new String[5];
      System.out.println("Digite o seu nome: ");
      String nomeaux = sc.nextLine();
      str[0]=nomeaux;
      str[1]="Joana";
      str[2]="Ana";
      System.out.println("Pessoas : " + str[0] + " - " + str[1] + " - " + str[2]);
        //Percorrendo o array
        for (int z=0; z < str.length;z++){
            System.out.println(str[z]);
       }
    }		
}