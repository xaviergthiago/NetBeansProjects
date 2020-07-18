package a2.objetos;

import a2.classes.Aviao;

public class AppAviao {

    public static void main(String[] args) {

        Aviao a[] = new Aviao[5];
        
        try{
            for (int i = 0; i < 5; i++) {
            a[i] = new Aviao();
            a[i].entradaDados();
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
            a[i].imprimir();
            System.out.println("");
        }

    }
}
