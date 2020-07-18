package thiago_xavier.parte1;

public class Area {

    double altura, largura, profundidade;

    public void setAltura(double a) {
        if (a > 0) {
            altura = a;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double l) {
        if (l > 0) {
            largura = l;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setProfundidade(double p) {
        if (p > 0) {
            profundidade = p;
        }
    }

    public double getProfundidade() {
        return profundidade;
    }

}
