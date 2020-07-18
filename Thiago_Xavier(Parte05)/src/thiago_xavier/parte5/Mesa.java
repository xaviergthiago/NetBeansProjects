package thiago_xavier.parte5;

import java.util.Scanner;

public class Mesa {

    double altura, largura, comprimento;
    String cor, forma;
    int pes;

    public Mesa() {

    }

    public Mesa(double al, double la, double co, String c, String fo, int pe) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(double la, double co, String c, String fo, int pe, double al) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(double co, String c, String fo, int pe, double al, double la) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(String c, String fo, int pe, double al, double la, double co) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(String fo, int pe, double al, double la, double co, String c) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(int pe, double al, double la, double co, String c, String fo) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(double al, double la, double co) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);

    }

    public Mesa(int pe, String c, String fo) {
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(double al, double la, double co, int pe, String c, String fo) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public Mesa(String fo, String c, double al, double la, double co, int pe) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);

    }

    public void cadastrar(double al, double la, double co, String c, String fo, int pe) {
        setAltura(al);
        setLargura(la);
        setComprimento(co);
        setCor(c);
        setForma(fo);
        setPes(pe);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Altura ");
        setAltura(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a Largura ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o Comprimento ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a cor ");
        setCor(sc.nextLine());
        System.out.println("Digite o formato desejado ");
        setForma(sc.nextLine());
        System.out.println("Digite quantos pés deseja que a mesa tenha ");
        setPes(Integer.parseInt(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("Altura da mesa: " + getAltura());
        System.out.println("Largura da mesa: " + getLargura());
        System.out.println("Comprimento da mesa: " + getComprimento());
        System.out.println("Cor da mesa: " + getCor());
        System.out.println("Formato da mesa: " + getForma());
        System.out.println("Quantidade de pés que a mesa terá: " + getPes());
    }

    public void setAltura(double al) {
        if (al >= 0.7) {
            altura = al;
        } else {
            altura = 0.7;
            System.out.println("Valor digitado inválido. Altura alterada para padrão 60 cm");
        }
    }

    public void setLargura(double la) {
        if (la >= 0.7) {
            largura = la;
        } else {
            largura = 0.7;
            System.out.println("Valor digitado inválido. Largura alterada para padrão 60 cm");
        }
    }

    public void setComprimento(double co) {
        if (co >= 0.7) {
            comprimento = co;
        } else {
            comprimento = 0.7;
            System.out.println("Valor digitado inválido. Comprimento alterado para padrão 60 cm");
        }
    }

    public void setCor(String c) {
        cor = c;
    }

    public void setPes(int pe) {
        if ((pe == 4) || (pe == 3)) {
            pes = pe;
        } else {
            System.out.println("Valor digitado inválido. A mesa terá o padrão de 4 pés");
            pes = 4;
        }
    }

    public void setForma(String fo) {
        forma = fo;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public int getPes() {
        return pes;
    }

    public String getForma() {
        return forma;
    }
}
