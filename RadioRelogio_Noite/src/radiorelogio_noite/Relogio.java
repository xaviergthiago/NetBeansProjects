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
public class Relogio {
    int hora, minuto, segundo;
  int horaAlarme, minutoAlarme;
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

  // Métodos construtores
  public Relogio() {  }
  
  public Relogio(int hora, int minuto, int segundo) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
  }
  public Relogio(int horaAlarme, int minutoAlarme) {
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
  }
  
  public Relogio(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
  }
  // Métodos especiais
  public void imprimir(){
    System.out.println(String.format("Horário  : %02d:%02d:%02d", hora, minuto, segundo));
    System.out.println(String.format("Alarme   : %02d:%02d", horaAlarme, minutoAlarme));
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
  }
  public void cadastrar(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme) {
    this.hora = hora;
    this.minuto = minuto;
    this.segundo = segundo;
    this.horaAlarme = horaAlarme;
    this.minutoAlarme = minutoAlarme;
  } 
}
