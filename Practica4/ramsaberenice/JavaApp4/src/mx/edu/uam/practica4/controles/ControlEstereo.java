package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electrodomestico.Estereo;

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
        
        if(estereo.isEncendido() == true){
            if(vol <= 50){
                System.out.println("Volumen ++ ...");
                vol = vol+1; //Si pongo vol++ no me lo incrementa, incrementa si lo uso como ++vol!!
                estereo.setVolumenActual(vol);
                System.out.println("Se subio el volumen");
            }else
                System.out.println("El volumen maximo es 50!!");
        }else            
            System.out.println("El estereo debe estar ENCENDIDO para poder SUBIR el volumen");   
    }
    
    public void bajaVol(Estereo estereo){
        int vol = estereo.getVolumenActual();
        
        if(estereo.isEncendido() == true){  
            if(vol > 0){
                System.out.println("Volumen -- ...");
                vol = vol-1;
                estereo.setVolumenActual(vol);
            }else
                System.out.println("El volumen MINIMO es 0!!");
        }else            
            System.out.println("El estereo debe estar ENCENDIDO para poder BAJAR el volumen!");
        
    }
    
    public void subeEstacion(Estereo estereo){
         if(estereo.isEncendido() == true){  
            float estacion = estereo.getEstacionActual();
            System.out.println("Estaciòn ++ ...");
            estacion = estacion + 100;
            estereo.setEstacionActual(estacion);
         }else
             System.out.println("El estereo debe estar ENCENDIDO para poder SUBIR  de estaciòn");
    }
    
    public void bajaEstacion(Estereo estereo){
        if(estereo.isEncendido() == true){
            float estacion = estereo.getEstacionActual();
            System.out.println("Estaciòn -- ...");
            estacion = estacion - 100;
            estereo.setEstacionActual(estacion);
        }else
            System.out.println("El estereo debe estar ENCENDIDO para poder BAJAR de estaciòn");
        
    }
    
    public void cambiaEstacion(Estereo estereo, float estacion){
        if(estereo.isEncendido() == true)
            estereo.setEstacionActual(estacion);
        else
            System.out.println("El estereo debe estar ENCENDIDO para poder CAMBIAR  de canal!!");
    }   
}