package a2.classes;

import java.util.Scanner;

public class Carro extends Veiculo implements Desconto{

    private String placa;
    private static final double DESCONTO_CARRO = 0.15;
    public Motor motor1;

    //MC1
    public Carro() {
        motor1 = new Motor();
    }

    //MC2
    public Carro(String placa, double comprimento, double largura, double preco, String cor, String marca, String modelo) {
        super(comprimento, largura, preco, cor, marca, modelo);
        motor1 = new Motor();
        this.placa = placa;
    }

    //MC3
    public Carro(double peso1, double preco1, int rpm1, int velocidade1, String tipo1) {
        motor1 = new Motor(peso1, preco1, rpm1, velocidade1, tipo1);
    }

    //MC4
    public Carro(double comprimento, double largura, double preco) {
        super(comprimento, largura, preco);
        motor1 = new Motor();
    }

    //MC5
    public Carro(String cor, String marca, String modelo) {
        super(cor, marca, modelo);
        motor1 = new Motor();
    }

    @Override
    public double valorDesconto(){
        return getPreco()-(getPreco()*DESCONTO_CARRO);
    }
    
    public void cadastrar(String placa, double comprimento, double largura, double preco, String cor, String marca, String modelo, String nome) {
        super.cadastrar(comprimento, largura, preco, cor, marca, modelo);
        setPlaca(placa);
    }

    @Override
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        boolean continua = true;
        do{
        try{
        System.out.print("Digite a placa: ");
        setPlaca(sc.nextLine());
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
        System.out.println("A placa é: " + getPlaca());
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
