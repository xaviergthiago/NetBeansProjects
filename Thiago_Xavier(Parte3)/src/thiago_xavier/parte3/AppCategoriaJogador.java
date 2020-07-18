package thiago_xavier.parte3;

import java.util.Scanner;

public class AppCategoriaJogador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoriaJogador cj = new CategoriaJogador();
        System.out.println("Digite a idade do jogador: ");
        cj.setIdade(Integer.parseInt(sc.nextLine()));

        if (cj.getIdade() >= 0 && cj.getIdade() <= 10) {
            System.out.println("Categoria Mirim");
        } else if (cj.getIdade() > 10 && cj.getIdade() <= 18) {
            System.out.println("Categoria Juvenil");
        } else if (cj.getIdade() > 18 && cj.getIdade() <= 40) {
            System.out.println("Categoria Adulto");
        } else if (cj.getIdade() > 40) {
            System.out.println("Categoria Master");
        } else {
            System.out.println("Idade inválida");
        }

    }
}
