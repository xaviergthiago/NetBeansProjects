package thiago_xavier.parte2;

import java.util.Scanner;

public class AppLitrosUsados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LitrosUsados lu = new LitrosUsados();

        System.out.println("Digite o tempo de viagem gasto em horas: ");
        lu.setTempo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a velocidade em km/h: ");
        lu.setVelocidade(Double.parseDouble(sc.nextLine()));

        System.out.println("A velocidade média é: " + lu.getVelocidade());
        System.out.println("O tempo gasto para viagem é: " + lu.getTempo());
        System.out.println("A distância percorrida em km é " + (lu.getVelocidade()) * +(lu.getTempo()));
        System.out.println("A quantidade de litros gastos é " + (lu.getVelocidade()) * +(lu.getTempo()) / 12);

    }

}
