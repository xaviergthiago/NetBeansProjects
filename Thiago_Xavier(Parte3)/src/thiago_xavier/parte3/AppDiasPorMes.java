package thiago_xavier.parte3;

import java.util.Scanner;

public class AppDiasPorMes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiasPorMes dpm = new DiasPorMes();
        System.out.println("Digite o mês desejado: ");
        dpm.setMes(Integer.parseInt(sc.nextLine()));

        switch (dpm.getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("O mês tem 31 dias");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("O mês tem 30 dias");
                break;

            case 2:
                System.out.println("O mês tem 28 dias ");
                break;

            default:
                System.out.println("O mês digitado não corresponde a um mês do ano");
        }
    }
}
