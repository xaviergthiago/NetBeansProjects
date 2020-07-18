package thiago_xavier.parte6;

public class AppNavio {
    public static void main(String[] argss){
        Navio n1 = new Navio(8790, 9670, 900500, "Santa Bárbara", "03/02/2019", 500 );
        n1.imprimir();
        n1.passageirosPorTripulantes();
        System.out.println("");
        
        Navio n2 = new Navio(8000, 10800, 85900, "Poseidon", "03/02/1939", 1200);
        n2.imprimir();
        n2.passageirosPorTripulantes();
        System.out.println("");
        
        Navio n3 = new Navio (2435, 8920, 65000000, 7500000, "Titanic", "31/05/1911");
        n3.imprimir();
        n3.passageiros_PorTripulantes();
        System.out.println("Passageiros por tripulantes: " +n3.taxaPassTrip);
    }
    
}
