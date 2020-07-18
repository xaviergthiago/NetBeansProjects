package a3.objetos;

import a3.classes.Tablet;

public class AppTablet {

    public static void main(String[] args) {

        Tablet t[] = new Tablet[5];

        try {
            for (int i = 0; i < 5; i++) {
                t[i] = new Tablet();
                t[i].entradaDados();
                System.out.println("");
            }
        } catch (NullPointerException npe) {
            System.out.println("Erro:" + npe.getMessage());
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Erro:" + aie.getMessage());
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }

        for (int i = 0; i < 5; i++) {
            t[i].imprimir();
            System.out.println("");
        }
    }
}
