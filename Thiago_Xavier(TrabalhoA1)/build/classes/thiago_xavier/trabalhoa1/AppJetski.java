package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class AppJetski {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jetski j1 = new Jetski();
        j1.entradaDados();
        j1.imprimir();
        System.out.println("Valor do jestski com desconto: " + j1.valorDesconto());
        System.out.println("");

        Jetski j2 = new Jetski();
        j2.cadastrar(15.8, 96.7, "Azul", "ABC-1234", "Yamaha", "Linha FZ (FZR e FZS)", "bi-convexo", 300, 75, true);
        j2.imprimir();
        System.out.println("Valor do jetski com desconto: " + j2.valorDesconto());
        System.out.println("");

        Jetski j3 = new Jetski(96.7, "Verde", "CAB-3142", "Sea Doo", "RXP-X 260", "bi-concavo", 700, 58, false, 19.8);
        j3.imprimir();
        System.out.println("");

        Jetski j4 = new Jetski("Amarela", "DEF-5678", "Kawasaki", "Ultra 300x", "bi-côncavo", 10, 80, false, 20.9, 100);
        j4.imprimir();
        System.out.println("");

        Jetski j5 = new Jetski("Yamaha", "Linha FZ (FZR e FZS)", "bi-côncavo", 35, 75, true, 58.9, 80, "Branca", "EDF-6587");
        j5.imprimir();
        System.out.println("");

        Jetski j6 = new Jetski(97, 48, true, 76.3, 34, "Preta", "TGX-1910", "Kawasaki", "Ultra 300x", "bi-convexo");
        j6.imprimir();
    }

}
