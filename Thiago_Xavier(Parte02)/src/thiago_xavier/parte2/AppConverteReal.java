package thiago_xavier.parte2;

import java.util.Scanner;

public class AppConverteReal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConverteReal cv = new ConverteReal();

        System.out.println("Digite o valor do produto em reais: ");
        cv.setReal(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o valor do dolar em reais: ");
        cv.setDolar(Double.parseDouble(sc.nextLine()));
        System.out.println("O valor do produto em dólares é: " + cv.getReal() / cv.getDolar());

    }
}
