package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electrodomestico.Television;

/**
 *
 * @author invited
 */
public class ControlTV {

    public void enciendeTV(Television tv) {
        if(tv.isEncendido() == false){
            System.out.println("Encendiendo... !!");
            tv.setEncendido(true);            
        }else            
            System.out.println("El televisor ya esta encendido!");
    }
    
    public void apagaTV(Television tv) {
        if(tv.isEncendido() == true){
            System.out.println("Apagando... !!");
            tv.setEncendido(false);
        }else
            System.out.println("El televisor ya esta apagado!!");
    }
    
    public void subeVol(Television tv) {
        int vol = tv.getVolumenActual(); 
                
        if (tv.isEncendido() == true){
            if(vol <= 50){
                System.out.println("Volumen ++ ...");
                vol = vol++;
                tv.setVolumenActual(vol);
            }else
                System.out.println("El volumen maximo es 50!!");
        }else
            System.out.println("El televisor debe estar ENCENDIDO para poder subir el volumen.");
        
    }
    
    public void bajaVol(Television tv) {
        int vol = tv.getVolumenActual();
        
        if (tv.isEncendido() == true){
            if(vol > 0){
                System.out.println("Volumen -- ...");
                vol = vol--;
                tv.setVolumenActual(vol);
            }else
                System.out.println("El volumen MINIMO es 0!!");
        }else
            System.out.println("El televisor debe estar ENCENDIDO para poder bajar el volumen");
        
    }
    
    public void subeCanal(Television tv) {
        if (tv.isEncendido() == true){
            float canal = tv.getCanalActual();
            System.out.println("Canal ++ ...");
            canal = canal++;
            tv.setCanalActual(canal);
        }else
            System.out.println("El televisor debe estar ENCENDIDO para poder subir el canal");
        
    }
    
    public void bajaCanal(Television tv) {
        if(tv.isEncendido() == true){
            float canal = tv.getCanalActual();
            System.out.println("Canal -- ...");
            canal = canal--;
            tv.setCanalActual(canal);
        }else
            System.out.println("El televisor debe estar ENCENDIDO para poder bajar el canal");
        
    }
    
    public void cambiaCanal(Television tv, int canal){
        if(tv.isEncendido() == true)
            tv.setCanalActual(canal);
        else
            System.out.println("El televisor debe estar ENCENDIDO para poder cambiar el canal");       
    }    
}
