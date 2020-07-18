package thiago_xavier.parte5;

import java.util.Scanner;

public class AppAcessoContrutor {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        //O programa não quer que instancie os dados de acsso sem login e senha
        AcessoConstrutor a = new AcessoConstrutor("Thiago", "1234");
        System.out.println(a.nivelAcesso);
        
        AcessoConstrutor b = new AcessoConstrutor("Thiago", "1234", 4567);
        System.out.println(b.nivelAcesso);
    }
    
    
}
