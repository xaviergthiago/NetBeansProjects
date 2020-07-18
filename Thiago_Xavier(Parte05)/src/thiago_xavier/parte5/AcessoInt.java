package thiago_xavier.parte5;

public class AcessoInt {

    String login, senha;
    int nivelAcesso = 0;

    public int acessar(String l, String s) {
        if (l.equals("Thiago") && s.equals("1234")) {
            nivelAcesso = 10;
        } else {
            nivelAcesso = 0;
        }
        return nivelAcesso;
    }

}
