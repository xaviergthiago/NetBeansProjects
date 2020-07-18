package a2.classes;

import java.util.Scanner;

public class Veiculo {

    protected double comprimento, largura, preco;
    protected String cor, marca, modelo;
    
    //MC1
    public Veiculo() {

    }

    //MC2
    public Veiculo(double comprimento, double largura, double preco, String cor, String marca, String modelo) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    //MC3
    public Veiculo(double comprimento, double largura, double preco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;
    }

    //MC4
    public Veiculo(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    //MC5
    public Veiculo(String cor, String marca, String modelo, double comprimento, double largura, double preco) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.preco = preco;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    //MC6
    public Veiculo(String marca, String modelo, double preco) {
        this.preco = preco;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //MC7
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //MC8
    public Veiculo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
   
    public void cadastrar(double comprimento, double largura, double preco, String cor, String marca, String modelo) {
        setComprimento(comprimento);
        setLargura(largura);
        setPreco(preco);
        setCor(cor);
        setMarca(marca);
        setModelo(modelo);
    }
    
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
        try{
        System.out.print("Digite o comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite a cor: ");
        setCor(sc.nextLine());
        System.out.print("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.print("Digite o modelo: ");
        setModelo(sc.nextLine());
        continua=false;
        }catch(NumberFormatException nfe){
            System.out.println("Exceção gerada: " +nfe.getMessage());
        }catch(Exception e){
            System.out.println("Exceção gerada: " +e.getMessage());
        }
        }while(continua);
    }

    public void imprimir() {
        System.out.println("O comprimento é: " + getComprimento());
        System.out.println("A largura é: " + getLargura());
        System.out.println("O preço é: " + getPreco());
        System.out.println("A cor é: " + getCor());
        System.out.println("A marca é: " + getMarca());
        System.out.println("O modelo é: " + getModelo());
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
