package parte8.ex2;

public class AppMicroOndas {
    public static void main(String[] args) {
        
        MicroOndas m1 = new MicroOndas(850, 1200);
        System.out.print("A potência máxima é " +m1.getPotenciaMaxima() +" e a mínima é " +m1.getPotenciaMinima());
        System.out.println("");
                
        MicroOndas m2 = new MicroOndas(54.0, 43.5, true);;
        System.out.printf("Comprimento: %.2f. Largura: %.2f. Vidro na porta: %b. \n", m2.porta1.getComprimento(), m2.porta1.getLargura(), m2.porta1.getVidro());
                                
        MicroOndas m3 = new MicroOndas("Consul", "cromado");
        System.out.printf("A marca é %s e o modelo é %s. \n", m3.getMarca(), m3.getModelo());
        System.out.println("");
    }
}
