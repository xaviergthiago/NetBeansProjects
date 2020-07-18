package a2.objetos;

import a2.classes.Lancha;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppLanchaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lancha> arrayLancha = new ArrayList<Lancha>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            Lancha lancha = new Lancha();
            lancha.entradaDados();
            arrayLancha.add(lancha);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<Lancha> iteraLancha = arrayLancha.iterator();
        while (iteraLancha.hasNext()) {
            iteraLancha.next().imprimir();
        };
    }
}
