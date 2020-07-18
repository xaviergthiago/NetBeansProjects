package thiago_xavier.parte3;

import java.util.Scanner;

public class Parte3_Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Digite o prineiro número ");
        i = (Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o segundo número ");
        j = (Integer.parseInt(sc.nextLine()));

        if (i > j) {
            System.out.println("O primeiro número não deve maior que o segundo ");
        } else {

            for (int aux = i; aux <= j; aux++) {
                if (aux % 2 == 0) {
                    System.out.println(aux);
                }
            }
        }
    }
}
