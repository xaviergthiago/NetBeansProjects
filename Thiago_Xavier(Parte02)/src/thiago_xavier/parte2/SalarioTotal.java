package thiago_xavier.parte2;

public class SalarioTotal {

    String vendedor;
    int totalVendas;
    double salario, percentual;

    public void setVendedor(String v) {
        vendedor = v;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setTotalVendas(int tv) {
        totalVendas = tv;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setSalario(double s) {
        salario = s;
    }

    public double getSalario() {
        return salario;
    }

    public void setPercentual(double p) {
        percentual = p;
    }

    public double getPercentual() {
        return percentual;
    }
}
