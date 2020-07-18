package thiago_xavier.parte.pkg4;

public class AppCadeira {

    public static void main(String args[]) {
        Cadeira c1 = new Cadeira();

        c1.setAcolchoamento(true);
        c1.setCor("Azul");
        c1.setPcd(false);
        c1.setPeso(2.5);
        c1.setQuantidade(5);

        System.out.println("A cadeira terá acolchoamento? " + c1.getAcolchoamento());
        System.out.println("Qual será a cor da cadeira? " + c1.getCor());
        System.out.println("A cadeira é para pessoas com deficiência? " + c1.getPcd());
        System.out.println("Qual o peso da cadeira? " + c1.getPeso());
        System.out.println("Qual a quantidade de cadeiras necessárias? " + c1.getQuantidade());

    }

}
