/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiorelogio_noite;

import java.util.Scanner;

/**
 *
 * @author sicsu
 */
public class Radio {
  String tipoFrequencia;
  double faixa;
  String memoria1, memoria2, memoria3;
 // Métodos de Acesso
  public String getTipoFrequencia() {
    return tipoFrequencia;
  }

  public void setTipoFrequencia(String tipoFrequencia) {
    this.tipoFrequencia = tipoFrequencia;
  }

  public double getFaixa() {
    return faixa;
  }

  public void setFaixa(double faixa) {
    this.faixa = faixa;
  }

  public String getMemoria1() {
    return memoria1;
  }

  public void setMemoria1(String memoria1) {
    this.memoria1 = memoria1;
  }

  public String getMemoria2() {
    return memoria2;
  }

  public void setMemoria2(String memoria2) {
    this.memoria2 = memoria2;
  }

  public String getMemoria3() {
    return memoria3;
  }

  public void setMemoria3(String memoria3) {
    this.memoria3 = memoria3;
  }
  // Métodos construtores
  public Radio() {  }
  
  
  public Radio(String tipoFrequencia, double faixa) {
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
  }
  public Radio(String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
    this.memoria1 = memoria1;
    this.memoria2 = memoria2;
    this.memoria3 = memoria3;
  }
  // Métodos especiais
  public void imprimir(){
    System.out.println(String.format("Rádio    : %-5s Faixa:%.1f", tipoFrequencia, faixa ));
    System.out.println(String.format("Memória 1: %s", memoria1));
    System.out.println(String.format("Memória 2: %s", memoria2));
    System.out.println(String.format("Memória 3: %s", memoria3));
  }

  public void entrada(){
    Scanner ent = new Scanner(System.in);
    System.out.println("Hora        :");
    System.out.println("Tipo Frequência:");
    setTipoFrequencia(ent.nextLine());
    System.out.println("Frequência:");
    setFaixa(Double.parseDouble(ent.nextLine()));
    System.out.println("Memoria 1:");
    setMemoria1(ent.nextLine());
    System.out.println("Memoria 2:");
    setMemoria2(ent.nextLine());
    System.out.println("Memoria 3:");
    setMemoria3(ent.nextLine());
  }
  public void cadastrar(String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
    this.memoria1 = memoria1;
    this.memoria2 = memoria2;
    this.memoria3 = memoria3;
  } 
}
