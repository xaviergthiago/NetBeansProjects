package thiago_xavier.parte.pkg4;

public class Cadeira {

    String cor;
    double peso;
    boolean pcd, acolchoamento; //pcd é sigla para portadores de deficiência
    int quantidade;

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
