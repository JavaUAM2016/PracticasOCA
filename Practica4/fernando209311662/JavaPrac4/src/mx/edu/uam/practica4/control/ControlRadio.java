package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Radio;

public class ControlRadio {

    public void subeVol(Radio r){
        if(r.isEncendido()){
            if(r.getVolumenActual() >= 0 && r.getVolumenActual() < r.getVolMax())
                r.setVolumenActual(r.getVolumenActual()+1);
            System.out.println("VOL |||||||||||||||||+\n "+r.getVolumenActual());
        } 
    } 
    
    public void bajaVol(Radio r){
        if(r.isEncendido()){
            if(r.getVolumenActual() > 0 && r.getVolumenActual() <= r.getVolMax())
                r.setVolumenActual(r.getVolumenActual()-1);
            System.out.println("VOL -|||||\n "+r.getVolumenActual());
        }
    }   
    
    public void subeEstacion(Radio r){
        if(r.isEncendido()){
            if(r.getEstacionActual() >= 0 && r.getEstacionActual() < r.getEstacionesMax())
                r.setEstacionActual(r.getEstacionActual()+2.5 );
            System.out.println("FM/AM - |||||||||["+r.getEstacionActual()+"] +\n");
        } 
    }
    
    public void bajaEstacion(Radio r){
        if(r.isEncendido()){
            if(r.getEstacionActual() > 0 && r.getEstacionActual() <=r.getEstacionesMax())
                r.setEstacionActual(r.getEstacionActual()-2.5);
            System.out.println("FM/AM - ["+r.getEstacionActual()+"]|||| +\n");
        }
    }
        
    public void cambiaEstacion(Radio r, double d){
        if(r.isEncendido()){
            if(d > 0 && d <= r.getEstacionesMax())
                r.setEstacionActual(d);
            System.out.println("FM/AM - |||["+d+"]||| +\n");
        }
    }
}
