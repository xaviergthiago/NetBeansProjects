package a2.objetos;

import a2.classes.Carro;

public class AppCarro {

    public static void main(String[] args) {

        Carro c[] = new Carro[5];
        
        try{
            for (int i = 0; i < 5; i++) {
            c[i] = new Carro();
            c[i].entradaDados();
            System.out.println("");
            }
        }catch(NullPointerException npe){
        System.out.println("Erro:" + npe.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException aie){ System.out.println("Erro:" + aie.getMessage());
        }
        catch(Exception e){
        System.out.println("Erro:" + e.getMessage());
        }    

        for (int i = 0; i < 5; i++) {
            c[i].imprimir();
            System.out.println("");
        }
    }
}
