package cursoemvideo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraIdiomaResolucao {
    public static void main(String[] args) {
       
        Date relogio = new Date();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println (loc.getDisplayLanguage()); // imprime “Português”
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + "X"  + d.height);  
    }
    
}

