package thiago_xavier.parte5;

public class AppMesa {

    public static void main(String args[]) {
        Mesa m1 = new Mesa(0.5, 1.0, 2.0, "Caramelo", "Oval", 6);
        m1.imprimir();
        System.out.println("");
        
        Mesa m2 = new Mesa(0.7, 3.5, 0.8);
        m2.imprimir();
        System.out.println("");
        
        Mesa m3 = new Mesa(8, "Verde", "Retangular");
        m3.imprimir();
        System.out.println("");
        
        Mesa m4 = new Mesa("Oval", "Branca", 0.8, 0.5, 0.7, 4);
        m4.imprimir();
        System.out.println("");
        
        Mesa m5 = new Mesa(0.7, 0.8, 0.9, 3, "Transparente", "Redonda");
        m5.imprimir();

    }

}
