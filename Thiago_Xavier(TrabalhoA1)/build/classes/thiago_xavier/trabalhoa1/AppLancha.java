package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class AppLancha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lancha l1 = new Lancha();
        l1.entradaDados();
        l1.imprimir();
        System.out.println("Valor da lancha com desconto: " + l1.valorDesconto());
        System.out.println("");

        Lancha l2 = new Lancha();
        l2.cadastrar(15.8, 96.7, "Azul", "ABC-1234", "FS Yachts", "flybridge", "bi-convexo", 300, 75, true);
        l2.imprimir();
        System.out.println("Valor da lancha com desconto: " + l2.valorDesconto());
        System.out.println("");

        Lancha l3 = new Lancha(96.7, "Verde", "CAB-3142", "FS Yachts", "flybridge", "bi-concavo", 700, 58, false, 19.8);
        l3.imprimir();
        System.out.println("");

        Lancha l4 = new Lancha("Amarela", "DEF-5678", "Cimitarra Yachts", "Lancha com multicasco", "bi-côncavo", 10, 80, false, 20.9, 100);
        l4.imprimir();
        System.out.println("");

        Lancha l5 = new Lancha("NX Boats", "Lancha de pesca", "bi-côncavo", 35, 75, true, 58.9, 80, "Branca", "EDF-6587");
        l5.imprimir();
        System.out.println("");

        Lancha l6 = new Lancha(97, 48, true, 76.3, 34, "Preta", "TGX-1910", "Royal Mariner", "Lancha offshore", "bi-convexo");
        l6.imprimir();
    }

}
