package a3.objetos;

import a3.classes.Tablet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppTabletArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tablet> arrayTablet = new ArrayList<Tablet>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            Tablet t = new Tablet();
            t.entradaDados();
            arrayTablet.add(t);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<Tablet> iteraTablet = arrayTablet.iterator();
        while (iteraTablet.hasNext()) {
            iteraTablet.next().imprimir();
        };
    }    
}
