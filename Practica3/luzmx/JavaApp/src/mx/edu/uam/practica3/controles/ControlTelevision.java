/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electroDomesticos.Television;

/**
 *
 * @author invited
 */
public class ControlTelevision {
    
    public void enciendeTv(Television tv){
        if(tv.isEncendido()){
            System.out.println("La televisión ya se encuentra encedida");
        }else{
            tv.setEncendido(true);
            System.out.println("Se cambia el estado a ON");
        }
    }
    
    public void apagaTv(Television tv){
        if(tv.isEncendido()){
            tv.setEncendido(false);
            System.out.println("Se cambia el estado a OFF");
        }else{
            System.out.println("No se puede apagar la televisión pues se encuentra apagada");
        }
    }
    
    public void subeVolumen(Television tv){
        if(tv.isEncendido()){
            if(tv.getVolMaximo() == tv.getVolActual()){
                System.out.println("El volumen se encuentra al Maximo posible");
            }else{
                tv.setVolActual(tv.getVolActual()+1);
                System.out.println("El volumen Actual se aumentó y es : "+ tv.getVolActual());
            }
        }else{
            System.out.println("La televisión se encuentra apagada");
        }    
    }
    
    public void bajaVolumen(Television tv){
        if(tv.isEncendido()){
            if(tv.getVolActual() == 0){
                System.out.println("El volumen no se puede bajar más... Está en el mínimo");
            }else{
                tv.setVolActual(tv.getVolActual()-1);
            }
        }else{
            System.out.println("La televisión se encuentra apagada");
        }
    }
    
    public void subeCanal(Television tv){
        if(tv.isEncendido()){
            if(tv.getUltimoCanal() == tv.getCanalActual()){
                System.out.println("No puede subir canal ... Se encuentra en el Máximo Canal");
            }else{
                tv.setCanalActual(tv.getCanalActual()+1);
                System.out.println("El canal actual es: "+ tv.getCanalActual());
            }    
        }else{
            System.out.println("La televisión se encuentra apagada");
        }
    }
    
    public void bajaCanal(Television tv){
        if(tv.isEncendido()){
            if(tv.getCanalActual() == 1){
                System.out.println("No puede bajar canal ... Se encuentra en el canal mìnimo");
            }else{
                tv.setCanalActual(tv.getCanalActual()-1);
                System.out.println("El canal actual es: "+ tv.getCanalActual());
            }
        }else{
            System.out.println("La televisión se encuentra apagada");
        }
    }
    
    public void cambiaCanal(Television tv, int canal){
        if(tv.isEncendido()){
            tv.setCanalActual(canal);
            System.out.println("El canal actual es: "+ tv.getCanalActual());
        }else{
            System.out.println("La televisión se encuentra apagada");
        }
    }
    
}
