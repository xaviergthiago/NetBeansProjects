package a3.objetos;

import a3.classes.JogoPortatil;

public class AppJogoPortatil {

    public static void main(String[] args) {

        JogoPortatil jp[] = new JogoPortatil[5];

        try {
            for (int i = 0; i < 5; i++) {
                jp[i] = new JogoPortatil();
                jp[i].entradaDados();
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
            jp[i].imprimir();
            System.out.println("");
        }
    }
}
