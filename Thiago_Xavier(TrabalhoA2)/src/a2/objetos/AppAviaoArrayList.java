package a2.objetos;

import a2.classes.Aviao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppAviaoArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aviao> arrayAviao = new ArrayList<Aviao>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            Aviao aviao = new Aviao();
            aviao.entradaDados();
            arrayAviao.add(aviao);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<Aviao> iteraAviao = arrayAviao.iterator();
        while (iteraAviao.hasNext()) {
            iteraAviao.next().imprimir();
        };
    }
}
