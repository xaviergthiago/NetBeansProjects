package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class AppIate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iate i1 = new Iate();
        i1.entradaDados();
        i1.imprimir();
        System.out.format("O valor do iate com desconto é %.2f e terá %d pessoas por cabine.\n", i1.valorDesconto(), i1.pessoasPorCabine());
        System.out.println("");

        Iate i2 = new Iate();
        i2.cadastrar(15.8, 96.7, "Azul", "ABC-1234", "Bertram", "a motor de pesca esportiva", 600, 300, 75, 35, false);
        i2.imprimir();
        System.out.format("O valor do iate com desconto é %.2f e terá %d pessoas por cabine.\n", i2.valorDesconto(), i2.pessoasPorCabine());
        System.out.println("");

        Iate i3 = new Iate(96.7, "Verde", "CAB-3142", "Scott Lane Boatbuilders", "a motor com hard top", 500, 38, 700, 58, false, 19.8);
        i3.imprimir();
        System.out.println("");

        Iate i4 = new Iate("Amarela", "DEF-5678", "Viking Yachts", "a motor tipo lobster", 450, 90, 10, 80, false, 20.9, 100);
        i4.imprimir();
        System.out.println("");

        Iate i5 = new Iate("Lloyd Stevenson Boat Builders", "à vela de luxo de cruzeiro", 38, 49, 35, 75, true, 58.9, 80, "Branca", "EDF-6587");
        i5.imprimir();
        System.out.println("");

        Iate i6 = new Iate(97, 48, true, 76.3, 34, "Preta", "TGX-1910", "McMullen & Wing", "a motor catamarã", 50, 38);
        i6.imprimir();
    }

}
