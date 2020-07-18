package thiago_xavier.parte2;

import java.util.Scanner;

public class Parte2_Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo;
        double velocidade, distancia;

        System.out.println("Digite o tempo de viagem gasto em horas: ");
        tempo = (Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a velocidade em km/h: ");
        velocidade = (Double.parseDouble(sc.nextLine()));
        distancia = (float) tempo * velocidade;

        System.out.println("A velocidade média é: " + velocidade);
        System.out.println("O tempo gasto para viagem é: " + tempo);
        System.out.println("A distância percorrida em km é " + distancia);
        System.out.println("A quantidade de litros gastos é " + distancia / 12);

    }

}
