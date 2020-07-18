package classes.parte9.ex2;

import java.util.Scanner;

public class Eletrodomestico {

    protected String marca, modelo;
    protected int volume;
    protected double preco;
    public Porta porta1, porta2;

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String mo) {
        modelo = mo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVolume(int vo) {
        volume = vo;
    }

    public int getVolume() {
        return volume;
    }

    public void setPreco(double pr) {
        if (pr > 0) {
            preco = pr;
        }
    }

    public double getPreco() {
        return preco;
    }

    //MC1
    public Eletrodomestico() {

    }

    //MC2 recomendado para microondas
    public Eletrodomestico(double la1, double co1, boolean vi1) {
        porta1 = new Porta(la1, co1, vi1);
    }

    //MC3 recomendado para geladeira
    public Eletrodomestico(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2) {
        porta1 = new Porta(la1, co1, vi1);
        porta2 = new Porta(la2, co2, vi2);
    }

    //MC4
    public Eletrodomestico(String ma, String mo, int vo, double pr) {
        setMarca(ma);
        setModelo(mo);
        setVolume(vo);
        setPreco(pr);
    }

    //MC5
    public Eletrodomestico(String ma, String mo) {
        setMarca(ma);
        setModelo(mo);
    }

    //MC6
    public Eletrodomestico(int vo, double pr) {
        setVolume(vo);
        setPreco(pr);
    }

    //MC7 recomendado para microondas
    public Eletrodomestico(double la1, double co1, boolean vi1, String ma, String mo, int vo, double pr) {
        porta1 = new Porta(la1, co1, vi1);
        setMarca(ma);
        setModelo(mo);
        setVolume(vo);
        setPreco(pr);
    }

    //MC8 recomendado para geladeira
    public Eletrodomestico(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr) {
        porta1 = new Porta(la1, co1, vi1);
        porta2 = new Porta(la2, co2, vi2);
        setMarca(ma);
        setModelo(mo);
        setVolume(vo);
        setPreco(pr);
    }

    public void cadastrar(String ma, String mo, int vo, double pr) {
        setMarca(ma);
        setModelo(mo);
        setVolume(vo);
        setPreco(pr);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a marca? ");
        setMarca(sc.nextLine());
        System.out.println("Qual o modelo? ");
        setModelo(sc.nextLine());
        System.out.println("Qual o volume? ");
        setVolume(Integer.parseInt(sc.nextLine()));
        System.out.println("Qual o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public void imprimir() {
        if (marca != null) {
            System.out.println("A marca é: " + getMarca());
        }
        if (modelo != null) {
            System.out.println("O modelo é: " + getModelo());
        }
        System.out.println("O volume é: " + getVolume());
        System.out.println("O preço é: " + getPreco());
    }
}
