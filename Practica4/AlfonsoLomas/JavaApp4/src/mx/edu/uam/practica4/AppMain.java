
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTv;
import mx.edu.uam.practica4.control.ControlVentilador;
import mx.edu.uam.practica4.electrodomestico.BlueRay;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.electrodomestico.Television;
import mx.edu.uam.practica4.electrodomestico.Ventilador;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;

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
        Electrodomestico television = new Television("Sorny", 15, false, 5, 950, 10, 100);
        ControlRemoto controlTv = new ControlTv();
        
        Electrodomestico ventilador = new Ventilador("AIRE", 90, false, 10, 50);
        ControlRemoto controlVentilador = new ControlVentilador();
        
        ControlRemoto[] controles = {controlTv,controlVentilador};
        
        Familiar papa = new Padre();
        
        papa.setControlRemoto(controles);
        controlTv = papa.getControlRemoto()[0];
        controlTv.apagar(television);
        
        
//        controlTv.powerTv(television);
//        System.out.println("cambios en volumen");
//        controlTv.subeVolumen(television);
//        controlTv.bajaVolumen(television);
//        System.out.println("cambios en canal");
//        controlTv.subeCanal(television);
//        controlTv.bajaCanal(television);
//        controlTv.cambiaCanal(television, 700);
//        
//        System.out.println("");
//        
//        Ventilador ventilador = new Ventilador("AIRE", 90, false, 10, 50);
//        ControlVentilador controlVent = new ControlVentilador();
//        
//        controlVent.powerVentilador(ventilador);
//        System.out.println("cambios en velocidad");
//        controlVent.subeVelocidad(ventilador);
//        controlVent.bajaVelocidad(ventilador);
//        controlVent.cambiaVelocidad(ventilador, 40);
//        
//        System.out.println("");
        
    }
    
    
    
}
