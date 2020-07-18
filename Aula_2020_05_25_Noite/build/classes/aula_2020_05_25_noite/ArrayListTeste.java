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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTeste {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String antigo, novo;
    int i, indice;
    ArrayList<String> grupoTrabalho = new ArrayList<String>();

    // para grupos de 5 componentes
    for (i = 0; i < 5; i++) {
      System.out.println("Digite o nome do " + (i + 1) + " integrante");
      grupoTrabalho.add(sc.nextLine());
    }
    System.out.println("Número de elementos do grupo: " + grupoTrabalho.size());
    System.out.println("Substituição de um elemento por outro:");
    System.out.println("Digite o nome do componente a ser substituído:");
    antigo = sc.nextLine();
    indice = grupoTrabalho.indexOf(antigo);
    System.out.println("O Componente " + grupoTrabalho.get(indice) + " Será substituído.");
    System.out.println("Digite o nome do componente novo:");
    novo = sc.nextLine();
    grupoTrabalho.set(indice, novo);

    System.out.println("Retirada de um elemento do grupo:");
    System.out.println("Digite o nome do componente a ser eliminado:");
    antigo = sc.nextLine();
    indice = grupoTrabalho.indexOf(antigo);
    grupoTrabalho.remove(indice);
    System.out.println("Grupo atual - Número de elementos do grupo: " + grupoTrabalho.size());
    System.out.println("Elementos do grupo: ");
    Iterator<String> iterator = grupoTrabalho.iterator();
    i = 0;
    while (iterator.hasNext()) {
      System.out.println("Posição " + i + " tem o componente: " + iterator.next());
      i++;
    }
    System.out.println("Limpando o ArrayList:");
    grupoTrabalho.clear();
    System.out.println("Número de Elementos do grupo:" + grupoTrabalho.size());

    sc.close();
  }

}
