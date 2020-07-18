package aplicacoes.ex11;

import java.util.ArrayList;
import classes.parte11.Temperatura;
import java.util.Iterator;
import java.util.Scanner;

public class AppTemperaturaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Temperatura> arrayTemp = new ArrayList<Temperatura>();
        int escolha = 0;
        double max = 0, min = 100;
        boolean continua = true;

        while (continua) {
            Temperatura temp = new Temperatura();
            temp.entradaDados();
            arrayTemp.add(temp);

            if (temp.getTemperatura() > max) {
                max = temp.getTemperatura();
            }
            if (temp.getTemperatura() < min) {
                min = temp.getTemperatura();
            }

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        Iterator <Temperatura> iteraTemp = arrayTemp.iterator();
        while (iteraTemp.hasNext()) {
            iteraTemp.next().imprimir();
        };
        
        System.out.println("A temperatura máxima é: " +max);
        System.out.println("A temperatura mínima é: " +min);
    }
}
