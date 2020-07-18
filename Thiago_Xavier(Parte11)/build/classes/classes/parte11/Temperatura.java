
package classes.parte11;

import java.util.Scanner;


public class Temperatura {
    private double temperatura;

    public Temperatura(){
        
    }
    
    public void cadastrar(double temperatura){
        setTemperatura(temperatura);
    }
    
    public void imprimir(){
        System.out.println("A temperatura é: " +getTemperatura());
    }
    
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura: ");
        setTemperatura(Double.parseDouble(sc.nextLine()));
    }

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }      
}
