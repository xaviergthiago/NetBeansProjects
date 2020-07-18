package thiago_xavier.parte5;

public class AcessoConstrutor {

    String login, senha;
    int token;
    int nivelAcesso = 0;
                                                  //O programa não quer que instancie os dados de acsso sem login e senha
    public AcessoConstrutor(String l, String s) { //Sempre pública, mesmo da nome da classe principal, não retorna valor (nem void).
        if (l.equals("Thiago") && s.equals("1234")) {
            nivelAcesso = 10;
        } else {
            nivelAcesso = 0;
        }

    }

    public AcessoConstrutor(String l, String s, int t) {
        if (l.equals("Thiago") && s.equals("1234") && t == 4567) {
            nivelAcesso = 8;
        } else {
            nivelAcesso = 0;
        }

    }

}
