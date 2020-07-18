package cursoemvideo;

import java.util.Scanner;

public class TipoPrimitivos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        String v1, v2;
        double nota;
//        nome = sc.nextLine();
//        nota = sc.nextFloat();
        nome = sc.nextLine();
        nota = Double.parseDouble(sc.nextLine());
        System.out.printf("O nome é %s e a nota é %2f : ", nome, nota);
        
//        v1 = Double.toString(nota);
//        v2 = String.valueOf(nota); Converte qualquer calor pra texto
//        
//        System.out.println(v1);
//        System.out.println(v2);

    }
    
}

/*int idade = 3;
float sal = 1825.54f;
char letra = 'G';
boolean casado = false;
            TYPECAST
int idade = (int)3;
float sal = float 1825.54;
char letra = (char)'G';
boolean casado = (boolean)false;

WRAPPER CLASS
Integer idade = new Integer(3);
Float sal = new Float (1825.54);
Character letra = new Character ('G');
*/


