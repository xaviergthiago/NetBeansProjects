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
public class Humano {

  private String nome, endereco;
  private double peso, altura;

  public Humano(String nome, double peso, double altura) {
    this.setNome(nome);
    this.setPeso(peso);
    this.setAltura(altura);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public double getPeso() {
    return this.peso;
  }

  public double getAltura() {
    return this.altura;
  }
}
