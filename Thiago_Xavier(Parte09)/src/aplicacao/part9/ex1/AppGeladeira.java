package aplicacao.part9.ex1;

import java.util.Scanner;
import classes.part9.ex1.Geladeira;

public class AppGeladeira {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Geladeira g1 = new Geladeira();
        
        System.out.print("Informe a quantidade de portas ");
        g1.setPortas(Byte.parseByte(sc.nextLine()));
        
        System.out.print("Informe a quantidade desejada ");
        g1.setQuantidade(Short.parseShort(sc.nextLine()));
        
        System.out.print("Informe o código do contrato ");
        g1.setCodigo(Long.parseLong(sc.nextLine()));
        
        System.out.print("Informe o preço de revenda ");
        g1.setPreco(Float.parseFloat(sc.nextLine()));
        
        System.out.println("Quantidade de portas " +g1.getPortas());
        System.out.println("Quantidade desejada " +g1.getQuantidade());
        System.out.println("Código do contrato " +g1.getCodigo());
        System.out.println("Preço de revenda " +g1.getPreco());
    }
    
    
}
