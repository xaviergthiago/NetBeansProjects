package thiago_xavier.parte.pkg4;

import java.util.Scanner;

public class AppPendrive {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        Pendrive p1 = new Pendrive();
        
    System.out.println ("Digite a cor: ");
    p1.setMarca(sc.nextLine());
    
    System.out.println ("Digite a capacidade: ");
    p1.setCapacidade(Integer.parseInt(sc.nextLine()));
        
    System.out.println ("Digite o comprimento: ");
    p1.setComprimento(Double.parseDouble(sc.nextLine()));
    
    
    System.out.println ("Digite a largura: ");
    p1.setLargura(Double.parseDouble(sc.nextLine()));
        
    System.out.println ("Digite a profundidade: ");
    p1.setProfundidade(Double.parseDouble(sc.nextLine()));
        
    System.out.println ("Digite o peso: ");
    p1.setPeso(Double.parseDouble(sc.nextLine()));
        
    System.out.println("Digite o preço ");
    p1.setPreco(Double.parseDouble(sc.nextLine()));
    
    System.out.println ("O preço do pendrive 1 é " +p1.getPreco());
    System.out.println ("A capacidade é " +p1.getCapacidade());
    System.out.println ("O comprimento é " +p1.getComprimento());
    System.out.println ("A largura é " +p1.getLargura());
    System.out.println ("A profundidade é " +p1.getProfundidade());
    System.out.println ("O peso é " +p1.getPeso());
    System.out.println ("O preço é " +p1.getPreco());
    
    }
}
