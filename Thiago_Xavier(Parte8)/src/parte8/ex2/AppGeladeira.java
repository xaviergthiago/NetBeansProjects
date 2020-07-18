package parte8.ex2;

public class AppGeladeira {
    public static void main(String[] args) {
        
        Geladeira g1 = new Geladeira(3.2, 9.7);
        System.out.print("A temperatura máxima é " +g1.getTemperaturaMaxima() +" e a mínima é " +g1.getTemperaturaMinima());
        System.out.println("");
                
        Geladeira g2 = new Geladeira(54.0, 43.5, true, 54.0, 43.5, false);;
        System.out.printf("Porta 1 - Comprimento: %.2f. Largura: %.2f. Vidro na porta: %b. \n", g2.porta1.getComprimento(), g2.porta1.getLargura(), g2.porta1.getVidro());
        System.out.printf("Porta 2 - Comprimento: %.2f. Largura: %.2f. Vidro na porta: %b. \n", g2.porta2.getComprimento(), g2.porta2.getLargura(), g2.porta2.getVidro());                        
        
        Geladeira g3 = new Geladeira("Brastemp", "alça na porta");
        System.out.printf("A marca é %s e o modelo é %s. \n", g3.getMarca(), g3.getModelo());
        System.out.println("");
    }
}
