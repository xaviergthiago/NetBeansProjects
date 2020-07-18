package thiago_xavier.parte5;

import java.util.Scanner;

public class Televisao {

    int polegadas, tensao;
    boolean telaPlana;
    String marca;
    double peso;
    char cor;

    public Televisao(){
        
    }
    
    public Televisao(int po, int te, boolean tp, String ma, double pe, char c){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }
        
    public Televisao(int te, boolean tp, String ma, double pe, char c, int po) {
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(boolean tp, String ma, double pe, char c, int po, int te){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(String ma, double pe, char c, int po, int te, boolean tp){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(double pe, char c, int po, int te, boolean tp, String ma){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(char c, int po, int te, boolean tp, String ma, double pe){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(int po, boolean tp, int te, String ma, double pe, char c){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(int te, int po, String ma, double pe, char c, boolean tp){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(int po, int te, boolean tp, double pe, String ma, char c){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

public Televisao(int po, int te, boolean tp, char c, String ma, double pe){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }

    public void cadastrar(int po, int te, boolean tp, String ma, double pe, char c){
        setPolegadas(po);
        setTensao(te);
        setTelaPlana(tp);
        setMarca(ma);
        setPeso(pe);
        setCor(c);

    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as polegadas ");
        setPolegadas(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a tensão ");
        setTensao(Integer.parseInt(sc.nextLine()));
        System.out.println("Deseja tela plana: ");
        setTelaPlana(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Digite a marca ");
        setMarca(sc.nextLine());
        System.out.println("Digite o peso ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a cor desejada ");
        setCor(sc.nextLine().charAt(0));
      
    }
    
    public void imprimir(){
        System.out.println("Polegadas: " +getPolegadas());
        System.out.println("Tensão: " +getTensao());
        System.out.println("Tela plana? " +getTelaPlana());
        System.out.println("Marca: " +getMarca());
        System.out.println("Peso: " +getPeso());
        System.out.println("Cor: " +getCor());
    }

    public void setPolegadas(int po){
        if (po >= 22 && po <= 60) {
            polegadas = po;
        } else {
            polegadas = 32;
            System.out.println("Tamanho indisponível. Alterado para o padrão 32 polegadas ");
        }
    }

    public void setTelaPlana(boolean tp) {
        telaPlana = tp;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public void setPeso(double pe) {
        if (pe >= 0.5 && pe <= 4) {
            peso = pe;
        } else {
            peso = 2;
            System.out.println("Peso digitado inválido. Alterado para padrão 2 kg");
        }
    }

    public void setCor(char c) {
        if( c=='P' || c=='B'){
        cor = c;
        }
        else{
            cor = 'P';
            System.out.println("Cor digitada inválida. Alterada para cor padrão Preta");
        }
    }

    public void setTensao(int te) {
        if (te == 127 || te == 220) {
            tensao = te;
        } else {
            te = 127;
            System.out.println("Valor de tensao inválido. Alterado para o padrão 127 volts");
        }
    }

    public int getPolegadas() {
        return polegadas;
    }

    public boolean getTelaPlana() {
        return telaPlana;
    }

    public String getMarca() {
        return marca;
    }

    public double getPeso() {
        return peso;
    }

    public char getCor() {
        return cor;
    }

    public int getTensao() {
        return tensao;
    }

    private char CharAt(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
