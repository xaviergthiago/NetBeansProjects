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
public class Carro {
  
  public String placa, cor;
  public Roda rodas[];
  public Carro(int numeroRodas){
    this.placa = "ABC1A234";
    this.cor = "Azul";
    rodas = new Roda[numeroRodas];
    for(int i=0; i<numeroRodas; i++){
      rodas[i] = new Roda();
  }
    
  }
  public void imprimir(){
    System.out.println("Placa:" + this.placa);
    System.out.println("Cor  :" + this.cor);
    for(int i=0; i<rodas.length; i++){
      System.out.println("Roda[" + i + "]: Pressão=" + rodas[i].pressao + " Diâmetro=" + rodas[i].diametro);
  }
    
  }
  
}
