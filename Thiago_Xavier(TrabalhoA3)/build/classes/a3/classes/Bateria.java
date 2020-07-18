package a3.classes;

import java.util.Scanner;

public class Bateria {

    private String tipo;
    private int duracao;
    private double amperagem;

    public Bateria() {
    }

    public Bateria(String tipo, int duracao, double amperagem) {
        this.tipo = tipo;
        this.duracao = duracao;
        this.amperagem = amperagem;
    }

    public Bateria(int duracao, double amperagem) {
        this.duracao = duracao;
        this.amperagem = amperagem;
    }

    public Bateria(String tipo, double amperagem) {
        this.tipo = tipo;
        this.amperagem = amperagem;
    }

    public Bateria(String tipo, int duracao) {
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public void cadastrar(String tipo, int duracao, double amperagem) {
        setTipo(tipo);
        setDuracao(duracao);
        setAmperagem(amperagem);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do {
            try {
                System.out.print("Qual o tipo da bateria? ");
                setTipo(sc.nextLine());
                System.out.print("Qual o tempo de duração da bateria? ");
                setDuracao(Integer.parseInt(sc.nextLine()));
                System.out.print("Qual a amperagem da bateria? ");
                setAmperagem(Double.parseDouble(sc.nextLine()));
                continua = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Exceção gerada: " + nfe.getMessage());
            } catch (Exception e) {
                System.out.println("Exceção gerada: " + e.getMessage());
            }
        } while (continua);
    }

    public void imprimir() {
        System.out.println("A bateria é do tipo: " + getTipo());
        System.out.println("A bateria tem duração de: " + getDuracao());
        System.out.println("A amperagem da bateria é: " + getAmperagem());
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getAmperagem() {
        return amperagem;
    }

    public void setAmperagem(double amperagem) {
        this.amperagem = amperagem;
    }

}
