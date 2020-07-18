/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author sicsu
 */
import java.util.Scanner;

public class Monitor {

  private String resolucao;
  private double preco, potencia;
  private int tamanhoTela, tensao;

  public String getResolucao() {
    return resolucao;
  }

  public void setResolucao(String resolucao) {
    this.resolucao = resolucao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getPotencia() {
    return potencia;
  }

  public void setPotencia(double potencia) {
    this.potencia = potencia;
  }

  public int getTamanhoTela() {
    return tamanhoTela;
  }

  public void setTamanhoTela(int tamanhoTela) {
    this.tamanhoTela = tamanhoTela;
  }

  public int getTensao() {
    return tensao;
  }

  public void setTensao(int tesao) {
    this.tensao = tensao;
  }

  public Monitor() {
  }

  public Monitor(String resolucao, double preco, double potencia,
          int tamanhoTela, int tensao) {
    this.resolucao = resolucao;
    this.preco = preco;
    this.potencia = potencia;
    this.tamanhoTela = tamanhoTela;
    this.tensao = tensao;
  }

  public Monitor(String resolucao, double preco, int tamanhoTela) {
    this.resolucao = resolucao;
    this.preco = preco;
    this.tamanhoTela = tamanhoTela;
  }

  public void cadastrar(String resolucao, double preco, double potencia,
          int tamanhoTela, int tensao) {
    this.resolucao = resolucao;
    this.preco = preco;
    this.potencia = potencia;
    this.tamanhoTela = tamanhoTela;
    this.tensao = tensao;
  }

  public void imprimir() {
    System.out.println("Resolução : " + resolucao);
    System.out.println("Preço     : " + preco);
    System.out.println("Potência  : " + potencia);
    System.out.println("Tamanho   : " + tamanhoTela);
    System.out.println("Tensão    : " + tensao);
  }

  public void entradaDados() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Resolução : ");
    resolucao = sc.nextLine();
    System.out.println("Preço     : ");
    preco = Double.parseDouble(sc.nextLine());
    System.out.println("Potência  : ");
    potencia = Double.parseDouble(sc.nextLine());
    System.out.println("Tamanho   : ");
    tamanhoTela = Integer.parseInt(sc.nextLine());
    System.out.println("Tensão    : ");
    tensao = Integer.parseInt(sc.nextLine());
  }
}
