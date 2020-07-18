package thiago_xavier.parte2;

import java.util.Scanner;

public class Parte2_Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, altura, volume;
        System.out.println("Digite o valor do raio: ");
        raio = (Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a altura da lata ");
        altura = (Double.parseDouble(sc.nextLine()));
        volume = (float) raio * raio * altura * 3.14159;
        System.out.println("O volume da lata de óleo é: " + volume);

    }
}
