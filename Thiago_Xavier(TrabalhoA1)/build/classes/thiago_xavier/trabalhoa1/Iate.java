package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class Iate extends Embarcacao {
    int numeroCabines, numeroTripulantes;
    boolean piscina;
    //Método Contrutor #1
    public Iate(){
        
    }
    
    //Método Contrutor #2
    public Iate(double ac, double pr, String cor, String id, String ma, String mo, int np, int vm, int nc , int nt, boolean pi){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #2
    public Iate(double pr, String cor, String id, String ma, String mo, int np, int vm, int nc , int nt, boolean pi, double ac){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #3
    public Iate(String cor, String id, String ma, String mo, int np, int vm, int nc , int nt, boolean pi, double ac, double pr){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #4
    public Iate(String id, String ma, String mo, int np, int vm, int nc , int nt, boolean pi, double ac, double pr, String cor){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #5
    public Iate(String ma, String mo, int np, int vm, int nc , int nt, boolean pi, double ac, double pr, String cor, String id){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #6
    public Iate(String mo, int np, int vm, int nc , int nt, boolean pi, double ac, double pr, String cor, String id, String ma){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #7
    public Iate(int np, int vm, int nc , int nt, boolean pi, double ac, double pr, String cor, String id, String ma, String mo){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #8
    public Iate(int vm, int nc , int nt, boolean pi, double ac, double pr, String cor, String id, String ma, String mo, int np){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #9
    public Iate(int nc , int nt, boolean pi, double ac, double pr, String cor, String id, String ma, String mo, int np, int vm){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #10
    public Iate(int nt, boolean pi, double ac, double pr, String cor, String id, String ma, String mo, int np, int vm, int nc ){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #11
    public Iate(boolean pi, double ac, double pr, String cor, String id, String ma, String mo, int np, int vm, int nc, int nt){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #12
    public Iate(double ac, boolean pi, double pr, String cor, String id, String ma, String mo, int np, int vm, int nc, int nt){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    //Método Contrutor #13
    public Iate(double ac, double pr, boolean pi, String cor, String id, String ma, String mo, int np, int vm, int nc, int nt){
        super (cor, id, ma, mo, ac, vm, pr, np);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);
    }
    
    public void cadastrar(double ac, double pr, String cor, String id, String ma, String mo, int np, int vm, int nc , int nt, boolean pi){
        super.cadastrar(ac, pr, cor, id, ma, mo, np, vm);
        setNumeroCabines(nc);
        setNumeroTripulantes(nt);
        setPiscina(pi);        
    }
    
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o número de cabines: ");
        setNumeroCabines(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o número de tripulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
        System.out.println("O iate terá piscina? ");
        setPiscina(Boolean.parseBoolean(sc.nextLine()));
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Quantidade de cabines: " +getNumeroCabines());
        System.out.println("Quantidade de tripulantes: " +getNumeroTripulantes());
        System.out.println("Piscina: " +getPiscina());
    }
    
    public int pessoasPorCabine(){
        return (int)getNumeroTripulantes()/getNumeroCabines();
        
    }
    
     public double valorDesconto(){
        return getPreco()-(getPreco()*0.08);
    }
 
    public void setNumeroCabines(int nc){
        numeroCabines = nc;
    }
    
    public int getNumeroCabines(){
        return numeroCabines;
    }
    
    public void setNumeroTripulantes(int nt){
        numeroTripulantes = nt;
    }
    
    public int getNumeroTripulantes(){
        return numeroTripulantes;
    }
    
    public void setPiscina(boolean pi){
        piscina = pi;
    }
    
    public boolean getPiscina(){
        return piscina;
    }
    
}
