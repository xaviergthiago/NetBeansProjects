package thiago_xavier.parte1;

import java.util.Scanner;

public class AppArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a1 = new Area();
        System.out.println("Digite a altura ");
        a1.setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a largura ");
        a1.setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a profundidade ");
        a1.setProfundidade(Double.parseDouble(sc.nextLine()));
        System.out.printf("A área é %.2f \n", a1.getLargura() * a1.getAltura());
        System.out.printf("O volume é %.2f \n", a1.getLargura() * a1.getAltura() * a1.getProfundidade());
    }

}
