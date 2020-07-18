/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produto1;

/**
 *
 * @author sicsu
 */
public class Produto {

  private String codigo, descricao;
  private int quantidade;
  private double preco;
          String dataFabricacao;
  public  String dataVenda;

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade >= 0) {
      this.quantidade = quantidade;
    }
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if (preco >= 0) {
      this.preco = preco;
    }
  }

  public Produto() {
  }

  public Produto(String codigo, String descricao, int quantidade, double preco) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.quantidade = quantidade;
    this.preco = preco;
  }

}
