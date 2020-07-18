package a3.objetos;

import a3.classes.Celular;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppCelularArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Celular> arrayCelular = new ArrayList<Celular>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            Celular c = new Celular();
            c.entradaDados();
            arrayCelular.add(c);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<Celular> iteraCelular = arrayCelular.iterator();
        while (iteraCelular.hasNext()) {
            iteraCelular.next().imprimir();
        };
    }   
}
