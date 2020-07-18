package thiago_xavier.parte6;

import java.util.Scanner;

public class Aviao extends Transporte {

    double reajuste;
    String dataRevisao, prefixo;

    public Aviao() {

    }

    public Aviao(int np, int ct, double p, String dr, String pr) {
        super(np, ct, p);
        setDataRevisao(dr);
        setPrefixo(pr);

    }

    public Aviao(String pr, int np, int ct, double p, String dr) {
        super(np, ct, p);
        setDataRevisao(dr);
        setPrefixo(pr);

    }

    public Aviao(String dr, String pr, int np, int ct, double p) {
        super(np, ct, p);
        setDataRevisao(dr);
        setPrefixo(pr);

    }

    public Aviao(double p, String dr, String pr, int np, int ct) {
        super(np, ct, p);
        setDataRevisao(dr);
        setPrefixo(pr);

    }

    public Aviao(int ct, double p, String dr, String pr, int np) {
        super(np, ct, p);
        setDataRevisao(dr);
        setPrefixo(pr);

    }

    public double reajustarPreco(double percentual) {
        if (percentual >= 0 && percentual <= 1) {
            reajuste = getPreco() + (getPreco() * percentual);
        }
        return reajuste;

    }

    public void reajustar_Preco(double percentual) {
        if (percentual >= 0 && percentual <= 1) {
            reajuste = preco + (preco * percentual);
        }
        System.out.println("Valor reajustado: " + reajuste);

    }

    public void cadastrar(String pr, String dr, int ct, int np, double p) {
        super.cadastrar(np, ct, p);
        setPrefixo(pr);
        setDataRevisao(dr);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite o prefixo: ");
        setPrefixo(sc.nextLine());
        System.out.println("Digite a data de revisão: ");
        setDataRevisao(sc.nextLine());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo: " + getPrefixo());
        System.out.println("Data de revisão: " + getDataRevisao());
    }

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

}
