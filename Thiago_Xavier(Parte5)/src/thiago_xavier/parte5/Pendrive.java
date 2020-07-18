package thiago_xavier.parte5;

import java.util.Scanner;

public class Pendrive {

    String marca, modelo, unidade;
    int capacidade;
    double comprimento, largura, profundidade, peso, preco;

    public Pendrive(String ma, int ca, double co, double la, double pro, double pe, double pr) {
        setMarca(ma);
        setCapacidade(ca);
        setComprimento(co);
        setLargura(la);
        setProfundidade(pro);
        setPeso(pe);
        setPreco(pr);
    }

    public Pendrive() {

    }
    
     public Pendrive(String ma, int ca, double co, double la, double pro, double pe, double pr, String mo, String un) {
        setMarca(ma);
        setCapacidade(ca);
        setComprimento(co);
        setLargura(la);
        setProfundidade(pro);
        setPeso(pe);
        setPreco(pr);
        setUnidade(un);
        setModelo(mo);
    }
     
     public Pendrive(String ma, int ca, String mo, String un) {
        setMarca(ma);
        setCapacidade(ca);
        setUnidade(un);
        setModelo(mo);
    }
     
     public Pendrive(double co, double la, double pro, double pe, double pr) {
        setComprimento(co);
        setLargura(la);
        setProfundidade(pro);
        setPeso(pe);
        setPreco(pr);
    }

    public void cadastrar(String ma, int ca, double co, double la, double pro, double pe, double pr, String mo, String u) {
        setMarca(ma);
        setCapacidade(ca);
        setComprimento(co);
        setLargura(la);
        setProfundidade(pro);
        setPeso(pe);
        setPreco(pr);
        setModelo(mo);
        setUnidade(u);
    }

    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a Marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite a Capacidade: ");
        setCapacidade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Comprimento: ");
        setComprimento(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a Largura: ");
        setLargura(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a Profundidade: ");
        setProfundidade(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o Peso: ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o Preço: ");
        setPreco(Double.parseDouble(sc.nextLine()));
    }

    public void imprimir() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Largura: " + getLargura());
        System.out.println("Profundidade: " + getProfundidade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Preço: " + getPreco());
    }

    public void setMarca(String ma) {
        marca = ma;
    }

    public String getMarca() {
        return marca;
    }

    public void setCapacidade(int ca) {
        if (ca > 0) {
            capacidade = ca;
        } else {
            capacidade = 1;
            System.out.println("Capacidade inválida, valor alterado para padrão");
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setComprimento(double co) {
        if (co > 0 && co <= 8.0) {
            comprimento = co;
        } else {
            comprimento = 8.0;
            System.out.println("Comprimento inválido, valor alterado para padrão");
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double la) {
        if (la > 0 && la <= 4.0) {
            largura = la;
        } else {
            largura = 4.0;
            System.out.println("Largura inválida, valor alterado para padrão");
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setProfundidade(double pro) {
        if (pro > 0 && pro <= 2.5) {
            profundidade = pro;
        } else {
            profundidade = 2.5;
            System.out.println("Profundidade inválida, valor alterado para padrão");
        }
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setPreco(double pr) {
        if (pr > 0) {
            preco = pr;
        } else {
            preco = 1;
            System.out.println("Preço inválido, valor alterado para padrão");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPeso(double pe) {
        if (pe > 0 && pe <= 1.5) {
            peso = pe;
        } else {
            peso = 1.5;
            System.out.println("Peso inválido, valor alterado para padrão");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setModelo(String mo) {
        modelo = mo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setUnidade(String un) {
        unidade = un;
    }

    public String getUnidade() {
        return unidade;
    }

}
