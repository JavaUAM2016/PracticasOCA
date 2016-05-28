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
        Celular celularIPhone6s = new Celular("6S", "IPhone", 19000.00, "Blanco", 5551808719L, true);
        //System.out.println("Objeto creado "+ celularHuawei);
        System.out.println("Objeto creado "+ celularIPhone6s.modelo);
        
        System.out.println("IPHONE");
        celularIPhone6s.marcaNumero(5551808719L);
        celularIPhone6s.colgar();
        celularIPhone6s.recibirLlamada();
        celularIPhone6s.marcaNumero(5551808719L);
        celularIPhone6s.colgar();
        celularIPhone6s.marcaNumero(5551808719L);
        celularIPhone6s.conectarseInternet("http://facebook.com");
        
        // Huawei
        System.out.println("HUAWEI");
        celularHuawei.marcaNumero(5551808719L);
        celularHuawei.colgar();
        celularHuawei.recibirLlamada();
        celularHuawei.marcaNumero(5551808719L);
        celularHuawei.marcaNumero(5551808719L);
        celularHuawei.conectarseInternet("http://twitter.com");

        
    }
    
}
