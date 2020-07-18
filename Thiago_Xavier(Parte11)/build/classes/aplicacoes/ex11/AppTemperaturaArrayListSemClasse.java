package aplicacoes.ex11;

import classes.parte11.Temperatura;
import java.util.ArrayList;
import java.util.Scanner;

public class AppTemperaturaArrayListSemClasse {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Double> temperatura = new ArrayList<Double>();
        
        int escolha = 0;
        double max = 0, min = 100;
        boolean continua = true;
        
        while (continua) {
            double temp;
            System.out.print("Digite a temperatura: ");
            temp = Double.parseDouble(sc.nextLine());
            temperatura.add(temp);

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }

            System.out.println("Inserir novo? (1-Sim, 2-Não)");
            escolha = Integer.parseInt(sc.nextLine());
            if (escolha != 1) {
                continua = false;
            }
        }
        
        System.out.println("A temperatura máxima é: " + max);
        System.out.println("A temperatura mínima é: " + min);
    }
}
