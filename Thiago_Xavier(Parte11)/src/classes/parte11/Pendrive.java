package classes.parte11;

import java.util.Scanner;

public class Pendrive {

    private String marca, modelo;
    private int capacidade, quantidade;
    private double comprimento, largura, profundidade, peso, preco;

    public Pendrive() {

    }

    public Pendrive(String marca, String modelo, int capacidade, int quantidade, double comprimento, double largura, double profundidade, double peso, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.quantidade = quantidade;
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.peso = peso;
        this.preco = preco;
    }

    public Pendrive(double comprimento, double largura, double profundidade, double peso, double preco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
        this.peso = peso;
        this.preco = preco;
    }

    public Pendrive(String marca, int capacidade) {
        this.marca = marca;
        this.capacidade = capacidade;
    }

    public Pendrive(String marca, String modelo, int capacidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    public void cadastrar(String marca, String modelo, int capacidade, int quantidade, double comprimento, double largura, double profundidade, double peso, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setCapacidade(capacidade);
        setQuantidade(quantidade);
        setComprimento(comprimento);
        setLargura(largura);
        setProfundidade(profundidade);
        setPeso(peso);
        setPreco(preco);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        setMarca(sc.nextLine());

        System.out.print("Digite o modelo: ");
        setModelo(sc.nextLine());

        System.out.print("Digite a capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));

        System.out.print("Digite a quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));

        System.out.print("Digite o comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));

        System.out.print("Digite a largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));

        System.out.print("Digite a profundidade: ");
        setProfundidade(Double.parseDouble(sc.nextLine()));

        System.out.print("Digite o peso: ");
        setPeso(Double.parseDouble(sc.nextLine()));

        System.out.print("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("A marca é " + getMarca());
        System.out.println("O modelo é " + getModelo());
        System.out.println("A capacidade é " + getCapacidade());
        System.out.println("A quantidade é " + getQuantidade());
        System.out.println("O comprimento é " + getComprimento());
        System.out.println("A largura é " + getLargura());
        System.out.println("A profundidade é " + getProfundidade());
        System.out.println("O peso é " + getPeso());
        System.out.println("O preço é " + getPreco());
    }

    public void entradaDadosRelatorio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.print("Digite o modelo: ");
        setModelo(sc.nextLine());
        System.out.print("Digite a capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite a quantidade: ");
        setQuantidade(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public void imprimirRelatorio() {
        System.out.printf("%-15s %-20s %-25s %-30s\n", getMarca(), getModelo(), getCapacidade(), getPreco());
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setCapacidade(int cap) {

        capacidade = cap;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setComprimento(double comp) {
        comprimento = comp;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double l) {
        largura = l;
    }

    public double getLargura() {
        return largura;
    }

    public void setProfundidade(double prof) {
        profundidade = prof;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setPreco(double pre) {
        preco = pre;
    }

    public double getPreco() {
        return preco;
    }

    public void setPeso(double p) {
        if (p > 0) {
            peso = p;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setModelo(String mo) {
        modelo = mo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setQuantidade(int qt) {
        quantidade = qt;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
