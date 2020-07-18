package a3.classes;

import java.util.Scanner;

public class Celular extends PesoGadget implements Ligacao, Desconto {

    private String operadora;
    private static final double DESCONTO_CELULAR = 0.10;

    @Override
    public String ligar() {
        return "Este Celular faz ligações 3G e 4G.";
    }

    @Override
    public double desconto() {
        return getPreco() - (getPreco() * DESCONTO_CELULAR);
    }

    public Celular() {
    }

    public Celular(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso, String operadora) {
        super(tipo, duracao, amperagem, cor, fabricante, preco, peso);
        this.operadora = operadora;
    }

    public Celular(double peso, String operadora) {
        super(peso);
        this.operadora = operadora;
    }

    public Celular(String operadora) {
        this.operadora = operadora;
    }

    public Celular(double peso) {
        super(peso);
    }

    public void cadastrar(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso, String operadora) {
        super.cadastrar(tipo, duracao, amperagem, cor, fabricante, preco, peso);
        setOperadora(operadora);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean continua = true;
        do {
            try {
                System.out.print("Qual a operadora? ");
                setOperadora(sc.nextLine());
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
        System.out.println("A operadora é: " + getOperadora());
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
