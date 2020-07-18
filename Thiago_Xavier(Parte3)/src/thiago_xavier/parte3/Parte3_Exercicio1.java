/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thiago_xavier.parte3;

/**
 *
 * @author 20162101911
 */
import java.util.Scanner;

public class Parte3_Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite o valor desejado: ");
        numero = (Integer.parseInt(sc.nextLine()));
        if (((numero % 4) == 0) && ((numero % 3) == 0)) {
            System.out.println("O número é múltiplo de 3 e de 4 ao mesmo tempo: ");
        } else {
            System.out.println("O número NÃO é divisível por 3 e 4 ao mesmo tempo");
        }
    }

}
