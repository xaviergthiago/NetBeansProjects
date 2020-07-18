package parte8.ex1;

public class AppAviao {

    public static void main(String[] args) {
        Aviao a1 = new Aviao(500, 900, "Diesel", 600, 1200, "Diesel", 60500);
        a1.imprimir();
        System.out.println("Preço após reajuste percentual: " + a1.reajustarPreco(15));
        System.out.println("");
        
        Aviao a2 = new Aviao();
        a2.entradaDados();
        a2.imprimir();
        System.out.println("");
        
        Aviao a3 = new Aviao();
        a3.motor1.setRotacaoMaxima(1200);
        a3.motor1.setRotacaoAtual(900);
        a3.motor1.desacelerar();
        a3.motor1.imprimir();
        
        a3.motor2.setRotacaoMaxima(800);
        a3.motor2.setRotacaoAtual(500);
        a3.motor2.acelerar();
        a3.motor2.imprimir();
    }
}