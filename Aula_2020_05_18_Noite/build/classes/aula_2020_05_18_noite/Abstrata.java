/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_18_noite;

/**
 *
 * @author sicsu
 */
public abstract class Abstrata {

  String nome;
  int idade;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public Abstrata() {
  }

  public Abstrata(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  
  // método abstrato
  // regra de obrigação
  public abstract void abstrato();
  
  public void abstrato(int i){  }
  
  //public abstract void frear();
  
  
  // demais métodos (imprimir, entradaDados, cadastrar).

}
