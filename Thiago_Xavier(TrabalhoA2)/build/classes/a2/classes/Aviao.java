package a2.classes;

import java.util.Scanner;

public class Aviao extends Veiculo implements Desconto{

    private String identificacao;
    private static final double DESCONTO_AVIAO = 0.08;
    public Motor motor1, motor2, motor3, motor4;

    //MC1
    public Aviao() {
        motor1 = new Motor();
        motor2 = new Motor();
        motor3 = new Motor();
        motor4 = new Motor();
    }

    //MC2
    public Aviao(String identificacao, double comprimento, double largura, double preco, String cor, String marca, String modelo) {
        super(comprimento, largura, preco, cor, marca, modelo);
        motor1 = new Motor();
        motor2 = new Motor();
        motor3 = new Motor();
        motor4 = new Motor();
        this.identificacao = identificacao;
    }

    //MC3
    public Aviao(
            double peso1, double preco1, int rpm1, int velocidade1, String tipo1, 
            double peso2, double preco2, int rpm2, int velocidade2, String tipo2,
            double peso3, double preco3, int rpm3, int velocidade3, String tipo3,
            double peso4, double preco4, int rpm4, int velocidade4, String tipo4
            ) {
        motor1 = new Motor(peso1, preco1, rpm1, velocidade1, tipo1);
        motor2 = new Motor(peso2, preco2, rpm2, velocidade2, tipo2);
        motor3 = new Motor(peso3, preco3, rpm3, velocidade3, tipo3);
        motor4 = new Motor(peso4, preco4, rpm4, velocidade4, tipo4);
    }

    //MC4
    public Aviao(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
        motor1 = new Motor();
        motor2 = new Motor();
        motor3 = new Motor();
        motor4 = new Motor();
    }

    //MC5
    public Aviao(String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        motor1 = new Motor();
        motor2 = new Motor();
        motor3 = new Motor();
        motor4 = new Motor();
    }

    @Override
    public double valorDesconto(){
        return getPreco()-(getPreco()*DESCONTO_AVIAO);
    }
    
    public void cadastrar(double comprimento, double largura, double preco, String cor, String marca, String modelo, String nome, String identificacao) {
        super.cadastrar(comprimento, largura, preco, cor, marca, modelo);
        setIdentificacao(identificacao);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
        try{
        System.out.print("Digite a identificacao: ");
        setIdentificacao(sc.nextLine());
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
        System.out.println("A identificacao é: " + getIdentificacao());
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

}
