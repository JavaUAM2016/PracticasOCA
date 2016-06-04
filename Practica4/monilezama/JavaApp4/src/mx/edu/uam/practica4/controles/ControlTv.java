
package mx.edu.uam.practica4.controles;
import mx.edu.uam.practica4.aparatos.Television;

public class ControlTv extends ControlRemoto{
   
    public void prender(Television tele){
        if(!tele.isEncendido()){
            tele.setEncendido(true);
           System.out.println("Se prendio la television...");
        }else{
            tele.setEncendido(false);
            System.out.println("Se apago la television...");
        }
            
    }
    
    
    public void subeVol(Television tele){
       if(tele.isEncendido()){
           if(tele.getVolActual()<tele.getVolMax()){
               tele.setVolActual(tele.getCanalActual()+1);
               System.out.println("Se subio el volumen..") ;
           }
            
       }else
            System.out.println("La tele esta apagada, no se puede subir el volumen..");
        
        
    }
    public void bajaVol(Television tele){
        if(tele.isEncendido()){
            if(tele.getVolActual()>0){
                tele.setVolActual(tele.getVolActual()-1);
                System.out.println("Se bajo el volumen..");
            }
        }else
            System.out.println("La tele esta apagada no se puede bajar el volumen..");
        
    }
    public void cambiaCanal(Television tele, int canal){
        if(tele.isEncendido()){
            tele.setCanalActual(canal);
            System.out.println("Se cambio el canal al .." + canal) ;
        }else
            System.out.println("La tele esta apagada no se puede cambiar el canal..");
        
        
    }
    public void subeCanal(Television tele){
        if(tele.isEncendido()){
            tele.setCanalActual(tele.getCanalActual()+1);
        System.out.println("Se subio el canal..") ;
        }
        else
            System.out.println("La tele esta apagada no se puede subir el canal..");
        
        
    }
    
    public void bajaCanal (Television tele){
        if(tele.isEncendido()){
            tele.setCanalActual(tele.getCanalActual()-1);
            System.out.println("Se bajo el canal..") ;
        }else
            System.out.println("La tele esta apagada no se puede bajar el canal..");
        
        
    }
    
}
