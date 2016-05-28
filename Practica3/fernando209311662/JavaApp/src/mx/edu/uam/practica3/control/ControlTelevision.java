package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.electrodomestico.Television;

public class ControlTelevision {
    
    
    public void enciendeTv(Television tv){
        if(tv.isEncendido())
            System.out.println("La televisión ya estaba encendida");
        else{
            System.out.println("La televisión se está encendiendo");
            tv.setEncendido(true);
        }
        
    }
    
    public void apagaTv(Television tv){
        if(tv.isEncendido()){
            System.out.println("La televisión se está apagando");
            tv.setEncendido(false);
        }
        else
            System.out.println("La televisión ya estaba apagada");
    }
    
    public void subeVol(Television tv){
        if(tv.getVolumenActual()<tv.getVolMaximo()){
            tv.setVolumenActual((tv.getVolumenActual())+1);
            System.out.println("VOL:"+ tv.getVolumenActual());
        }
        else{
            System.out.println("No puede exceder el volumen máximo");
        }
    }
    
    public void bajaVol(Television tv){
        if(tv.getVolumenActual()>0){
            tv.setVolumenActual((tv.getVolumenActual())-1);
            System.out.println("VOL:"+ tv.getVolumenActual());   
        }
        else{
            System.out.println("No puede exceder el volumen mínimo");
        }
    }
    
    public void subeCanal(Television tv){
        if(tv.getCanalActual()<tv.getCanalMaximo()){
            tv.setCanalActual(tv.getCanalActual()+1);
            System.out.println("CANAL: "+tv.getCanalActual());
        }
        else if(tv.getCanalActual()==tv.getCanalMaximo()){
            tv.setCanalActual(1);
            System.out.println("CANAL: "+tv.getCanalActual());
        }
    }
    
    public void bajaCanal(Television tv){
        if(tv.getCanalActual()>1){
            tv.setCanalActual(tv.getCanalActual()-1);
            System.out.println("CANAL: "+tv.getCanalActual());
        }
        else{
            tv.setCanalActual(tv.getCanalMaximo());
            System.out.println("CANAL: "+tv.getCanalActual());
        }
    }
    
    public void cambiaCanal(Television tv, int canal){
        if(canal>tv.getCanalMaximo() || canal<1){
            System.out.println("ERROR, canal inválido");
        }
        else{
            tv.setCanalActual(canal);
            System.out.println("CANAL: "+tv.getCanalActual());
        }
        
    }
    
}
