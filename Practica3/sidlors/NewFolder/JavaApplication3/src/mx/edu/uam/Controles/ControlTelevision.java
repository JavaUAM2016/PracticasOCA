package mx.edu.uam.Controles;

import mx.edu.uam.dispositivos.*;
        
/**
 *
 * @author Yafte Aaron Flores
 *
 */
public class ControlTelevision {
    
    public void enciende(Television television){
        boolean estado= television.getEncendido();
        if(estado)
            System.err.println("Ya estoy prendida no me vuelvas a prender");
        else {
            television.setEncendido(true);
            System.out.println("Ya se predio la tele");
            muestraEstado(television);
        }
    }
    
    public void apaga(Television television){
        boolean estado= television.getEncendido();
        if(estado == false)
            System.err.println("Ya estoy apagada no me vuelvas a apagar");
        else {
            television.setEncendido(false);
            System.out.println("Ya se apago la tele");
            muestraEstado(television);
        }
    }

    public void subeVolumen(Television television) {
        
        if(television.getEncendido() == true){
            int volMax= television.getVolumenMax();
            int volActual= television.getVolumenActual();         
            
            if(volActual < volMax) 
                television.setVolumenActual(++volActual);
            else 
                System.err.println("No se le puede subir mas, ya tienes todo el volumen");
            
        }else
            System.err.println("Prende la Television primero, para poder subir el volumen");
       
    }
    
    public void bajaVolumen(Television television){
        if(television.getEncendido() == true){            
            int volActual= television.getVolumenActual();         
            
            if(volActual > 0) 
                television.setVolumenActual(--volActual);
            else 
                System.err.println("No se le puede bajar mas, ya tienes todo el volumen abajo");
            
        }else
            System.err.println("Prende la Television primero, para poder bajar el volumen");
    }

    public void CambiaCanal(Television television,int canal) {
        if(television.getEncendido() == true)
            if(canal>0 && canal<=250)
                television.setCanalActual(canal);
            else 
                System.err.println("No existe ese canal, se pasa del rango");
        else
            System.err.println("Prende la Television primero, para poder cambiar el canal");
    }

    public void bajaCanal(Television television) {
        if (television.getEncendido() == true) {
            int canalActual= television.getCanalActual();
            canalActual--;
            if(canalActual > 0)
                television.setCanalActual(canalActual);
            else 
                television.setCanalActual(250);
        } else  
            System.err.println("Prende la Television primero, para poder cambiar el canal");
    }

    public void SubeCanal(Television television) {  
        if (television.getEncendido() == true) {
            //Mi canal Maximo es hasta el 250, pasando de este canal vuelve a 0.
            int maxCanal= 250;
            int canalActual= television.getCanalActual();
            canalActual++;
            if(canalActual < maxCanal)
                television.setCanalActual(canalActual);
            else 
                television.setCanalActual(0);
        } else  
            System.err.println("Prende la Television primero, para poder cambiar el canal");
    }
    
    public void muestraEstado(Television television){
        System.out.println("Estado del Dispositivo");
        System.out.println("\t1. Estado: "+television.getEncendido());
        System.out.println("\t2. Canal Actual: "+television.getCanalActual());
        System.out.println("\t3. Volumen Actual: "+television.getVolumenActual());
    }
    
}
