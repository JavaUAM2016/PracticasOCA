package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electrodomestico.Estereo;

/**
 *
 * @author invited
 */
public class ControlEstereo {
    
    public void enciendeEstereo(Estereo estereo){
        if(estereo.isEncendido() == false){
            System.out.println("Encendiendo... !!");
            estereo.setEncendido(true);            
        }else            
            System.out.println("El estereo ya esta encendido!");
    }
    
    public void apagaEstereo(Estereo estereo){
        if(estereo.isEncendido() == true){
            System.out.println("Apagando... !!");
            estereo.setEncendido(false);
        }else
            System.out.println("El estereo ya esta apagado!!");
    }
    
    public void subeVol(Estereo estereo){
        int vol = estereo.getVolumenActual(); 
                
        if(vol <= 50){
            System.out.println("Volumen ++ ...");
            vol = vol++;
            estereo.setVolumenActual(vol);
        }else
            System.out.println("El volumen maximo es 50!!");
        
    }
    
    public void bajaVol(Estereo estereo){
        int vol = estereo.getVolumenActual();
        
        if(vol > 0){
            System.out.println("Volumen -- ...");
            vol = vol--;
            estereo.setVolumenActual(vol);
        }else
            System.out.println("El volumen MINIMO es 0!!");
        
    }
    
    public void subeEstacion(Estereo estereo){
        float estacion = estereo.getEstacionActual();
        System.out.println("Estaciòn ++ ...");
        estacion = estacion + 100;
        estereo.setEstacionActual(estacion);
    }
    
    public void bajaEstacion(Estereo estereo){
        float estacion = estereo.getEstacionActual();
        System.out.println("Estaciòn -- ...");
        estacion = estacion - 100;
        estereo.setEstacionActual(estacion);
    }
    
    public void cambiaEstacion(Estereo estereo, float estacion){
        estereo.setEstacionActual(estacion);
    }
    
}
