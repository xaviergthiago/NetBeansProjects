package thiago_xavier.parte5;

public class AcessoIntEvolucao {
    String login, senha;
    int token;
    int nivelAcesso = 0;

    public int acessar(String l, String s) {
        if (l.equals("Thiago") && s.equals("1234")) {
            nivelAcesso = 10;
        } else {
            nivelAcesso = 0;
        }
        return nivelAcesso;
    }
    
    public int acessar(String l, String s, int t) {
        if (l.equals("Thiago") && s.equals("1234") && t==4567) {
            nivelAcesso = 8;
        } else {
            nivelAcesso = 0;
        }
        return nivelAcesso;
    }
}
