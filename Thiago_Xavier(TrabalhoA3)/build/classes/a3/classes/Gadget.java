package a3.classes;

import java.util.Scanner;

public class Gadget {

    public Bateria bateria;
    protected String cor, fabricante;
    protected double preco;
    protected static final String COR_GADGET = "Azul";

    public Gadget() {
        bateria = new Bateria();
    }

    public Gadget(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco) {
        bateria = new Bateria(tipo, duracao, amperagem);
        this.cor = cor;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public Gadget(String cor, String fabricante, double preco) {
        bateria = new Bateria();
        this.cor = cor;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public Gadget(String fabricante, double preco) {
        bateria = new Bateria();
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public Gadget(String cor, String fabricante) {
        bateria = new Bateria();
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public Gadget(String tipo, double amperagem, String cor) {
        bateria = new Bateria(tipo, amperagem);
        this.cor = cor;
    }

    public Gadget(String tipo, double amperagem, double preco) {
        bateria = new Bateria(tipo, amperagem);
        this.preco = preco;
    }

    public Gadget(String tipo, double amperagem, String cor, String fabricante) {
        bateria = new Bateria(tipo, amperagem);
        this.cor = cor;
        this.fabricante = fabricante;
    }

    public void cadastrar(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco) {
        bateria.cadastrar(tipo, duracao, amperagem);
        setCor(cor);
        setFabricante(fabricante);
        setPreco(preco);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        bateria.entradaDados();
        boolean continua = true;
        do {
            try {
                System.out.print("Qual a cor? ");
                setCor(sc.nextLine());
                System.out.print("Qual o fabricante? ");
                setFabricante(sc.nextLine());
                System.out.print("Qual o preço? ");
                setPreco(Double.parseDouble(sc.nextLine()));
                continua = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Exceção gerada: " + nfe.getMessage());
            } catch (Exception e) {
                System.out.println("Exceção gerada: " + e.getMessage());
            }
        } while (continua);
    }

    public void imprimir() {
        bateria.imprimir();
        System.out.println("A cor é: " + getCor());
        System.out.println("O fabricante é: " + getFabricante());
        System.out.println("O preço é: " + getPreco());
        System.out.println("A cor é: " + getCor());
    }

    public String getCor() {
        return cor;
    }

    private void setCor(String cor) {
        this.cor = COR_GADGET;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
