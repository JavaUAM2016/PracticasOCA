package mx.edu.uam.practica2;
import mx.edu.uam.practica2.dispositivos.Celular;
/**
 *
 * @author sidlors
 */
public class Aplicativo {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Celular celularHuawei= new Celular();
       Celular celularIphone6s=new Celular("6s","iPhone", 19000.00, "Blanco", 5345345354L, false);
        //System.out.println("precio " + celularHuawei.precio);
        System.out.println("modelo " + celularIphone6s.modelo);
        
        celularIphone6s.marcaNumero(43324234L);
        celularIphone6s.colgar();
        celularIphone6s.recibirLlamada();
         celularIphone6s.marcaNumero(43324234L);
         celularIphone6s.colgar();
         celularIphone6s.marcaNumero(43324234L);
         //Lo nuevo es que no permita hacer conexion a internet
         //cuando la linea este ocupada y mostralo en modo debbuger
        celularIphone6s.conetarseInternet("http://facebook.com");
        
        ///Ahora con el Huawei
        celularHuawei.marcaNumero(43324234L);
        celularHuawei.colgar();
        celularHuawei.recibirLlamada();
        celularHuawei.marcaNumero(43324234L);
        celularHuawei.marcaNumero(43324234L);
        celularHuawei.conetarseInternet("http://twitter.com");    
        System.out.println(celularHuawei.modelo);
                
                
        
    }
    
}
