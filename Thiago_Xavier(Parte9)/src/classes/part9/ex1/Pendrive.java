package classes.part9.ex1;

public class Pendrive {

    private String marca;
    private int capacidade;
    private double comprimento, largura, profundidade, peso, preco;

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
        if (p>0){
        peso = p;
        }
        else{
            System.out.println("Valor inválido");
        }
    }

    public double getPeso() {
        return peso;
    }
}
