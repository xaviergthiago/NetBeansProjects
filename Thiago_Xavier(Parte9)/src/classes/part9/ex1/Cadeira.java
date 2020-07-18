package classes.part9.ex1;

public class Cadeira {

    private String cor;
    private double peso;
    private boolean pcd, acolchoamento; //pcd é sigla para portadores de deficiência
    private int quantidade;

    public void setCor(String c) {
        cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public double getPeso() {
        return peso;
    }

    public void setPcd(boolean def) {
        pcd = def;
    }

    public boolean getPcd() {
        return pcd;
    }

    public void setQuantidade(int q) {
        quantidade = q;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setAcolchoamento(boolean ac) {
        acolchoamento = ac;
    }

    public boolean getAcolchoamento() {
        return acolchoamento;
    }
}
