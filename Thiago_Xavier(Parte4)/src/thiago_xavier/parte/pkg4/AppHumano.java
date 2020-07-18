package thiago_xavier.parte.pkg4;
public class AppHumano {
    public static void main (String args[]) {
        System.out.println ("Criação de Objetos Humanos ");
        Humano h1 = new Humano ();
        Humano h2 = new Humano ();
        h1.setNome ("João");
        h2.setNome ("Maria");
        System.out.println ("H1->Nome: " +h1.getNome());
        System.out.println ("H2->Nome: " +h2.getNome());
        
    }
    
}
