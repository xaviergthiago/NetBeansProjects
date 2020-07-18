package thiago_xavier.parte6;

import java.util.Scanner;

public class Navio extends Transporte {

    String nome, dataLancamento;
    int numeroTripulantes;
    double taxaPassTrip;

    public Navio() {

    }

    public Navio(int np, int ct, double p, String no, String dl, int nt) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }

    public Navio(int nt, int np, int ct, double p, String no, String dl) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }

    public Navio(String dl, int nt, int np, int ct, double p, String no) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }

    public Navio(String no, String dl, int nt, int np, int ct, double p) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }

    public Navio(double p, String no, String dl, int nt, int np, int ct) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }
    
    public double passageiros_PorTripulantes(){
        taxaPassTrip = (double)numeroPassageiros/numeroTripulantes;
        return taxaPassTrip;
    }
    
    public void passageirosPorTripulantes(){
        taxaPassTrip = (double)numeroPassageiros/numeroTripulantes;
        System.out.println("Taxa de passageiros por tripulantes é de: " +taxaPassTrip);
    }

    public void cadastrar(String pr, String dr, int ct, int np, double p, String no, String dl, int nt) {
        super.cadastrar(np, ct, p);
        setNome(no);
        setDataLancamento(dl);
        setNumeroTripulantes(nt);

    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o nome: ");
        setNome(sc.nextLine());
        System.out.println("Digite a data de lançamento: ");
        setDataLancamento(sc.nextLine());
        System.out.println("Digite o número de tripulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Nome do navio: " + getNome());
        System.out.println("Data de lançamento: " + getDataLancamento());
        System.out.println("Número de tripulantes: " + getNumeroTripulantes());
    }

    public void setNome(String no) {
        nome = no;
    }

    public String getNome() {
        return nome;
    }

    public void setDataLancamento(String dl) {
        dataLancamento = dl;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setNumeroTripulantes(int nt) {
        numeroTripulantes = nt;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

}
