package thiago_xavier.parte5;

import java.util.Scanner;

public class AppPendrive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Pendrive p1 = new Pendrive("Samsung", 5, 0.5, 3.0, 6.0, 5.9, 6.6);
//        p1.imprimir();
//        System.out.println("");
//        Pendrive p2 = new Pendrive();
//        p2.imprimir();
//        Pendrive p3 = new Pendrive("Samsung", 1, 1.3, 3.4, 5.1, 9.2, 0.6, "ThunderCat", "TB");
//        p3.imprimir();
        Pendrive p4 = new Pendrive (0.5, 6.4, 3.8, 7.5, 10);
        p4.imprimir();
        System.out.println("");
        Pendrive p5 = new Pendrive ("Kingston", 7, "Power Rangers", "MB");
        p5.imprimir();

       
        
    }

}
