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
import Classes.*;
public class VetorObjetos {
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor monit[] = new Monitor[5];// declaração
        for(int i=0; i<5; i++){
            monit[i] = new Monitor();// Instanciação de cada objeto
            // nome_do_vetor[índice].nome_do_método
            monit[i].entradaDados();
        }
        for(int i=0; i<5; i++){
            System.out.println("***************************");
            monit[i].imprimir();
            System.out.println("***************************");
        }
    } 
}
