package mx.edu.uam.practica3;

import mx.edu.uam.practica3.electrodomestico.Estereo;
import mx.edu.uam.practica3.electrodomestico.Television;
import java.util.Scanner; 
/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("T E L E V I S O R \n");
        Television tv = new Television("SONY", 54, true, 2, 25);
        tv.isEncendido();
        tv.getMarca();
        tv.getPulgadas();
        tv.getCanalActual();
        tv.getVolumenActual();
        
        System.out.println("\n E S T E R E O");
        Estereo estereo = new Estereo("SAMSUNG", true, (float) 955.3, 49);
        estereo.isEncendido();
        estereo.getMarca();
        estereo.getEstacionActual();
        estereo.getVolumenActual();
        
        System.out.println("Que control desea tomar ?");
        
        
    }
    
}
