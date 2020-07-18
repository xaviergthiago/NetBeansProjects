package thiago_xavier.parte5;

import java.util.Scanner;

public class AppGeladeira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Geladeira g1 = new Geladeira(2, 5, 1000000, 1500.00f, 'C', "Cônsul");
        g1.imprimir();
        System.out.println("");

        Geladeira g2 = new Geladeira(14, 100001, 1250.00f, 'A', "Brastemp", 3);
        g2.imprimir();
        System.out.println("");

        Geladeira g3 = new Geladeira(100011, 7470.00f, 'P', "Electrolux", 1, 1);
        g3.imprimir();
        System.out.println("");

        Geladeira g4 = new Geladeira(5300.00f, 'B', "Continental", 7, 3, 101111);
        g4.imprimir();
        System.out.println("");

        Geladeira g5 = new Geladeira(990.00f, 'C', "Esmaltec", 2, 4, 100111);
        g5.imprimir();

    }

}
