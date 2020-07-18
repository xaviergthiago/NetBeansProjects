package classes.part9.ex1;

public class Caneta {

    private String marca, cor;
    private double preco;
    private int quantidade;

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setCor(String c) {
        if (!c.isEmpty() && c.length() > 2) {
            cor = c;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setPreco(double p) {
        if (p > 0) {
            preco = p;
        }
    }
    
    
    public double getPreco(){
        return preco;
    }

    public void setQuantidade(int q) {
        quantidade = q;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
