package a3.classes;

import java.util.Scanner;

public class JogoPortatil extends PesoGadget implements Ligacao, Desconto {

    private int memoria;
    private static final double DESCONTO_JOGO_PORTATIL = 0.09;

    @Override
    public String ligar() {
        return "Este Jogo Portátil não faz ligações.";
    }

    @Override
    public double desconto() {
        return getPreco() - (getPreco() * DESCONTO_JOGO_PORTATIL);
    }

    public JogoPortatil() {
    }

    public JogoPortatil(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso, int memoria) {
        super(tipo, duracao, amperagem, cor, fabricante, preco, peso);
        this.memoria = memoria;
    }

    public JogoPortatil(double peso, int memoria) {
        super(peso);
        this.memoria = memoria;
    }

    public JogoPortatil(int memoria) {
        this.memoria = memoria;
    }

    public JogoPortatil(double peso) {
        super(peso);
    }

    public void cadastrar(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso, int memoria) {
        super.cadastrar(tipo, duracao, amperagem, cor, fabricante, preco, peso);
        setMemoria(memoria);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean continua = true;
        do {
            try {
                System.out.print("Qual a quantidade de memória? ");
                setMemoria(Integer.parseInt(sc.nextLine()));
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
        System.out.println("A memória é de: " + getMemoria());
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
