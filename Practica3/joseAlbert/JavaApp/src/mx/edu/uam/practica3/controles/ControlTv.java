package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electrodomesticos.Television;

/**
 *
 * @author invited
 */
public class ControlTv {
    
    public static void enciende(Television tv){
        if(tv.getEncendido()==false)
            tv.setEncendido(true);
        else
            System.out.println("La TV ya está encendida");
    }
    
    public static void apaga(Television tv){
        if(tv.getEncendido()==false)
            System.out.println("La TV ya está apagada");
        else
            tv.setEncendido(false);
    }
    
    public static void subeVolumen(Television tv){
        tv.setVolumenActual(tv.getVolumenActual()+1);
    }
    
    public static void bajaVolumen(Television tv){
        tv.setVolumenActual(tv.getVolumenActual()-1);
    }
    
    public static void subeCanal(Television tv){
        tv.setCanalActual(tv.getCanalActual()+1);
    }
    
    public static void bajaCanal(Television tv){
        tv.setCanalActual(tv.getCanalActual()-1);
    }
    
    public static void cambiaCanal(Television tv, int canal){
        tv.setCanalActual(canal);
    }
        
}
