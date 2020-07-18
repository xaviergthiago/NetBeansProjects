package thiago_xavier.parte.pkg4;
public class AppCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta ();
        Caneta c3 = new Caneta ();
        c1.setCor("Verde");
        c1.setMarca("Pilot");
        c1.setQuantidade (10);
        c1.setPreco(-5);
        System.out.println ("Marca " +c1.getMarca());
        System.out.println ("Cor " +c1.getCor());
        System.out.println ("Quandidade " + c1.getPreco());
        
    }
    
}
