package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Television;

public class ControlTelevision extends Control{  
    
    public ControlTelevision(String tamPilas, int numPilas){
        setTamPilas(tamPilas);
        setNumPilas(numPilas);
    }
    
    public ControlTelevision(){
        
    }
    
    public void subeVol(Television tv){
        if(tv.isEncendido()){
            if(tv.getVolumenActual()<tv.getVolMaximo())
                tv.setVolumenActual((tv.getVolumenActual())+1);
            System.out.println("VOL:"+ tv.getVolumenActual());
        }
        
    }
    
    public void bajaVol(Television tv){
        if(tv.isEncendido()){
            if(tv.getVolumenActual()>0)
                tv.setVolumenActual((tv.getVolumenActual())-1);
            System.out.println("VOL:"+ tv.getVolumenActual());
        }
    }
    
    public void subeCanal(Television tv){
        if(tv.isEncendido()){
            if(tv.getCanalActual()>0 && tv.getCanalActual()<tv.getCanalMaximo()){
                tv.setCanalActual(tv.getCanalActual()+1);
            }
            else if(tv.getCanalActual()==tv.getCanalMaximo()){
                tv.setCanalActual(1);
            }
            System.out.println("CANAL: "+tv.getCanalActual());
        }
    }
    
    public void bajaCanal(Television tv){
        if(tv.isEncendido()){
            if(tv.getCanalActual()>1 && tv.getCanalActual()<=tv.getCanalMaximo()){
                tv.setCanalActual(tv.getCanalActual()-1);
            }
            else if(tv.getCanalActual()==1){
                tv.setCanalActual(tv.getCanalMaximo());
            }
            System.out.println("CANAL: "+tv.getCanalActual());
        }
    }
    
    public void cambiaCanal(Television tv, int canal){
        if(tv.isEncendido()){
            if(canal>0 && canal<=tv.getCanalMaximo())
                tv.setCanalActual(canal);
            System.out.println("CANAL: "+tv.getCanalActual());
        }
    }   
}