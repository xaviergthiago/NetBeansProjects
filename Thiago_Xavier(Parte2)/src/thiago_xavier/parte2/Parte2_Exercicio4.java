package thiago_xavier.parte2;

import java.util.Scanner;

public class Parte2_Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real, dolar;
        System.out.println("Digite o valor do produto em reais: ");
        real = (Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o valor do dolar em reais: ");
        dolar = (Double.parseDouble(sc.nextLine()));
        System.out.println("O valor do produto em dólares é: " + real / dolar);

    }

}
