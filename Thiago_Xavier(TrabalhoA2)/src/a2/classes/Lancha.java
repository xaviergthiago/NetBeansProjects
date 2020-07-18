package a2.classes;

import java.util.Scanner;

public class Lancha extends Veiculo implements Desconto{

    private String nome;
    private static final double DESCONTO_LANCHA = 0.10;
    public Motor motor1, motor2;

    //MC1
    public Lancha() {
        motor1 = new Motor();
        motor2 = new Motor();
    }

    //MC2
    public Lancha(String nome, double comprimento, double largura, double preco, String cor, String marca, String modelo) {
        super(comprimento, largura, preco, cor, marca, modelo);
        motor1 = new Motor();
        motor2 = new Motor();
        this.nome = nome;
    }

    //MC3
    public Lancha(double peso1, double preco1, int rpm1, int velocidade1, String tipo1, double peso2, double preco2, int rpm2, int velocidade2, String tipo2) {
        motor1 = new Motor(peso1, preco1, rpm1, velocidade1, tipo1);
        motor2 = new Motor(peso2, preco2, rpm2, velocidade2, tipo2);
    }

    //MC4
    public Lancha(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
        motor1 = new Motor();
        motor2 = new Motor();
    }

    //MC5
    public Lancha(String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        motor1 = new Motor();
        motor2 = new Motor();
    }

    @Override
    public double valorDesconto(){
        return getPreco()-(getPreco()*DESCONTO_LANCHA);
    }
    
    public void cadastrar(double comprimento, double largura, double preco, String cor, String marca, String modelo, String nome) {
        super.cadastrar(comprimento, largura, preco, cor, marca, modelo);
        setNome(nome);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
        try{
        System.out.print("Digite o nome: ");
        setNome(sc.nextLine());
        continua=false;
        }catch(NumberFormatException nfe){
            System.out.println("Exceção gerada: " +nfe.getMessage());
        }catch(Exception e){
            System.out.println("Exceção gerada: " +e.getMessage());
        }
        }while(continua);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("O nome é: " + getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
