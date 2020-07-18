package thiago_xavier.parte5;

import java.util.Scanner;

public class AppQualquer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Qualquer q = new Qualquer();

        System.out.println(q.metodoX(5, 6.0, "Abacaxi"));
        System.out.println(q.metodoX(6.7, "Limão", 8));
        System.out.println(q.metodoX("Gustavo", 60.0, 32));
        System.out.println(q.metodoX("Thiago", 33, 73.5));
                
//        q.metodoX(5, 6.0, "Abacaxi");
//        q.metodoX(6.7, "Limão", 8);
//        q.metodoX("Thiago", 33, 73.5);
//        q.metodoX("Gustavo", 32, 60.0);

//        q.setNome("Maria");
//        System.out.println("Nome: " + q.nome);
//        q.setNome();
//        System.out.println("Nome: " + q.nome);
//        q.setX("Maçã");
//        System.out.println(q.x);
//        q.setX(1234);
//        System.out.println(q.x);
    }

}
