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
public class Vetor4 {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        int auxiliar;
        for(int i=0; i<10; i++) {
            vetor[i]= (20- i*2);// cria na ordem descrescente
            vetor[i]= (i*2);// cria na ordem crescente
        }
        System.out.println("Vetor antes da ordenação:");
        for(int i=0; i<10; i++) {
            System.out.println(vetor[i]);
        }
        for (int i=0; i<9; i++) {
            for (int j=i+1; j<10; j++) {
		//if(vetor[i] > vetor[j]) {// coloca na ordem crescente
                if(vetor[i] < vetor[j]) {// coloca na ordem decrescente
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
        System.out.println("Vetor depois da ordenação:");
        for(int i=0; i<10; i++) {
            System.out.println(vetor[i]);
        }
    }		
}