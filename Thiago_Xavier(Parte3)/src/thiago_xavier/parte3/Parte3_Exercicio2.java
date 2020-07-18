package thiago_xavier.parte3;

import java.util.Scanner;

public class Parte3_Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade em anos do jogador: ");
        idade = (Integer.parseInt(sc.nextLine()));
        if (idade <= 10) {
            System.out.println("Categoria Mirim");
        } else if (idade > 10 && idade <= 18) {
            System.out.println("Categoria Juvenil");
        } else if (idade > 18 && idade <= 40) {
            System.out.println("Categoria Adulto");
        } else {
            System.out.println("Categoria Master");
        }

    }
}
