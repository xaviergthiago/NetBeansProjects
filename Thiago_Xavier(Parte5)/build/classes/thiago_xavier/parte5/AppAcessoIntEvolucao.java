package thiago_xavier.parte5;

import java.util.Scanner;

public class AppAcessoIntEvolucao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;
        int token;
        System.out.println("Digite o login ");
        login = sc.nextLine();
        System.out.println("Digite a senha ");
        senha = sc.nextLine();

        AcessoIntEvolucao a = new AcessoIntEvolucao();
        System.out.println(a.acessar(login, senha));

        System.out.println("Digite o token ");
        token = (Integer.parseInt(sc.nextLine()));
        AcessoIntEvolucao a2 = new AcessoIntEvolucao();
        System.out.println(a2.acessar(login, senha, token));
    }

}
