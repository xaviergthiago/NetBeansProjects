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
public class RadioRelogio {
  int hora, minuto, segundo;
  int horaAlarme, minutoAlarme;
  String tipoFrequencia;
  double faixa;
  String memoria1, memoria2, memoria3;
 // Métodos de Acesso
  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public int getHoraAlarme() {
    return horaAlarme;
  }

  public void setHoraAlarme(int horaAlarme) {
    this.horaAlarme = horaAlarme;
  }

  public int getMinutoAlarme() {
    return minutoAlarme;
  }

  public void setMinutoAlarme(int minutoAlarme) {
    this.minutoAlarme = minutoAlarme;
  }

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
  public RadioRelogio() {  }
  
  public RadioRelogio(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }
  public RadioRelogio(int horaAlarme, int minutoAlarme) {
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
  }
  public RadioRelogio(String tipoFrequencia, double faixa) {
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
  }
  public RadioRelogio(int hora, int minuto, int segundo, String tipoFrequencia, double faixa) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
  }  
  public RadioRelogio(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme, String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
    this.memoria1 = memoria1;
    this.memoria2 = memoria2;
    this.memoria3 = memoria3;
  }
  // Métodos especiais
  public void imprimir(){
    System.out.println(String.format("Horário  : %02d:%02d:%02d", hora, minuto, segundo));
    System.out.println(String.format("Alarme   : %02d:%02d", horaAlarme, minutoAlarme));
    System.out.println(String.format("Rádio    : %-5s Faixa:%.1f", tipoFrequencia, faixa ));
    System.out.println(String.format("Memória 1: %s", memoria1));
    System.out.println(String.format("Memória 2: %s", memoria2));
    System.out.println(String.format("Memória 3: %s", memoria3));
  }

  public void entrada(){
    Scanner ent = new Scanner(System.in);
    System.out.println("Hora        :");
    setHora(Integer.parseInt(ent.nextLine()));
    System.out.println("Minuto      :");
    setMinuto(Integer.parseInt(ent.nextLine()));
    System.out.println("Segundo      :");
    setSegundo(Integer.parseInt(ent.nextLine()));
    System.out.println("Hora Alarme  :");
    setHoraAlarme(Integer.parseInt(ent.nextLine()));
    System.out.println("Minuto Alarme:");
    setMinutoAlarme(Integer.parseInt(ent.nextLine()));
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
  public void cadastrar(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme, String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
    this.tipoFrequencia = tipoFrequencia;
    this.faixa = faixa;
    this.memoria1 = memoria1;
    this.memoria2 = memoria2;
    this.memoria3 = memoria3;
  }  
}
