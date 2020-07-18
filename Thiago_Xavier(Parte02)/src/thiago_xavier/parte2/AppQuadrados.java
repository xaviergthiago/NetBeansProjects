package thiago_xavier.parte2;

import java.util.Scanner;

public class AppQuadrados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quadrados q = new Quadrados();
        System.out.println("Digite o valor de a: ");
        q.setA(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor de b: ");
        q.setB(Integer.parseInt(sc.nextLine()));
        System.out.println("O quadrado da diferença é: " + (q.getA() - q.getB()) * (q.getA() - q.getB()));
        System.out.println("A diferença dos quadrados é: " + ((q.getA() * q.getA()) - (q.getB() * q.getB())));

    }

}