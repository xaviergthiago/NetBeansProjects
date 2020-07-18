package thiago_xavier.parte3;

import java.util.Scanner;

public class AppMultiplo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplo m = new Multiplo();
        int soma = 0;
        while (m.getNum() != -1) {
            System.out.print("Digite um número: ");
            m.setNum(Integer.parseInt(sc.nextLine()));
            if ((m.getNum() % 2 == 0) && (m.getNum() % 3 == 0)) {
                soma = soma + m.getNum();
            }
        }
        System.out.println("O valor da soma é " + soma);

    }
}
