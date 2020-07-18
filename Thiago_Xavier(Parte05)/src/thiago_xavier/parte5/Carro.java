package thiago_xavier.parte5;

import java.util.Scanner;

public class Carro {

    int ano;
    String placa, marca, cidade;
    double preco;
    boolean deficiente;

    public Carro() {

    }

    public Carro(int a, String pl, String ma, String ci, double pr, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String pl, String ma, String ci, double pr, boolean de, int a) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String ma, String ci, double pr, boolean de, int a, String pl) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String ci, double pr, boolean de, int a, String pl, String ma) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(double pr, boolean de, int a, String pl, String ma, String ci) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(boolean de, int a, String pl, String ma, String ci, double pr) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String pl, int a, String ma, String ci, double pr, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String pl, String ma, int a, String ci, double pr, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String pl, String ma, String ci, int a, double pr, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public Carro(String pl, String ma, String ci, double pr, int a, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public void cadastrar(int a, String pl, String ma, String ci, double pr, boolean de) {
        setAno(a);
        setPlaca(pl);
        setMarca(ma);
        setCidade(ci);
        setPreco(pr);
        setDeficiente(de);

    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o ano do carro? ");
        setAno(Integer.parseInt(sc.nextLine()));
        System.out.println("Qual a placa? ");
        setPlaca(sc.nextLine());
        System.out.println("Qual a marca? ");
        setMarca(sc.nextLine());
        System.out.println("Qual a cidade? ");
        setCidade(sc.nextLine());
        System.out.println("Qual o preço? ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a cor: ");
        setDeficiente(Boolean.parseBoolean(sc.nextLine()));

    }

    public void imprimir() {
        System.out.println("Ano: " + getAno());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cidade: " + getCidade());
        System.out.println("Preço:  " + getPreco());
        System.out.println("É para portadores de deficiência? " + getDeficiente());

    }

    public void setAno(int a) {
        if (a >= 1901) {
            ano = a;
        } else {
            System.out.println("Ano inválido. Favor, verificar");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setPlaca(String pl) {
        if (pl.length() == 7) {
            placa = pl;
        } else {
            System.out.println("Número de placa inválido. Favor, verificar");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getMarca() {
        return marca;
    }

    public void setCidade(String ci) {
        cidade = ci;
    }

    public String getCidade() {
        return cidade;
    }

    public void setPreco(double pr) {
        if (pr > 20000) {
            preco = pr;
        }
        else{
            System.out.println("Preço inválido. Favor, verificar");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setDeficiente(boolean de) {
        deficiente = de;
    }

    public boolean getDeficiente() {
        return deficiente;
    }

}
