package classes.parte9.ex2;

import java.util.Scanner;

public class Aviao extends Veiculo {

    private String prefixo, dataRevisao;
    private double perc;
    public Motor motor1, motor2;

    public void setPrefixo(String pr) {
        prefixo = pr;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setDataRevisao(String dr) {
        dataRevisao = dr;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    //MC1
    public Aviao() {
        motor1 = new Motor();
        motor2 = new Motor();
    }

    //MC2
    public Aviao(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
    }

    //MC3
    public Aviao(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, double preco) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setPreco(preco);
    }

    //MC4
    public Aviao(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, int ct, int np) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setCapacidadeTanque(ct);
        setNumeroPassageiros(np);
    }

    //MC5
    public Aviao(int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, String pr) {
        motor1 = new Motor(rm1, ra1, tc1);
        motor2 = new Motor(rm2, ra2, tc2);
        setPrefixo(pr);
    }

    public void cadastrar(int ct, int np, double preco, int rm1, int ra1, String tc1, int rm2, int ra2, String tc2, String pr, String dr) {
        super.cadastrar(ct, np, preco);
        motor1.cadastrar(ra1, rm1, tc1);
        motor2.cadastrar(ra2, rm2, tc2);
        setDataRevisao(dr);
        setPrefixo(pr);
    }

    @Override
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        motor1.entradaDados();
        motor2.entradaDados();
        System.out.println("Digite o prefixo: ");
        setPrefixo(sc.nextLine());
        System.out.println("Digite a data de revisão: ");
        setDataRevisao(sc.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        motor1.imprimir();
        motor2.imprimir();

        if (prefixo != null) {
            System.out.println("O prefixo é: " + getPrefixo());
        }
        if (dataRevisao != null) {
            System.out.println("A data de revisão é: " + getDataRevisao());
        }
    }

    public double reajustarPreco(double perc) {
        return getPreco() + (getPreco() * perc / 100);
    }

}
