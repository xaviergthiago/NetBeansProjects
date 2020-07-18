package thiago_xavier.parte3;

public class DiasPorMes {

    int mes;

    public void setMes(int m) {
        if (m > 0 && m < 13) {
            mes = m;
        }
    }

    public int getMes() {
        return mes;
    }
}
