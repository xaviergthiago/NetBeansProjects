package a3.objetos;

import a3.classes.Celular;

public class AppCelular {

    public static void main(String[] args) {

        Celular c[] = new Celular[5];

        try {
            for (int i = 0; i < 5; i++) {
                c[i] = new Celular();
                c[i].entradaDados();
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
            c[i].imprimir();
            System.out.println("");
        }
    }
}
