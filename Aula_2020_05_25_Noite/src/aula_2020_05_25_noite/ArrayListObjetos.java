/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_25_noite;

/**
 *
 * @author sicsu
 */
import Classes.Monitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListObjetos {
  public static void main(String[] args) {
    // TODO code application logic here
    boolean continua = true;
    int escolha = 0;
    Scanner ent = new Scanner(System.in);
    // criar o ArrayList
    ArrayList<Monitor> arrayMonitores = new ArrayList<Monitor>();
 // enquanto tiver novos objetos
    while (continua) {
      // cria um objeto auxiliar
      Monitor aux = new Monitor();
      // realiza a entrada de dados
      aux.entradaDados();
      // adiciona ao arrayList
      arrayMonitores.add(aux);
      // verifica se vai incluir novos objetos
      System.out.println("Inserir novo (1-Sim, 2- São)?");
      // ler a resposta do usuário
      escolha = Integer.parseInt(ent.nextLine());
      // verifica a resposta do usuário
      if (escolha != 1) {
        continua = false;
      }
    }
 // cria um iterator para Monitor
    Iterator<Monitor> iterator = arrayMonitores.iterator();
    // enquanto houver Monitores
    while (iterator.hasNext()) {
      System.out.println("***************************");
      // lê o próximo elemento e imprimi
      iterator.next().imprimir();
    }
  }
}
