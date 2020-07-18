package aplicacoes.ex11;

import classes.parte11.Temperatura;

public class AppTemperatura {

    public static void main(String[] args) {
        Temperatura temp[] = new Temperatura[30];
        double max = 0, min = 100;
                
            for (int i = 0; i < 30; i++) {
                temp[i] = new Temperatura();
                temp[i].entradaDados();

                if (temp[i].getTemperatura() > max) {
                    max = temp[i].getTemperatura();
                }
                if (temp[i].getTemperatura() < min) {
                    min = temp[i].getTemperatura();
                }
            }
        
        System.out.println("Temperatura máxima: " + max);
        System.out.println("Temperatura mínima: " + min);
    }
}
