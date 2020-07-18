package thiago_xavier.trabalhoa1;

import java.util.Scanner;

public class Lancha extends Embarcacao {
    boolean banheiro;
    //Método Contrutor #1
    public Lancha(){
        
    }
    //Método Contrutor #2
    public Lancha (double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean ba){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #3
    public Lancha (double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean ba, double ac){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #4
    public Lancha (String cor, String id, String ma, String mo, String tc, int np, int vm, boolean ba, double ac, double pr){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #5
    public Lancha (String id, String ma, String mo, String tc, int np, int vm, boolean ba, double ac, double pr, String cor){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #6
    public Lancha (String ma, String mo, String tc, int np, int vm, boolean ba, double ac, double pr, String cor, String id){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #7
    public Lancha (String mo, String tc, int np, int vm, boolean ba, double ac, double pr, String cor, String id, String ma){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #8
    public Lancha (String tc, int np, int vm, boolean ba, double ac, double pr, String cor, String id, String ma, String mo){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #9
    public Lancha (int np, int vm, boolean ba, double ac, double pr, String cor, String id, String ma, String mo, String tc){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #10
    public Lancha (int vm, boolean ba, double ac, double pr, String cor, String id, String ma, String mo, String tc, int np){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #11
    public Lancha (boolean ba, double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #12
    public Lancha (double ac, boolean ba, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    //Método Contrutor #13
    public Lancha (double ac, double pr, boolean ba, String cor, String id, String ma, String mo, String tc, int np, int vm){
        super(ac, pr, cor, id, ma, mo, tc, np, vm);
        setBanheiro(ba);
    }
    
    public void cadastrar(double ac, double pr, String cor, String id, String ma, String mo, String tc, int np, int vm, boolean ba){
        super.cadastrar(ac, pr, cor, id, ma, mo, np, vm);
        setTipoCasco(tc);
        setBanheiro(ba);
    }
    
    @Override
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o tipo do casco: ");
        setTipoCasco(sc.nextLine());
        System.out.println("A lancha terá banheiro? ");
        setBanheiro(Boolean.parseBoolean(sc.nextLine()));
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("O tipo de casco é: " + getTipoCasco());
        System.out.println("Banheiro na lancha: " +getBanheiro());
    }
    
    public double valorDesconto(){
        return getPreco()-(getPreco()*0.1);
    }
         
    public void setBanheiro(boolean ba){
        banheiro = ba;
    }
    
    public boolean getBanheiro(){
        return banheiro;
    }
    
}
