package a3.classes;

import java.util.Scanner;

public class Tablet extends Gadget implements Ligacao, Desconto {

    private double tamanho;
    private static final double DESCONTO_TABLET = 0.08;

    @Override
    public String ligar() {
        return "Este Tablet só faz ligações por WiFI.";
    }

    @Override
    public double desconto() {
        return getPreco() - (getPreco() * DESCONTO_TABLET);
    }

    public Tablet() {
    }

    public Tablet(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double tamanho) {
        super(tipo, duracao, amperagem, cor, fabricante, preco);
        this.tamanho = tamanho;
    }

    public Tablet(String cor, String fabricante, double preco) {
        super(cor, fabricante, preco);
    }

    public Tablet(String fabricante, double preco) {
        super(fabricante, preco);
    }

    public Tablet(String cor, String fabricante) {
        super(cor, fabricante);
    }

    public void cadastrar(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double tamanho) {
        super.cadastrar(tipo, duracao, amperagem, cor, fabricante, preco);
        setTamanho(tamanho);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean continua = true;
        do {
            try {
                System.out.print("Qual é o tamanho? ");
                setTamanho(Double.parseDouble(sc.nextLine()));
                continua = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Exceção gerada: " + nfe.getMessage());
            } catch (Exception e) {
                System.out.println("Exceção gerada: " + e.getMessage());
            }
        } while (continua);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("O tamanho é: " + getTamanho());
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

}
