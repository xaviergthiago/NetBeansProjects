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
public abstract class Humano {

  String nome, sexo;
  int idade;
  double peso, altura;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setIdade(int idade) {
    this.idade = idade;
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

  public String getSexo() {
    return this.sexo;
  }

  public int getIdade() {
    return this.idade;
  }

  public double getPeso() {
    return this.peso;
  }

  public double getAltura() {
    return this.altura;
  }

  public abstract String amamentar();
}
