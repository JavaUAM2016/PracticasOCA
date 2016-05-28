
package mx.edu.uam.practica3.controles;
import mx.edu.uam.practica3.aparatos.Radio;

public class ControlRadio {
      private int volMax=50;
    
      public void prende(Radio radio){
        if(!radio.isEncendido()){
            radio.setEncendido(true);
           System.out.println("Se prendio el radio...");
        }else{
            radio.setEncendido(false);
            System.out.println("Se apago el radio...");
        }
             
    }
    
    public void subirVol(Radio radio){
        if(radio.isEncendido() && radio.getVolActual()< volMax){
            radio.setVolActual(radio.getVolActual()+1);
            System.out.println("Se subio el volumen del radio...");
        }
        else
            System.out.println("El radio esta apagado");
    }
    public void bajarVol(Radio radio){
        if(radio.isEncendido()){
            radio.setVolActual(radio.getVolActual()-1);
            System.out.println("Se bajo el volumen del radio..");
        }
        else
             System.out.println("El radio esta apagado");
            
    }
    
    public void cambiarEstacion(Radio radio, double estacion){
        if(radio.isEncendido()){
            radio.setEstacionActual(estacion);
            System.out.println("Se cambio la estacion a "+ estacion);
        }
        else
             System.out.println("El radio esta apagado");
    }
    
    public void subirEstacion(Radio radio){
        if(radio.isEncendido()){
            radio.setEstacionActual(radio.getEstacionActual()+1);
            System.out.println("Se subio la estacion");
        }
        else
             System.out.println("El radio esta apagado");
    }
    public void bajarEstacion(Radio radio){
        if(radio.isEncendido()){
            radio.setEstacionActual(radio.getEstacionActual()-1);
            System.out.println("Se bajo la estacion");
        }
        else
             System.out.println("El radio esta apagado");
    }
    
    
}
