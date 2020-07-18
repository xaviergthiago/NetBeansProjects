package thiago_xavier.parte2;

import java.util.Scanner;

public class Parte2_Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendedor;
        int totalVendas;
        double salario, percentual;
        System.out.println("Digite o número do vendedor: ");
        vendedor = (sc.nextLine());
        System.out.println("Digite o salário do vendedor: ");
        salario = (Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o total das vendas: ");
        totalVendas = (Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o percentual ganho sobre o total de vendas ");
        percentual = (Double.parseDouble(sc.nextLine()));
        System.out.println("O número do vendedor é: " + vendedor);
        System.out.println("O salário total do vendedor é " + (salario + (float)(totalVendas * percentual / 10)));

    }
}
