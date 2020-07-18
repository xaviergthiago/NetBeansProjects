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
public class RadioRelogio_Noite {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    RadioRelogio radioRelogio = new RadioRelogio(20, 22, 8, "FM", 102.9);
    radioRelogio.imprimir();

    RadioRelogioAgregado rra2 = new RadioRelogioAgregado(20, 22, 8, "FM", 102.9);
    rra2.imprimir();

    RadioRelogioAgregado rra = new RadioRelogioAgregado();
    rra.radio.setTipoFrequencia("FM");
    rra.radio.setFaixa(103.7);
    rra.relogio.setHora(20);
    rra.relogio.setMinuto(36);
    rra.relogio.setSegundo(2);
    rra.imprimir();
    
    Radio radio = new Radio("FM", 102.9);
    Relogio relogio= new Relogio(20, 59, 8);
    RadioRelogioAgregado rra3 = new RadioRelogioAgregado(radio, relogio);
    rra3.imprimir();
    relogio.setHora(21);
    rra3.imprimir();
    rra3 = null;
    radio.imprimir();
    relogio.imprimir();

    
    
    rra2 = null;
    rra2.radio.imprimir();
    rra2.relogio.imprimir();
    rra2.imprimir();
    
    

  }

}
