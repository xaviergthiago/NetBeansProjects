package a3.classes;

import java.util.Scanner;

public class PesoGadget extends Gadget {

    protected double peso;

    public PesoGadget() {
    }

    public PesoGadget(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso) {
        super(tipo, duracao, amperagem, cor, fabricante, preco);
        this.peso = peso;
    }

    public PesoGadget(double peso) {
        this.peso = peso;
    }

    public void cadastrar(String tipo, int duracao, double amperagem, String cor, String fabricante, double preco, double peso) {
        super.cadastrar(tipo, duracao, amperagem, cor, fabricante, preco);
        this.peso = peso;
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        boolean continua = true;
        do {
            try {
                System.out.print("Qual é o peso? ");
                setPeso(Double.parseDouble(sc.nextLine()));
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
        System.out.println("O peso é: " + getPeso());
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
