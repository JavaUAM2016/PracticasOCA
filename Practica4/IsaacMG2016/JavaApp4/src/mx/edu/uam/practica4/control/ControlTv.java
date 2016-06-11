package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Television;

/**
 *
 * @author Isaac MG
 * @version 
 */
public class ControlTv extends ControlRemoto{
    
/*    public boolean estaEncendida(Television tv){
        
        if(tv.isEncendido())
            return true;
        else
            return false;
    }
*/    
/*    public void enciendeTv(Television tv){
        
        if(!estaEncendida(tv)){
            System.out.println("Television encendida");
            tv.setEncendido(true);
        }else{
            System.out.println("El televisor esta encendido tecla no valida ");
        }
    }
*/    
//    public void enciendeTv(Television tv){
//        super.encender(tv);
//    }
    
/*    public void apagaTv(Television tv){
        if(estaEncendida(tv)){
            System.out.println("television Apagando !!");
            tv.setEncendido(false);   
        }else
            System.out.println("La televisor apagado tecla no valida");
    }
*/  
//    public void apagaTv(Television tv){
//        super.apagar(tv);
//        
//    }
    
    public void subeVolumen(Television tv){
        if(tv.getVolumenActual() == tv.getVolMaximo())
            System.out.println("El televisor ya esta en el volumen maximo tecla invalida");
        else{
            tv.setVolumenActual(tv.getVolumenActual()+1);
            System.out.println("VOL - ||||||||||||||||||||||||||| + "+ tv.getVolumenActual());
        }
    } 
    
    public void bajaVolumen(Television tv){
        if(tv.getVolumenActual() <= tv.getVolMaximo() && tv.getVolumenActual() > 0){
            tv.setVolumenActual(tv.getVolumenActual()-1);
            System.out.println("VOL - |||||||||| +"+ tv.getVolumenActual());
        
        }else
            System.out.println("El televisor ya no puede bajar el volumen  tecla invalida");
             
    } 
    
    public void subeCanal(Television tv){
            if(tv.getCanalActual() == tv.getCanalMax()){
                System.out.println("El televisor ya esta en el Canal maximo, regresara al inicio");
                tv.setCanalActual(1);
            }else{
                tv.setCanalActual(tv.getCanalActual()+1);
                    System.out.println("CH - ||||||||||||||||||||||||||| + "+ tv.getCanalActual());
            }
    }

    public void bajaCanal(Television tv){
         if(tv.getCanalActual() <= tv.getCanalMax() && tv.getCanalActual() > 0){
            tv.setCanalActual(tv.getCanalActual() - 1);
            System.out.println("CH - |||||||||| + "+ tv.getCanalActual());
        
        }else
            System.out.println("El televisor ya no puede bajar el Canal  tecla invalida");
        
    }
    
    public void cambiaCanal(Television tv, int canal){
         if(canal <= tv.getCanalMax() && canal > 0){
            tv.setCanalActual(canal);
            System.out.println("CH : "+ tv.getCanalActual());
        
        }else
            System.out.println("Error canal incorrecto");
    }
   
}//fin class
