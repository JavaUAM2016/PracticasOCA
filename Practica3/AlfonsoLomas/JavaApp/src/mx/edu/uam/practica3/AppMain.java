
package mx.edu.uam.practica3;

import mx.edu.uam.practica3.control.ControlTv;
import mx.edu.uam.practica3.control.ControlVentilador;
import mx.edu.uam.practica3.electrodomestico.Television;
import mx.edu.uam.practica3.electrodomestico.Ventilador;

/**
 *
 * @author AlfonsoLomas
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Television television = new Television("SONY", 15, false, 5, 950, 10, 100);
        ControlTv controlTv = new ControlTv();
        
        controlTv.powerTv(television);
        System.out.println("cambios en volumen");
        controlTv.subeVolumen(television);
        controlTv.bajaVolumen(television);
        System.out.println("cambios en canal");
        controlTv.subeCanal(television);
        controlTv.bajaCanal(television);
        controlTv.cambiaCanal(television, 700);
        
        System.out.println("");
        
        Ventilador ventilador = new Ventilador("AIRE", 90, false, 10, 50);
        ControlVentilador controlVent = new ControlVentilador();
        
        controlVent.powerVentilador(ventilador);
        System.out.println("cambios en velocidad");
        controlVent.subeVelocidad(ventilador);
        controlVent.bajaVelocidad(ventilador);
        controlVent.cambiaVelocidad(ventilador, 40);
        
        System.out.println("");
        
    }
    
}
