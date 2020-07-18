package aplicacoes.parte10;

import java.util.Scanner;
import classes.parte10.Geladeira;

public class AppGeladeira {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geladeira g1 = new Geladeira(6.0, 10.0);
        System.out.printf("A temperatura máxima é %.2f e a mínima é %.2f. \n", g1.getTemperaturaMaxima(), g1.getTemperaturaMinima());
        System.out.println("");
        Geladeira g2 = new Geladeira();
        System.out.print("Digite o preço: ");
        g2.setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("O valor com desconto de 15 por cento é: " + g2.desconto());
        System.out.println("");
        Geladeira g3 = new Geladeira(72.5, 70.1, false, 72.5, 70.1, false);
        g3.porta1.imprimir();
        g3.porta2.imprimir();
    }
}
