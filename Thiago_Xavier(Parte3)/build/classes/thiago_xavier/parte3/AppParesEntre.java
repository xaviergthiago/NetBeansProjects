package thiago_xavier.parte3;

import java.util.Scanner;

public class AppParesEntre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParesEntre pe = new ParesEntre();
        int i;
        System.out.println("Digite o primeiro número ");
        pe.setI(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o segundo número ");
        pe.setJ(Integer.parseInt(sc.nextLine()));

        if (pe.getI() > pe.getJ()) {
            System.out.println("O primeiro número não deve maior que o segundo ");
        } else {
            System.out.printf("Os pares entre %d e %d são ", pe.getI(), pe.getJ());
            for (i = pe.getI(); i <= pe.getJ(); i++) {
                if (i % 2 == 0) {
                    System.out.printf("%d, ", i);
                }
            }
        }
    }
}
