/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Humano;

/**
 *
 * @author sicsu
 */
public class ClassesAbstratas {
     public static void main(String[] args) {
        Homem h1 = new Homem();
        Mulher m1 = new Mulher();
        Humano hu1 = new Homem();
        Humano hu2 = new Mulher();
        System.out.println("Homem:" + h1.amamentar());
        System.out.println("Mulher:" + m1.amamentar());
        System.out.println("Humano(H):" + hu1.amamentar());
        System.out.println("Humano(M):" +hu2.amamentar());
        
        //hu1.
        //hu2.
        
    }  

  
}
