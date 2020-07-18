/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_25_noite;

import Classes.Carro;
import java.util.ArrayList;
/**
 *
 * @author sicsu
 */
public class Aula_2020_05_25_Noite {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    /*
    int v[] = new int[10];
    for(int i=0; i<10; i++){
      v[i] = i +1;
    }
    
    for(int i=0; i<10; i++){
      System.out.println( "v[" + i + "] =>" + v[i]);
    }
     */
    /*
    // declaração do vetor:
    double fracoes[] = new double[12];
// preenchimento do vetor
    for (int i = 0; i < 12; i++) {
      fracoes[i] = (double) 1 / (i + 1);
      // Se for apenas i, será gerada uma exceção por tentativa de divisão por zero
    }
// exibição do conteúdo do vetor
    for (int i = 0; i < 12; i++) {
      System.out.println("fracoes[" + i + "] = " + fracoes[i]);
    }
*/
    /*
    Carro carros[] = new Carro[5];
    
    for(int i=0; i<3; i++){
      carros[i] = new Carro();
      carros[i].imprimir();
    }
      for(int i=0; i<5; i++){
      System.out.println("Elemento:" + carros[i]);
    }
    */
    /*
    // declaração do vetor
	String valores[] = new String[5];

// preenchimento do vetor
	valores[0] = new String("Zero");
	valores[1] = new String("Um");
	valores[2] = new String("Dois");
	valores[3] = new String("Três");
	valores[4] = new String("Quatro");

// exibição do conteúdo do vetor
	for (int i=0; i<5; i++) {  
		System.out.println(valores[i]);
	}
*/
    /*
     // declaração do vetor
	String valores[] = {"Zero", "Um", "Dois", "Três", "Quatro"};

// exibição do conteúdo do vetor
	for (int i=0; i<5; i++) {  
		System.out.println(valores[i]);
	}   
    */
      /*  
        // declaração do vetor
	Integer valores[] = new Integer[15];

// preenchimento do vetor
	for (int i=0; i<15; i++) {  
    		valores[i] = new Integer(i);
	}

// exibição do conteúdo do vetor
	for (int i=0; i<15; i++) {
    	    System.out.println("Posicao "+i+": "+valores[i].intValue());
	}
*/
      /*
      Carro carro = new Carro(10);
      carro.rodas[6].diametro=20;
      carro.rodas[6].pressao=44;
      carro.imprimir();
    */
    /*  
       // 12 primeiros termos da seqüência de Fibonacci:
long Fibonacci[] = {1,1,2,3,5,8,13,34,55,89,144};

// Tabela de sen(n*pi/6), n=0,1,2,...5
float seno[] = {0.0000f,0.5000f,0.8660f,1.0000f,0.8660f,0.5000f};

// Tabela de log(1+n), n=0,2...99:
double tlog[] = new double[100];
for(int n=0; n<100; n++){
  tlog[n] = Math.log(1+n);
}
// Matriz de coeficientes
int A[][] = { {1,2,3}, {0,1,3}, {0,0,-1} };
for(int l=0; l<3; l++){
  for(int c=0; c<3; c++){
    System.out.printf("\t %3d", A[l][c]);
  }
  System.out.println();
}

*/
    
    ArrayList<Carro> arrayCarros= new ArrayList<Carro>();// cria 10 elementos
    ArrayList<Carro> arrayCarros2= new ArrayList<Carro>(100);// cria 100 elementos
    
      
  }
}
