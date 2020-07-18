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
public class Triatleta extends Humano implements Nadar, Correr, Ciclista {

  public Triatleta(String nome, double peso, double altura) {
    super(nome, peso, altura);
  }

  public void aquecer() {
    System.out.println(this.getNome() + " está aquecendo");
  }

  public void nadar() {
    System.out.println(this.getNome() + " está nadando");
  }

  public void correr() {
    System.out.println(this.getNome() + " está correndo");
  }

  public void correrBicicleta() {
    System.out.println(this.getNome() + " está correndo de bicicleta");
  }

  public void getIDADEMINIMA() {
    System.out.println("Idade Mínima" + IDADEMINIMA + " anos");
  }
} // Os métodos abstratos são aqui definidos 

