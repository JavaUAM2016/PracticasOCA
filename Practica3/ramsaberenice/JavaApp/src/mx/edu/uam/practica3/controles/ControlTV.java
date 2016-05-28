package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electrodomestico.Television;

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
                
        if(vol <= 50){
            System.out.println("Volumen ++ ...");
            vol = vol++;
            tv.setVolumenActual(vol);
        }else
            System.out.println("El volumen maximo es 50!!");
    }
    
    public void bajaVol(Television tv) {
        int vol = tv.getVolumenActual();
        
        if(vol > 0){
            System.out.println("Volumen -- ...");
            vol = vol--;
            tv.setVolumenActual(vol);
        }else
            System.out.println("El volumen MINIMO es 0!!");
    }
    
    public void subeCanal(Television tv) {
        float canal = tv.getCanalActual();
        System.out.println("Canal ++ ...");
        canal = canal++;
        tv.setCanalActual(canal);
    }
    
    public void bajaCanal(Television tv) {
        float canal = tv.getCanalActual();
        System.out.println("Canal -- ...");
        canal = canal--;
        tv.setCanalActual(canal);
    }
    
    public void cambiaCanal(Television tv, int canal){
        tv.setCanalActual(canal);
    }    
}
