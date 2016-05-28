package mx.edu.uam.practica2;
import mx.edu.uam.practica2.dispositivos.Celular;

/**
 *
 * @author invited
 */
public class Aplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular celularHuawei = new Celular();
        Celular celularIphone6s = new Celular("6S", "Iphone", 16000.00, "Negro", 554871257L, true);
        
        //System.out.println("Precio: " + celularHuawei.precio);
        System.out.println("Modelo: " + celularIphone6s.modelo);
        
        celularIphone6s.marcaNumero(5548796431L);
        celularIphone6s.colgar();
        celularIphone6s.recibirLlamada();
        celularIphone6s.marcaNumero(5548216431L);
        celularIphone6s.conectarseInternet("http://google.com.mx");
        
        
        System.out.println("");
        System.out.println("Modelo: " + celularHuawei.modelo);
        celularHuawei.marcaNumero(55452487431L);
        celularHuawei.colgar();
        celularHuawei.recibirLlamada();
        celularHuawei.marcaNumero(554831L);
        celularHuawei.marcaNumero(554831L);
        celularHuawei.colgar();
        celularHuawei.conectarseInternet("http://facebook.com.mx");
        
    }
    
}
