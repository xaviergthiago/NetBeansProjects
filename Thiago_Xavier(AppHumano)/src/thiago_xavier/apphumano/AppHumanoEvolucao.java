package thiago_xavier.apphumano;

public class AppHumanoEvolucao {
    public static void main (String args[]) {
        System.out.println ("Criação de Objetos Humanos ");
        Humano h1 = new Humano ();
        h1.setSexo ("Masculino");
        h1.setNome ("João");
        h1.setIdade (23);
        h1.setPeso (65.4);
        h1.setAltura (1.76);
        System.out.println ("Nome: " +h1.getNome() + " Sexo: " + h1.getSexo() + " Idade: " + h1.getIdade() + " Peso: " + h1.getPeso() + " Altura: " + h1.getAltura());
        
    }
    
}
