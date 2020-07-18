package parte8.ex1;

import java.util.Scanner;

public class Navio extends Veiculo {

    String nome, dataLancamento;
    int numeroTripulantes;
    Motor motor1, motor2;

    public void setNome(String nome) {
        this.nome = nome;
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

    //MC1
    public Navio() {
        motor1 = new Motor();
        motor2 = new Motor();
    }

    //MC2
    public Navio(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
    }

    //MC3
    public Navio(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, double preco) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setPreco(preco);
    }

    //MC4
    public Navio(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, int ct, int np) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
    }

    //MC5
    public Navio(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, String nome) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setNome(nome);
    }

    public void cadastrar(int ct, int np, double preco, int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, String nome, int nt, String dl) {
        super.cadastrar(ct, np, preco);
        motor1.cadastrar(ra1, rm1, tc1);
        motor2.cadastrar(ra2, rm2, tc2);
        setDataLancamento(dl);
        setNome(nome);
        setNumeroTripulantes(nt);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        motor1.entradaDados();
        motor2.entradaDados();
        System.out.println("Digite o nome da embarcação: ");
        setNome(sc.nextLine());
        System.out.println("Digite a data de lançamento: ");
        setDataLancamento(sc.nextLine());
        System.out.println("Digite o número de tripulantes: ");
        setNumeroTripulantes(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public void imprimir() {
        super.imprimir();
        motor1.imprimir();
        motor2.imprimir();

        if (nome != null) {
            System.out.println("O nome da embarcação é: " + getNome());
        }
        if (dataLancamento != null) {
            System.out.println("O nome da embarcação é: " + getDataLancamento());
        }
        System.out.println("O número de tripulantes é: " + getNumeroTripulantes());
    }

    public double passageirosPorTripulantes() {
        return getNumeroPassageiros() / getNumeroTripulantes();
    }
}
