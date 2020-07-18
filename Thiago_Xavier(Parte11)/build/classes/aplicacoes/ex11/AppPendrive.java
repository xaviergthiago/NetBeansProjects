package aplicacoes.ex11;

import classes.parte11.Pendrive;

public class AppPendrive {

    public static void main(String args[]) {
        double preco = 0;
        int cap = 0, qtd = 0;
        Pendrive pd[] = new Pendrive[10];

        for (int i = 0; i < 10; i++) {
            pd[i] = new Pendrive();
            pd[i].entradaDadosRelatorio();
            System.out.println("");
            preco = preco + pd[i].getPreco();
            cap = cap + pd[i].getCapacidade();
            qtd = qtd + pd[i].getQuantidade();
        }

        System.out.printf("%-15s %-20s %-25s %-30s\n", "Marca", "Modelo", "Capacidade", "Preço");
        System.out.printf("%-15s %-20s %-25s %-30s\n", "-----", "------", "----------", "-----");

        for (int i = 0; i < 10; i++) {
            pd[i].imprimirRelatorio();
        }

        System.out.printf("%-15s %-20s %-25s %-30s\n", "-----", "------", "----------", "-----");

        System.out.println("Capacidade: " + cap);
        System.out.println("Preço total: " + preco);
        System.out.println("Quantidade: " + qtd);
    }
}
