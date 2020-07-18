
package thiago_xavier.parte5;

public class AcessoBoolean {
    String login, senha;
    
    public boolean acessar(String l, String s){
        if (l.equals("Thiago") && s.equals("1234")){
        return true;
    }
        else{
            return false;
        }
    }
    
    
    
}
