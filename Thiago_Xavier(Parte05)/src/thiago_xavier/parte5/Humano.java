package thiago_xavier.parte5;
import java.util.Scanner;
public class Humano {
    String sexo, nome;
    int idade;
    double peso, altura;
                        //Construtores controlam a criação do objeto.
                        //O compilador cria um método construtor vazio automaticamente
                        //A partir do momento que se cria um método construtor, se precisar de outro vazio terá que ser recriado.
    public Humano(){    //Criação de construtor vazio permite que App rode sem precisar informar critérios de aprovação
        
    }
    
    public Humano(String s, String n, int i, double p, double a){
        setNome(n);
        setSexo(s);
        setIdade(i);
        setPeso(p);
        setAltura(a);
    }
    
    public void imprimir(){
        System.out.println("Nome " +getNome());
        System.out.println("Idade " +getIdade());
        System.out.println("Sexo " +getSexo());
        System.out.println("Peso " +getPeso());
        System.out.println("Altura " +getAltura());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o Nome: ");
        setNome(sc.nextLine());
        System.out.println("Digite o Sexo: ");
        setSexo(sc.nextLine());
        System.out.println("Digite a Idade: ");
        setIdade(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o Peso: ");
        setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a Altura: ");
        setAltura(Double.parseDouble(sc.nextLine()));
    }

    
    public void setSexo(String s) {
        sexo = s;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int i) {
        idade = i;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(double p) {
        peso = p;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double a) {
        altura = a;
    }

    public double getAltura() {
        return altura;
    }

    
}
