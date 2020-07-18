package classes.parte10;

import java.util.Scanner;

public class Geladeira extends Eletrodomestico {

    private double temperaturaMinima, temperaturaMaxima;
    private static final double DESCONTO_GELADEIRA = 0.15;

    public void setTemperaturaMinima(double tmin) {
        temperaturaMinima = tmin;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMaxima(double tmax) {
        temperaturaMaxima = tmax;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    //MC1
    public Geladeira() {

    }

    //MC2
    public Geladeira(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2) {
        super(la1, co1, vi1, la2, co2, vi2);
    }

    //MC3
    public Geladeira(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr) {
        super(la1, co1, vi1, la2, co2, vi2, ma, mo, vo, pr);
    }

    //MC4
    public Geladeira(String ma, String mo, int vo, double pr) {
        super(ma, mo, vo, pr);
    }

    //MC5
    public Geladeira(String ma, String mo) {
        super(ma, mo);
    }

    //MC6
    public Geladeira(int vo, double pr) {
        super(vo, pr);
    }

    //MC7
    public Geladeira(double tmin, double tmax) {
        setTemperaturaMinima(tmin);
        setTemperaturaMaxima(tmax);
    }

    //MC8
    public Geladeira(double tmin, double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr) {
        super(la1, co1, vi1, la2, co2, vi2, ma, mo, vo, pr);
        setTemperaturaMinima(tmin);
    }

    //MC9
    public Geladeira(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr, double tmax) {
        super(la1, co1, vi1, la2, co2, vi2, ma, mo, vo, pr);
        setTemperaturaMaxima(tmax);
    }

    //MC10
    public Geladeira(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr, double tmax, double tmin) {
        super(la1, co1, vi1, la2, co2, vi2, ma, mo, vo, pr);
        setTemperaturaMaxima(tmax);
        setTemperaturaMinima(tmin);
    }

    public void cadastrar(double la1, double co1, boolean vi1, double la2, double co2, boolean vi2, String ma, String mo, int vo, double pr, double tmax, double tmin) {
        super.cadastrar(ma, mo, vo, pr);
        porta1 = new Porta(la1, co1, vi1);
        porta2 = new Porta(la2, co2, vi2);
        setTemperaturaMaxima(tmax);
        setTemperaturaMinima(tmin);        
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        porta1.entradaDados();
        porta2.entradaDados();
        System.out.println("Digite o valor da temperatura mínima: ");
        setTemperaturaMinima(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o valor da temperatura máxima: ");
        setTemperaturaMaxima(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        porta1.imprimir();
        porta2.imprimir();
        System.out.println("A temperatura máxima é: " + getTemperaturaMaxima());
        System.out.println("A temperatura mínima é: " + getTemperaturaMinima());
    }
    
    @Override
    public double desconto() {
        return getPreco() - (DESCONTO_GELADEIRA * getPreco());
    }

}
