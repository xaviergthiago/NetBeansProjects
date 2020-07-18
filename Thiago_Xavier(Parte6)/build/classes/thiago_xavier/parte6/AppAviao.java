package thiago_xavier.parte6;

public class AppAviao {

    public static void main(String[] args) {
        Aviao a1 = new Aviao("TAM", "05/09/2019", 5000, 9000, 900000);
        a1.imprimir();
        a1.reajustarPreco(0.3);
        System.out.println("Valor reajustado: " + a1.reajuste);
        System.out.println("");
        
        Aviao a2 = new Aviao(9850, 17800, 90700, "29/04/1918", "Avianca");
        a2.imprimir();
        a2.reajustarPreco(0.7);
        System.out.println("Valor reajustado: " + a2.reajuste);
        System.out.println("");
        
        Aviao a3 = new Aviao(1500900, "19/10/2019", "GOL", 800, 5000);
        a3.imprimir();
        a3.reajustar_Preco(0.65);

    }
}
