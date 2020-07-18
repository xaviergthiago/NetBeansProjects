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
public class Vetor1 {
    public static void main(String[] args) {
	    double[] notas = new double[5];
	    notas[0] = 5.2;
	    notas[1] = 9.8;
	    notas[2] = 3.2;
	    notas[3] = 6.7;
	    notas[4] = 7.5;
         System.out.println("Exibindo as notas do vetor:");
         for (int i=0; i < notas.length; i++){
	  	  System.out.println(notas[i]);
        }
    }
}	