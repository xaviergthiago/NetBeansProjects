package parte8.ex1;

import java.util.Scanner;

public class Motor {

    int rotacaoMaxima, rotacaoAtual;
    String tipoCombustivel;

    public void setRotacaoMaxima(int rm) {
        rotacaoMaxima = rm;
    }

    public int getRotacaoMaxima() {
        return rotacaoMaxima;
    }

    public void setRotacaoAtual(int ra) {
        rotacaoAtual = ra;
    }

    public int getRotacaoAtual() {
        return rotacaoAtual;
    }

    public void setTipoCombustivel(String tc) {
        tipoCombustivel = tc;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    //MC1
    public Motor() {

    }

    //MC2
    public Motor(int ra, int rm, String tc) {
        setRotacaoMaxima(rm);
        setRotacaoAtual(ra);
        setTipoCombustivel(tc);
    }

    //MC3
    public Motor(int rm, String tc) {
        setRotacaoMaxima(rm);
        setTipoCombustivel(tc);
    }

    //MC4
    public Motor(String tc, int rm) {
        setRotacaoMaxima(rm);
        setTipoCombustivel(tc);
    }

    //MC5
    public Motor(int ra, int rm) {
        setRotacaoMaxima(rm);
        setRotacaoAtual(ra);
    }

    public void acelerar() {
        if (rotacaoAtual < rotacaoMaxima) {
            rotacaoAtual += 100;
        }
    }

    public void desacelerar() {
        if (rotacaoAtual > 0) {
            rotacaoAtual -= 100;
        }
    }

    public void cadastrar(int ra, int rm, String tc) {
        setRotacaoMaxima(rm);
        setRotacaoAtual(ra);
        setTipoCombustivel(tc);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a rotação máxima: ");
        setRotacaoMaxima(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite a rotação atual: ");
        setRotacaoAtual(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite o tipo de combustível: ");
        setTipoCombustivel(sc.nextLine());
    }

    public void imprimir() {
        System.out.println("A rotação máxima é: " + getRotacaoMaxima());
        System.out.println("A rotação atual é: " + getRotacaoAtual());

        if (tipoCombustivel != null) {
            System.out.println("O tipo de combustível é: " + getTipoCombustivel());
        }
    }

}
