package thiago_xavier.parte3;

import java.util.Scanner;

public class Parte3_Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, soma = 0;
        while (num != -1) {
            System.out.print("Digite um número: ");
            num = (Integer.parseInt(sc.nextLine()));
            if ((num % 2 == 0) && (num % 3 == 0)) {
                soma = soma + num;
            }
        }
        System.out.println("O valor da soma é " + soma);

    }
}
