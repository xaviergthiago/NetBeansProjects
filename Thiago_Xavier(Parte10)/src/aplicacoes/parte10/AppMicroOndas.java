package aplicacoes.parte10;

import java.util.Scanner;
import classes.parte10.MicroOndas;

public class AppMicroOndas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MicroOndas m1 = new MicroOndas(850, 1200);
        System.out.print("A potência máxima é " +m1.getPotenciaMaxima() +" e a mínima é " +m1.getPotenciaMinima());
        System.out.println("");
        MicroOndas m2 = new MicroOndas();
        System.out.print("Digite o preço: ");
        m2.setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("O valor com desconto de 12 por cento é: " + m2.desconto());
        System.out.println("");
        MicroOndas m3 = new MicroOndas("Consul", "Cromado", 53.9, 43.0, true);
        m3.porta1.imprimir();
        System.out.printf("A marca é %s e o modelo é %s. ", m3.getMarca(), m3.getModelo());
    }
}
