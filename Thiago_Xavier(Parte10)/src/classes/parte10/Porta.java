package classes.parte10;

import java.util.Scanner;

public class Porta {

    private double comprimento, largura;
    private boolean vidro;

    public void setComprimento(double co) {
        if (co > 0) {
            comprimento = co;
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double la) {
        if (la > 0) {
            largura = la;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setVidro(boolean vi) {
        vidro = vi;
    }

    public boolean getVidro() {
        return vidro;
    }

    public Porta() {

    }

    public Porta(boolean vi) {
        setVidro(vi);
    }

    public Porta(double la, double co, boolean vi) {
        setLargura(la);
        setComprimento(co);
        setVidro(vi);
    }

    public void cadastrar(double la, double co, boolean vi) {
        setLargura(la);
        setComprimento(co);
        setVidro(vi);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a largura? ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Qual o comprimento? ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("A porta terá vidro? ");
        setVidro(Boolean.parseBoolean(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("A largura é: " + getLargura());
        System.out.println("O comprimento é: " + getComprimento());
        System.out.println("Vidro na porta: " + getVidro());
    }

}
