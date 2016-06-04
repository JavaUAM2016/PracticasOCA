package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Radio;

/**
 *
 * @author invited
 */
public class ControlRadio {
    
    /*Un solo boton de encendido/apagado*/
    public void enciendeRadio(Radio r){
        if(!r.isEncendido()){//apagado
            System.out.println("<< POWER ON >>\n");
            r.setEncendido(true);
        }
        else{
            System.out.println("[[ POWER OFF ]]\n");
            r.setEncendido(false);
        }
    }
    
    /*Un solo boton de encendido/apagado*/
    public void apagaRadio(Radio r){
        if(r.isEncendido()){
            System.out.println("[[ POWER OFF ]]\n");
            r.setEncendido(false);
        }
        else{
            System.out.println("<< POWER ON >>\n");
            r.setEncendido(true);
        }   
    }
    
    public void subeVol(Radio r){
        if(r.getVolumenActual() >= 0 && r.getVolumenActual() < r.getVolMax()){
            r.setVolumenActual(r.getVolumenActual()+1);
            System.out.println("VOL |||||||||||||||||+\n");    
        }
        else
            System.out.println("Tecla [VOL +] invalida...\n");
    } 
    
    public void bajaVol(Radio r){
        if(r.getVolumenActual() > 0 && r.getVolumenActual() <= r.getVolMax()){
            r.setVolumenActual(r.getVolumenActual()-1);
            System.out.println("VOL -|||||\n");    
        }
        else
            System.out.println("Tecla [VOL -] invalida...\n");
    }   
    
    public void subeEstacion(Radio r){
        if(r.getEstacionActual() >= 0 && r.getEstacionActual() < r.getEstacionesMax()){
            r.setEstacionActual(r.getEstacionActual()+2.5 );
            System.out.println("FM/AM - |||||||||["+r.getEstacionActual()+"] +\n");
        }
        else
            System.out.println("Tecla [FM/AM + ] invalida...\n");
    }
    
    public void bajaEstacion(Radio r){
        if(r.getEstacionActual() > 0 && r.getEstacionActual() <=r.getEstacionesMax()){
            r.setEstacionActual(r.getEstacionActual()-2.5);
            System.out.println("FM/AM - ["+r.getEstacionActual()+"]|||| +\n");
        }
        else
            System.out.println("Tecla [FM/AM -] invalida...\n");
    }
        
    public void cambiaEstacion(Radio r, double d){
        if(d > 0 && d <= r.getEstacionesMax()){
            r.setEstacionActual(d);
            System.out.println("FM/AM - |||["+d+"]||| +\n");
        }
        else
            System.out.println("Estacion NO VALIDA...\n");
    }
    
}//fin class
