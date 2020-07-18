package a2.classes;

import java.util.Scanner;

public class Motor {

    private double peso, preco;
    private int rpm, velocidade;
    private String tipo;
    
    //MC1
    public Motor() {

    }
    //MC2
    public Motor(double peso, double preco, int rpm, int velocidade, String tipo) {
        this.peso = peso;
        this.preco = preco;
        this.rpm = rpm;
        this.velocidade = velocidade;
        this.tipo = tipo;
    }
    //MC3
    public Motor(double peso, double preco) {
        this.peso = peso;
        this.preco = preco;
    }

    //MC4
    public Motor(int rpm, int velocidade) {
        this.rpm = rpm;
        this.velocidade = velocidade;
    }

    //MC5
    public Motor(double peso, double preco, int rpm, int velocidade) {
        this.peso = peso;
        this.preco = preco;
        this.rpm = rpm;
        this.velocidade = velocidade;
    }

    public void cadastrar (double peso, double preco, int rpm, int velocidade, String tipo) {
        setPeso(peso);
        setPreco(preco);
        setRpm(rpm);
        setVelocidade(velocidade);
        setTipo(tipo);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
        try{
        System.out.print("Digite o peso: ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.print("Digite o rpm: ");
        setRpm(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite a velocidade: ");
        setVelocidade(Integer.parseInt(sc.nextLine()));
        System.out.print("Digite o tipo: ");
        setTipo(sc.nextLine());
        continua=false;
        }catch(NumberFormatException nfe){
            System.out.println("Exceção gerada: " +nfe.getMessage());
        }catch(Exception e){
            System.out.println("Exceção gerada: " +e.getMessage());
        }
        }while(continua);
    }

    public void imprimir() {
        System.out.println("O peso é: " + getPeso());
        System.out.println("O preço é: " + getPreco());
        System.out.println("O rpm é: " + getRpm());
        System.out.println("A velocidade é: " + getVelocidade());
        System.out.println("O tipo é: " + getTipo());
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
