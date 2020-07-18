/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triatleta;

/**
 *
 * @author sicsu
 */
public class Interfaces {

  public static void main(String[] args) {

    Triatleta triatleta = new Triatleta("André", 85.4, 1.85);
    triatleta.aquecer();
    triatleta.nadar();
    triatleta.correrBicicleta();
    triatleta.correr();
    System.out.println("Idade Mínima:" + triatleta.IDADEMINIMA);
    triatleta.getIDADEMINIMA();

    //triatleta.IDADEMINIMA = 20;
    /*
         Esta instrução tenta alterar o valor do atributo IDADEMINIMA.
         Erro: cannot assign a value to final variable IDADEMINIMA
     */
  }
}
