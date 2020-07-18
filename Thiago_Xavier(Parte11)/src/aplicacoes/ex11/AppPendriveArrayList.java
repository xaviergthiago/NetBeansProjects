package aplicacoes.ex11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import classes.parte11.Pendrive;

public class AppPendriveArrayList {

    public static void main(String[] args) {
        double preco = 0;
        int cap = 0, qtd = 0, escolha = 0;
        boolean continua = true;

        Scanner sc = new Scanner(System.in);
        ArrayList<Pendrive> arrayPd = new ArrayList<Pendrive>(); //O que está entre <> é tipo, não é classe!
        while (continua) {
            Pendrive pd = new Pendrive();
            pd.entradaDadosRelatorio();
            arrayPd.add(pd);

            preco = preco + pd.getPreco();
            cap = cap + pd.getCapacidade();
            qtd = qtd + pd.getQuantidade();

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }

        Iterator<Pendrive> iteraPd = arrayPd.iterator(); //O que está entre <> é tipo, não é classe!

        System.out.printf("%-15s %-20s %-25s %-30s\n", "Marca", "Modelo", "Capacidade", "Preço");
        System.out.printf("%-15s %-20s %-25s %-30s\n", "-----", "------", "----------", "-----");

        while (iteraPd.hasNext()) {
            iteraPd.next().imprimirRelatorio();
        };

        System.out.printf("%-15s %-20s %-25s %-30s\n", "-----", "------", "----------", "-----");

        System.out.println("Capacidade: " + cap);
        System.out.println("Preço total: " + preco);
        System.out.println("Quantidade: " + qtd);

    }

}
