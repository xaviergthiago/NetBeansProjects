package a2.objetos;

import a2.classes.Carro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppCarroArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carro> arrayCarro = new ArrayList<Carro>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            Carro carro = new Carro();
            carro.entradaDados();
            arrayCarro.add(carro);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<Carro> iteraCarro = arrayCarro.iterator();
        while (iteraCarro.hasNext()) {
            iteraCarro.next().imprimir();
        };
    }
}
