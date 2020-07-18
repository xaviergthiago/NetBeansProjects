package thiago_xavier.parte.pkg4;

public class AppCarro {

    public static void main(String args[]) {
        Carro c1 = new Carro();
        c1.setPcd(true);
        c1.setMarca("Fiat");
        c1.setAno(2019);
        c1.setPlaca("KYZ 1939");
        c1.setPreco(25000);

        System.out.println("É para pessoas com deficiência? " + c1.getPcd());
        System.out.println("Qual é a marca? " + c1.getMarca());
        System.out.println("Qual o ano? " + c1.getAno());
        System.out.println("Qual a placa? " + c1.getPlaca());
        System.out.println("Qual o preço? " + c1.getPreco());
    }

}
