package a2.objetos;

import a2.classes.Lancha;

public class AppLancha {

    public static void main(String[] args) {

        Lancha l[] = new Lancha[5];
        
        try{
            for (int i = 0; i < 5; i++) {
            l[i] = new Lancha();
            l[i].entradaDados();
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
            l[i].imprimir();
            System.out.println("");
        }
    }
}
