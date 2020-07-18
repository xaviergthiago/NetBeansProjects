package aplicacoes.ex11;

import java.util.Scanner;

public class AppTemperaturaSemClasse {

    public static void main(String[] args) {
        double max = 0, min = 100;
        double temperatura[] = new double[30];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.print("Digite uma temperatura: ");
            temperatura[i] = Double.parseDouble(sc.nextLine());

            if (temperatura[i] > max) {
                max = temperatura[i];
            }
            if (temperatura[i] < min) {
                min = temperatura[i];
            }
        }

        System.out.println("A temperatura máxima é: " + max);
        System.out.println("A temperatura mínima é: " + min);
    }
}
