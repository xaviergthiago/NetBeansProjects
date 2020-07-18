package thiago_xavier.parte6;

import java.util.Scanner;

public class Transporte {

    int capacidadeTanque, numeroPassageiros;
    double preco;

    public Transporte() {

    }

    public Transporte(int np, int ct, double p) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(p);

    }

    public Transporte(double p, int np, int ct) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(p);

    }

    public Transporte(int ct, double p, int np) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(p);

    }

    public void cadastrar(int np, int ct, double p) {
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
        setPreco(p);

    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a capacidade do tanque: ");
        setCapacidadeTanque(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a capacidade de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));

    }

    public void imprimir() {
        System.out.format("Capacidade do tanque: %d\n", getCapacidadeTanque());
        System.out.println("Capacidade de passageiros: " + getNumeroPassageiros());
        System.out.println("Preço: " + getPreco());
    }

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

    public void setPreco(double p) {
        preco = p;

    }

    public double getPreco() {
        return preco;
    }
}
