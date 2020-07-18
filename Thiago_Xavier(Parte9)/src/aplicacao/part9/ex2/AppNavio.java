package aplicacao.part9.ex2;

import classes.parte9.ex2.Navio;

public class AppNavio {

    public static void main(String[] args) {
        Navio n1 = new Navio(500, 900, "Diesel", 600, 1200, "Diesel", "Araraquara");
        n1.setNumeroPassageiros(500);
        n1.setNumeroTripulantes(50);
        n1.imprimir();
        System.out.println("A relação de passageiros por tripulantes é: " + n1.passageirosPorTripulantes());
        System.out.println("");

        Navio n2 = new Navio();
        n2.entradaDados();
        n2.imprimir();
        System.out.println("");

        Navio n3 = new Navio();
        n3.motor1.setRotacaoMaxima(1200);
        n3.motor1.setRotacaoAtual(900);
        n3.motor1.desacelerar();
        n3.motor1.imprimir();

        n3.motor2.setRotacaoMaxima(800);
        n3.motor2.setRotacaoAtual(500);
        n3.motor2.acelerar();
        n3.motor2.imprimir();
    }
}
