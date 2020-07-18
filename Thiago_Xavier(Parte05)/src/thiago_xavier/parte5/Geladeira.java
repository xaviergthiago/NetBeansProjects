package thiago_xavier.parte5;

import java.util.Scanner;

public class Geladeira {

    String marca;
    char cor;
    int portas, quantidade;
    long codigo;
    float preco;

    public Geladeira() {

    }

    public Geladeira(int po, int qu, long co, float pr, char c, String ma) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(int qu, long co, float pr, char c, String ma, int po) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(long co, float pr, char c, String ma, int po, int qu) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(float pr, char c, String ma, int po, int qu, long co) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(char c, String ma, int po, int qu, long co, float pr) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(String ma, int po, int qu, long co, float pr, char c) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(String ma, int qu, long co, float pr, char c, int po) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(String ma, long co, float pr, char c, int po, int qu) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(String ma, float pr, char c, int po, int qu, long co) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public Geladeira(String ma, char c, int po, int qu, long co, float pr) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public void cadastrar(int po, int qu, long co, float pr, char c, String ma) {
        setPortas(po);
        setQuantidade(qu);
        setCodigo(co);
        setPreco(pr);
        setMarca(ma);
        setCor(c);

    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas portas deseja: ");
        setPortas(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a quantidade desejada: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o código do produto: ");
        setCodigo(Long.parseLong(sc.nextLine()));
        System.out.println("Digite o preço de revenda: ");
        setPreco(Float.parseFloat(sc.nextLine()));
        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite a cor: ");
        setCor(sc.nextLine().charAt(0));

    }

    public void imprimir() {
        System.out.println("Quantidade de portas: " + getPortas());
        System.out.println("Quantidade desejada: " + getQuantidade());
        System.out.println("Código do produto: " + getCodigo());
        System.out.println("Preço de revenda: " + getPreco());
        System.out.println("Marca:  " + getMarca());
        System.out.println("Cor: " + getCor());

    }

    public void setPortas(int po) {
        if (po == 1 || po == 2) {
            portas = po;
        } else {
            portas = 1;
        }
    }

    public void setQuantidade(int qu) {
        quantidade = qu;
    }

    public void setCodigo(long co) {
        if (co > 99999) {
            codigo = co;
        } else {
            System.out.println("Código inválido. Favor recadastrar");
        }
    }

    public void setPreco(float pr) {
        if (preco > 0) {
            preco = pr;
        }
    }

    public void setCor(char c) {
        if (c == 'B' || c == 'P' || c == 'C') {
            cor = c;
        } else {
            cor = 'B';
            System.out.println("Cor digitada inválida. Alterada para cor padrão Branca");
        }
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public int getPortas() {
        return portas;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public float getPreco() {
        return preco;
    }

    public char getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    private char CharAt(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
