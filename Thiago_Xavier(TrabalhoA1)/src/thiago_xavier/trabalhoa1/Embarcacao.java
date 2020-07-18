package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class Embarcacao {

    double alturaCalado, preco;
    String cor, identificacao, marca, modelo, tipoCasco;
    int numeroPassageiros, velocidadeMaxima;

    //Método Contrutor #1
    public Embarcacao() {

    }

    //Método Contrutor #2
    public Embarcacao(double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #3
    public Embarcacao(double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, double ac) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #4
    public Embarcacao(String cor, String id, String ma, String mo, String tc, int np, int vm, double ac, double pr) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #5
    public Embarcacao(String id, String ma, String mo, String tc, int np, int vm, double ac, double pr, String cor) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #6
    public Embarcacao(String ma, String mo, String tc, int np, int vm, double ac, double pr, String cor, String id) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #7
    public Embarcacao(String mo, String tc, int np, int vm, double ac, double pr, String cor, String id, String ma) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #8
    public Embarcacao(String tc, int np, int vm, double ac, double pr, String cor, String id, String ma, String mo) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #9
    public Embarcacao(int np, int vm, double ac, double pr, String cor, String id, String ma, String mo, String tc) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #10
    public Embarcacao(int vm, double ac, double pr, String cor, String id, String ma, String mo, String tc, int np) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #11
    public Embarcacao(String cor, String id, String ma, String mo, String tc, double pr, double ac, int np, int vm) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #12
    public Embarcacao(String cor, String id, String ma, String mo, String tc, int np, double ac, int vm, double pr) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setTipoCasco(tc);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    //Método Contrutor #13
    public Embarcacao(String cor, String id, String ma, String mo, double ac, int vm, double pr, int np) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    public void cadastrar(double ac, double pr, String cor, String id, String ma, String mo, int np, int vm) {
        setAlturaCalado(ac);
        setPreco(pr);
        setCor(cor);
        setIdentificacao(id);
        setMarca(ma);
        setModelo(mo);
        setNumeroPassageiros(np);
        setVelocidadeMaxima(vm);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a altura do calado: ");
        setAlturaCalado(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite o preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));

        System.out.println("Digite a cor: ");
        setCor(sc.nextLine());

        System.out.println("Digite a identificação: ");
        setIdentificacao(sc.nextLine());

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());

        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());

        System.out.println("Digite numero de passageiros: ");
        setNumeroPassageiros(Integer.parseInt(sc.nextLine()));

        System.out.println("Digite a velocidade a máxima: ");
        setVelocidadeMaxima(Integer.parseInt(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("A altura do calado é: " + getAlturaCalado());
        System.out.println("O preço é: " + getPreco());
        System.out.println("A cor é: " + getCor());
        System.out.println("A identificação é: " + getIdentificacao());
        System.out.println("A marca é: " + getMarca());
        System.out.println("O modelo é: " + getModelo());
        System.out.println("O número de passageiros é: " + getNumeroPassageiros());
        System.out.println("A velocidade máxima é: " + getVelocidadeMaxima());
    }

    public void setAlturaCalado(double ac) {
        alturaCalado = ac;
    }

    public double getAlturaCalado() {
        return alturaCalado;
    }

    public void setPreco(double pr) {
        preco = pr;
    }

    public double getPreco() {
        return preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setIdentificacao(String id) {
        identificacao = id;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String mo) {
        modelo = mo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setTipoCasco(String tc) {
        tipoCasco = tc;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setNumeroPassageiros(int np) {
        numeroPassageiros = np;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setVelocidadeMaxima(int vm) {
        velocidadeMaxima = vm;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

}
