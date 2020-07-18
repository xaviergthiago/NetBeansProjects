package thiago_xavier.parte.pkg4;

public class Mesa {

    double altura, largura, comprimento;
    String cor;
    int pes;

    public void setAltura(double a) {
        if (a > 0.6) {
            altura = a;
        }
    }

    public void setLargura(double l) {
        if (l > 0.6) {
            largura = l;
        }
    }

    public void setComprimento(double comp) {
        if (comp > 0.6) {
            comprimento = comp;
        }
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setPes(int pe) {
        if ((pe == 4) || (pe == 3)) {
            pes = pe;
        } else {
            pes = 4;
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public int getPes() {
        return pes;
    }
}
