package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class Jetski extends Embarcacao {
    boolean reboque;
    
    //Método Contrutor #1
    public Jetski(){
        
    }
    //Método Contrutor #2
    public Jetski (double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean re){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #3
    public Jetski (double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean re, double ac){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #4
    public Jetski (String cor, String id, String ma, String mo, String tc, int np, int vm, boolean re, double ac, double pr){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #5
    public Jetski (String id, String ma, String mo, String tc, int np, int vm, boolean re, double ac, double pr, String cor){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #6
    public Jetski (String ma, String mo, String tc, int np, int vm, boolean re, double ac, double pr, String cor, String id){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #7
    public Jetski (String mo, String tc, int np, int vm, boolean re, double ac, double pr, String cor, String id, String ma){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #8
    public Jetski (String tc, int np, int vm, boolean re, double ac, double pr, String cor, String id, String ma, String mo){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #9
    public Jetski (int np, int vm, boolean re, double ac, double pr, String cor, String id, String ma, String mo, String tc){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #10
    public Jetski (int vm, boolean re, double ac, double pr, String cor, String id, String ma, String mo, String tc, int np){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #11
    public Jetski (boolean re, double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #12
    public Jetski (double ac, boolean re, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    //Método Contrutor #13
    public Jetski (double ac, double pr, boolean re, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setReboque(re);
    }
    
    public void cadastrar(double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean re){
        super.cadastrar(ac, pr, cor, id, ma, mo, np, vm);
        setTipoCasco(tc);
        setReboque(re);
    }
    
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o tipo do casco: ");
        setTipoCasco(sc.nextLine());
        System.out.println("O jetski terá reboque? ");
        setReboque(Boolean.parseBoolean(sc.nextLine()));
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("O tipo de casco é: " + getTipoCasco());
        System.out.println("Reboque do jetski " +getReboque());
    }
    
    public double valorDesconto(){
        return getPreco()-(getPreco()*0.15);
    }
    
    public void setReboque(boolean re){
        reboque = re;
    }
    
    public boolean getReboque(){
        return reboque;
    }
    
}
