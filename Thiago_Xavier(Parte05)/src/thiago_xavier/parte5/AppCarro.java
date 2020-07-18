package thiago_xavier.parte5;

public class AppCarro {

    public static void main(String args[]) {
        Carro c1 = new Carro(1994, "ABC1234", "Fiat", "São Paulo", 34000, true);
        c1.imprimir();
        System.out.println("");
        
        Carro c2 = new Carro("DEF5678", "Chevrolet", "Brasilia", 55000, false, 2001);
        c2.imprimir();
        System.out.println("");
        
        Carro c3 = new Carro("Toyota", "Curitiba", 43500, false, 1997, "GHI9012");
        c3.imprimir();
        System.out.println("");
        
        Carro c4 = new Carro("Rio de Janeiro", 75000, true, 2016, "JKL3456", "Honda");
        c4.imprimir();
        System.out.println("");
        
        Carro c5 = new Carro(59.000, false, 1900, "MNO 7890", "Hyundai", "Rio Branco");
        c5.imprimir();
        System.out.println("");
    }

}
