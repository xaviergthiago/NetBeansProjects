package aplicacao.part9.ex1;

import classes.part9.ex1.Mesa;

public class AppMesa {

    public static void main(String args[]) {
        Mesa m1 = new Mesa();
        m1.setAltura(1.5);
        m1.setLargura(0.4);
        m1.setComprimento(2);
        m1.setCor("Bege");
        m1.setPes(2);

        System.out.println("Qual a altura? " + m1.getAltura());
        System.out.println("Qual a largura? " + m1.getLargura());
        System.out.println("Qual o comprimento? : " + m1.getComprimento());
        System.out.println("Qual a cor? " + m1.getCor());
        System.out.println("Quantos pés a mesa tem? " + m1.getPes());

    }

}
