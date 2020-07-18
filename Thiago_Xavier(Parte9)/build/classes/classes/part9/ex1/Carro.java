package classes.part9.ex1;

public class Carro {

    private int ano;
    private String placa, marca;
    private double preco;
    private boolean pcd;

    public void setAno(int a) {
        ano = a;
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String pl) {
        placa = pl;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setPreco(double pr) {
        preco = pr;
    }

    public double getPreco() {
        return preco;
    }

    public void setPcd(boolean def) {
        pcd = def;
    }

    public boolean getPcd() {
        return pcd;
    }

}
