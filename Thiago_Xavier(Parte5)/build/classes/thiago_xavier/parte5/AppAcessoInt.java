package thiago_xavier.parte5;

import java.util.Scanner;

public class AppAcessoInt{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;
        System.out.println("Digite o login ");
        login = sc.nextLine();
        System.out.println("Digite a senha ");
        senha = sc.nextLine();

        AcessoInt a = new AcessoInt();
        System.out.println(a.acessar(login, senha));
    }

}
