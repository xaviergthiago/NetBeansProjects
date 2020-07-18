package classes.parte10;

import java.util.Scanner;

public class MicroOndas extends Eletrodomestico {

    private int potenciaMinima, potenciaMaxima;
    private static final double DESCONTO_MICROONDAS = 0.12;

    public void setPotenciaMinima(int pmin) {
        potenciaMinima = pmin;
    }

    public double getPotenciaMinima() {
        return potenciaMinima;
    }

    public void setPotenciaMaxima(int pmax) {
        potenciaMaxima = pmax;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    //MC1
    public MicroOndas() {

    }

    //MC2
    public MicroOndas(double la1, double co1, boolean vi1) {
        super(la1, co1, vi1);
    }

    //MC3
    public MicroOndas(double la1, double co1, boolean vi1, String ma, String mo, int vo, double pr) {
        super(la1, co1, vi1, ma, mo, vo, pr);
    }

    //MC4
    public MicroOndas(String ma, String mo, int vo, double pr) {
        super(ma, mo, vo, pr);
    }

    //MC5
    public MicroOndas(String ma, String mo) {
        super(ma, mo);
    }

    //MC6
    public MicroOndas(int vo, double pr) {
        super(vo, pr);
    }

    //MC7
    public MicroOndas(int pmin, int pmax) {
        setPotenciaMinima(pmin);
        setPotenciaMaxima(pmax);
    }

    //MC8
    public MicroOndas(int pmin, double la1, double co1, boolean vi1, String ma, String mo, int vo, double pr) {
        super(la1, co1, vi1, ma, mo, vo, pr);
        setPotenciaMinima(pmin);
    }

    //MC9
    public MicroOndas(double la1, double co1, boolean vi1, String ma, String mo, int vo, double pr, int pmax) {
        super(la1, co1, vi1, ma, mo, vo, pr);
        setPotenciaMaxima(pmax);
    }

    //MC10
    public MicroOndas(double la1, double co1, boolean vi1, String ma, String mo, int vo, double pr, int pmax, int pmin) {
        super(la1, co1, vi1, ma, mo, vo, pr);
        setPotenciaMaxima(pmax);
        setPotenciaMinima(pmin);
    }

    public MicroOndas(String ma, String mo, double la1, double co1, boolean vi1) {
        porta1 = new Porta(la1, co1, vi1);
        setMarca(ma);
        setModelo(mo);
    }

    public void cadastrar(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr, int pmax, int pmin) {
        super.cadastrar(ma, mo, vo, pr);
        porta1 = new Porta(la1, co1, vi1);
        setPotenciaMaxima(pmax);
        setPotenciaMinima(pmin);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        porta1.entradaDados();
        System.out.println("Digite o valor da potência mínima: ");
        setPotenciaMinima(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o valor da potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        porta1.imprimir();
        System.out.println("A potência máxima é: " + getPotenciaMaxima());
        System.out.println("A potência mínima é: " + getPotenciaMinima());
    }

    @Override
    public double desconto() {
        return getPreco() - (DESCONTO_MICROONDAS * getPreco());
    }

}
