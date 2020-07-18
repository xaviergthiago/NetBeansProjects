/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_2020_05_11_noite;

/**
 *
 * @author sicsu
 */
public class Acesso {
  private String login;
  private int senha, nivelAcesso;
  
  // Métodos de acesso
  public String getLogin(){
    return login;
  }
  private void setLogin(String login){
    this.login = login;
  }
  
  public int getNivelAcesso(){
    return nivelAcesso;
  }
  private void setNivelAcesso(int nivelAcesso){
   this.nivelAcesso = nivelAcesso; 
  }
  
  public Acesso(String login, int senha){
    if(login.equals("joao") && senha == 1234){
      setNivelAcesso(10);
      setLogin(login);
      this.senha=senha;
    }
    else{
      nivelAcesso = 0;
    }
  }
  
}
