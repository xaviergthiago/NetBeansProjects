package thiago_xavier.parte5;

import java.util.Scanner;

public class Cadeira {

    String cor;
    double peso;
    boolean pcd, acolchoamento; //pcd é sigla para portadores de deficiência
    int quantidade, pes;

    public Cadeira() {

    }

    public Cadeira(String c, double p, boolean def, boolean ac, int q) {
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
    }

    public Cadeira(String c, double p, boolean def, boolean ac, int q, int pe) {
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

    public Cadeira(double p, boolean def, boolean ac, int q) {
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
    }

    public Cadeira(double p, boolean def, boolean ac, int q, int pe, String c) {
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

    public Cadeira(boolean def, boolean ac, int q, int pe, String c, double p) {
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }
    
    public Cadeira (boolean ac, int q, int pe, String c, double p, boolean def){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

public Cadeira (int q, int pe, String c, double p, boolean def, boolean ac){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }


public Cadeira (int pe, String c, double p, boolean def, boolean ac, int q){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

public Cadeira (int pe, double p, String c, boolean def, boolean ac, int q){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

public Cadeira (int pe, double p, boolean def, String c,  boolean ac, int q){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

public Cadeira (int pe, double p, boolean def, boolean ac, String c, int q){
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

    public void cadastrar(String c, double p, boolean def, boolean ac, int q, int pe) {
        setCor(c);
        setPeso(p);
        setPcd(def);
        setAcolchoamento(ac);
        setQuantidade(q);
        setPes(pe);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor ");
        setCor(sc.nextLine());
        System.out.println("Digite o peso ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("É para portadores de deficiência? ");
        setPcd(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Terá acolchoamento? ");
        setAcolchoamento(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Quantidade ");
        setQuantidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite quantos pés deseja que a cadeira tenha ");
        setPes(Integer.parseInt(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("Cor: " + getCor());
        System.out.println("Peso: " + getPeso());
        System.out.println("Pessoas com deficiência: " + getPcd());
        System.out.println("Acolchoamento: " + getAcolchoamento());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Pés: " + getPes());
    }

    public void setCor(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setPeso(double p) {
        if (p > 2) {
            peso = p;
        } else {
            peso = 2;
            System.out.println("Valor digitado inválido. Alterado para peso padrão 2 kg");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPcd(boolean def) {
        pcd = def;
    }

    public boolean getPcd() {
        return pcd;
    }

    public void setQuantidade(int q) {
        quantidade = q;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setAcolchoamento(boolean ac) {
        acolchoamento = ac;
    }

    public boolean getAcolchoamento() {
        return acolchoamento;
    }

    public void setPes(int pe) {
        if (pe == 3 || pe == 4) {
            pes = pe;
        } else {
            pes = 4;
            System.out.println("Valor digitado inválido. Alterado para padrão 4 pés");
        }
    }

    public int getPes() {
        return pes;
    }
}
