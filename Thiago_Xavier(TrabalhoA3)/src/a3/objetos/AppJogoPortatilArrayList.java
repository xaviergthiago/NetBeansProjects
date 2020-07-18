package a3.objetos;

import a3.classes.JogoPortatil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppJogoPortatilArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<JogoPortatil> arrayJogoPortatil = new ArrayList<JogoPortatil>();
        int escolha = 0;
        boolean continua = true;

        while (continua) {
            JogoPortatil jp = new JogoPortatil();
            jp.entradaDados();
            arrayJogoPortatil.add(jp);

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator<JogoPortatil> iteraJogoPortatil = arrayJogoPortatil.iterator();
        while (iteraJogoPortatil.hasNext()) {
            iteraJogoPortatil.next().imprimir();
        };
    }
}
