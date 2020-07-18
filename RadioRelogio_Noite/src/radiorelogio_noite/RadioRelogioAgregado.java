/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiorelogio_noite;

/**
 *
 * @author sicsu
 */
public class RadioRelogioAgregado {

  Radio radio;
  Relogio relogio;
  // Métodos construtores

  public RadioRelogioAgregado() {
    radio = new Radio();
    relogio = new Relogio();
  }

  public RadioRelogioAgregado(int hora, int minuto, int segundo) {
    relogio = new Relogio(hora, minuto, segundo);
    radio = new Radio();
  }

  public RadioRelogioAgregado(int horaAlarme, int minutoAlarme) {
    relogio = new Relogio(horaAlarme, minutoAlarme);
    radio = new Radio();
  }

  public RadioRelogioAgregado(String tipoFrequencia, double faixa) {
    radio = new Radio(tipoFrequencia, faixa);
    relogio = new Relogio();
  }

  public RadioRelogioAgregado(int hora, int minuto, int segundo, String tipoFrequencia, double faixa) {
    relogio = new Relogio(hora, minuto, segundo);
    radio = new Radio(tipoFrequencia, faixa);
  }

  public RadioRelogioAgregado(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme, String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    relogio = new Relogio(hora, minuto, segundo, horaAlarme, minutoAlarme);
    radio = new Radio(tipoFrequencia, faixa, memoria1, memoria2, memoria3);
  }

  // Novo COnstrutor
  public RadioRelogioAgregado(Radio radio, Relogio relogio) {
    this.radio = radio;
    this.relogio = relogio;
  }

  public void imprimir() {
    relogio.imprimir();
    radio.imprimir();
  }

  public void entrada() {
    relogio.entrada();
    radio.entrada();
  }

  public void cadastrar(int hora, int minuto, int segundo, int horaAlarme, int minutoAlarme, String tipoFrequencia, double faixa, String memoria1, String memoria2, String memoria3) {
    relogio.cadastrar(hora, minuto, segundo, horaAlarme, minutoAlarme);
    radio.cadastrar(tipoFrequencia, faixa, memoria1, memoria2, memoria3);
  }
}
