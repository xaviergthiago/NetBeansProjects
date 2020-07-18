package classes.part9.ex1;

public class Televisao {

    private int polegadas;
    private boolean telaPlana;
    private String marca;
    private double peso;
    private char cor;

    public void setPolegadas(int pol) {
        if (pol > 15) {
            polegadas = pol;
        }
    }

    public void setTelaPlana(boolean tp) {
        telaPlana = tp;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public void setPeso(double p) {
        if (p > 0.5) {
            peso = p;
        }
    }

    public void setCor(char c) {
        cor = c;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public boolean getTelaPlana() {
        return telaPlana;
    }

    public String getMarca() {
        return marca;
    }

    public double getPeso() {
        return peso;
    }

    public char getCor() {
        return cor;
    }

}
