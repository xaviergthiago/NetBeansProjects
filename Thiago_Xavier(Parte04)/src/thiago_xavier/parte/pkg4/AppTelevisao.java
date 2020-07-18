package thiago_xavier.parte.pkg4;

public class AppTelevisao {

    public static void main(String args[]) {
        Televisao t1 = new Televisao();
        t1.setCor('P');
        t1.setPeso(0.4);
        t1.setMarca("Samsung");
        t1.setPolegadas(14);
        t1.setTelaPlana(false);

        System.out.println("Cor: " + t1.getCor());
        System.out.println("Peso: " + t1.getPeso());
        System.out.println("Marca " + t1.getMarca());
        System.out.println("Polegadas " + t1.getPolegadas());
        System.out.println("Tela plana " + t1.getTelaPlana());
    }

}
