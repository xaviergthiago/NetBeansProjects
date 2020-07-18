package classes.parte9.ex2;

import java.util.Scanner;

public class Veiculo {

    protected int capacidadeTanque, numeroPassageiros;
    protected double preco;

    public void setCapacidadeTanque(int ct) {
        capacidadeTanque = ct;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setNumeroPassageiros(int np) {
        numeroPassageiros = np;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    //MC1
    public Veiculo() {

    }

    //MC2
    public Veiculo(int ct, int np, double preco) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(preco);
    }

    //MC3
    public Veiculo(int ct, int np) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
    }

    //MC4
    public Veiculo(int np, double preco) {
        setNumeroPassageiros(np);
        setPreco(preco);
    }

    //MC5
    public Veiculo(double preco, int ct) {
        setNumeroPassageiros(ct);
        setPreco(preco);
    }

    public void cadastrar(int ct, int np, double preco) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(preco);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a capacidade do tanque: ");
        setCapacidadeTanque(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o número de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("A capacidade do tanque é: " + getCapacidadeTanque());
        System.out.println("O número de passageiros é: " + getNumeroPassageiros());
        System.out.println("O preço é: " + getPreco());
    }

}
