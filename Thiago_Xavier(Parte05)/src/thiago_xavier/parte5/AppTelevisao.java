package thiago_xavier.parte5;

import java.util.Scanner;

public class AppTelevisao {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Televisao t1 = new Televisao(14, 127, true, "LG", 5.3, 'A');
        t1.imprimir();
        System.out.println("");

        Televisao t2 = new Televisao(110, false, "Philips", 2, 'P', 29);
        t2.imprimir();
        System.out.println("");

        Televisao t3 = new Televisao(true, "Philco", 2.3, 'B', 50, 127);
        t3.imprimir();
        System.out.println("");

        Televisao t4 = new Televisao("Samsung", 0.5, 'P', 43, 127, true);
        t4.imprimir();
        System.out.println("");

        Televisao t5 = new Televisao(3.6, 'B', 45, 220, false, "Sony");
        t5.imprimir();

    }
}
