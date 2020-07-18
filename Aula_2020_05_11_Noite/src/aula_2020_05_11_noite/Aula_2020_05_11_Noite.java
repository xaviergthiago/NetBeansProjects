/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_11_noite;

import Produto1.Produto;
import Produto2.*;
import java.util.Scanner;

/**
 *
 * @author sicsu
 */
public class Aula_2020_05_11_Noite {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Acesso acesso = new Acesso("joao", 1234);
    Scanner ent = new Scanner(System.in);
    //acesso.nivelAcesso=9;
        
    System.out.println("Nível de Acesso :" + acesso.getNivelAcesso());
    System.out.println("Login           :" + acesso.getLogin());
    //System.out.println("Senha           :" + acesso.senha);
    
    System.out.println("\n\n*************************************\n");
    
    Produto prod1 = new Produto();
    prod1.setCodigo("5555");
    prod1.setDescricao("Teclado ABC");
    prod1.setQuantidade(10);
    prod1.setPreco(85.0);
    
    
    //prod1.codigo="1234";
    //prod1.descricao="Monitor 19\"";
    //prod1.quantidade=-5;
    //prod1.preco=-50.00;
    
    System.out.println("Código       :" + prod1.getCodigo());
    System.out.println("Descrição    :" + prod1.getDescricao());
    System.out.println("Qauntidade   :" + prod1.getQuantidade());
    System.out.println("Preço        :" + prod1.getPreco());
    
    System.out.println("\n\n*************************************\n");
    
    Produto2.Produto prod2 = new Produto2.Produto();
    prod2.idade=32;
    prod2.nome="Maria";
    System.out.println("Nome        :" + prod2.nome);
    System.out.println("Idade       :" + prod2.idade);
     
  }
  
}
