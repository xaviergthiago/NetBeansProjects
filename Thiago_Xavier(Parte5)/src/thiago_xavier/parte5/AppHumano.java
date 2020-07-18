package thiago_xavier.parte5;

import java.util.Scanner;

public class AppHumano {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Criação de Objetos Humanos ");
        Humano h1 = new Humano();
//        h1.setNome("Maria");

//        System.out.println("Nome: ");
//        h1.setNome(sc.nextLine());
//        System.out.println("Sexo: ");
//        h1.setSexo(sc.nextLine());
//        System.out.println("Idade: ");
//        h1.setIdade(Integer.parseInt(sc.nextLine()));
//        System.out.println("Peso: ");
//        h1.setPeso(Double.parseDouble(sc.nextLine()));
//        System.out.println("Altura: ");
//        h1.setAltura(Double.parseDouble(sc.nextLine()));
        
        Humano h2 = new Humano("Maria", "Feminino", 33, 72.3, 1.75);
        Humano h3 = new Humano("José", "Masculino", 45, 75.0, 1.80);
        h1.entradaDados();
        h1.imprimir();
        h2.imprimir();
        h3.imprimir();

    }
}
