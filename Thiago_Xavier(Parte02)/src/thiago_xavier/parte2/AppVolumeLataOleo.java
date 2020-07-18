package thiago_xavier.parte2;

import java.util.Scanner;

public class AppVolumeLataOleo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeLataOleo vlo = new VolumeLataOleo();
        System.out.println("Digite o valor do raio: ");
        vlo.setRaio(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a altura da lata ");
        vlo.setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("O volume da lata de óleo é: " + (vlo.getAltura() * vlo.getRaio() * vlo.getRaio() * 3.14159));

    }
}
