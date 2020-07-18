package parte8.ex2;

import java.util.Scanner;

public class Porta {

    double comprimento, largura;
    boolean vidro;

    public Porta() {
    }

    public Porta(double comprimento, double largura, boolean vidro) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.vidro = vidro;
    }
    
    public Porta(boolean vidro) {
        this.vidro = vidro;
    }

    public void cadastrar(double comprimento, double largura, boolean vidro) {
        setComprimento(comprimento);
        setLargura(largura);
        setVidro(vidro);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Terá vidro? ");
        setVidro(Boolean.parseBoolean(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("O comprimento é:  ");
        System.out.println("A largura é:  ");
        System.out.println("Terá vidro:  ");
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public boolean getVidro() {
        return vidro;
    }

    public void setVidro(boolean vidro) {
        this.vidro = vidro;
    }

}
