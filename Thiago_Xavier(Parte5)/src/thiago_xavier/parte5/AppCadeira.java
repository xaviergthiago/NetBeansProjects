package thiago_xavier.parte5;

public class AppCadeira {

    public static void main(String args[]) {
        Cadeira c1 = new Cadeira("Azul", 5.4, false, true, 18);
        c1.imprimir();
        System.out.println("");
        Cadeira c2 = new Cadeira("Amarelo", 3.2, true, true, 3, 5);
        c2.imprimir();
        System.out.println("");
        Cadeira c3 = new Cadeira(4.5, false, true, 1);
        c3.imprimir();
        System.out.println("");
        Cadeira c4 = new Cadeira(9.8, true, false, 4, 5, "Vermelho");
        c4.imprimir();
        System.out.println("");
        Cadeira c5 = new Cadeira(true, false, 7, 6, "Verde", 1.5);
        c5.imprimir();
        System.out.println("");
    }

}
