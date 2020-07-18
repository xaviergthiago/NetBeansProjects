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
public class AppHumano {

  public static void main(String[] args) {
    // TODO code application logic here
    //Humano h1 = new Humano(); --> Humano is abstract; cannot be instantiated
    Homem h1 = new Homem();
    h1.setSexo("Masculino");
    h1.setNome("Joao");
    h1.setIdade(23);
    h1.setPeso(65.4);
    h1.setAltura(1.76);
    h1.setBigode(true);
    h1.setBarba(false);
    h1.setPeitoral(.96);

    Mulher m1 = new Mulher();
    m1.setSexo("Feminino");
    m1.setNome("Maria");
    m1.setIdade(21);
    m1.setPeso(58.4);
    m1.setAltura(1.67);
    m1.setGravidez(false);
    m1.setBusto(.80);
    m1.setCintura(.70);
    System.out.println("Nome: " + h1.getNome() + " Sexo: " + h1.getSexo()
            + " Idade: " + h1.getIdade() + " Peso: " + h1.getPeso() + " Altura: " + h1.getAltura()
            + " Bigode: " + h1.getBigode() + " Barba: " + h1.getBarba() + " Peitoral: "
            + h1.getPeitoral() + " Amamentar: " + h1.amamentar());
    System.out.println("Nome: " + m1.getNome() + " Sexo: " + m1.getSexo()
            + " Idade: " + m1.getIdade() + " Peso: " + m1.getPeso() + " Altura: " + m1.getAltura()
            + " Gravidez: " + m1.getGravidez() + " Busto: " + m1.getBusto() + " Cintura: "
            + m1.getCintura() + " Amamentar: " + m1.amamentar());

  }

}
