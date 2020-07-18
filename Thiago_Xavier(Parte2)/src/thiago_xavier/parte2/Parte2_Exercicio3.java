package thiago_xavier.parte2;

import java.util.Scanner;

public class Parte2_Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o valor de a: ");
        a = (Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor de b: ");
        b = (Integer.parseInt(sc.nextLine()));
        System.out.println("O quadrado da diferença é: " + (a - b) * (a - b));
        System.out.println("A diferença dos quadrados é: " + ((a * a) - (b * b)));

    }

}
