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
    
    public ControlTelevision(){
        
    }
    
    public void enciende(Television tv){
        if (tv.isEncendido())
            System.out.println("El televisor ya esta encendido");
        else{
            tv.setEncendido(true);
            System.out.println("El televisor se encendera.. Ahora el televisor esta encendido");
        }
    }
    
    public void apaga(Television tv){
        if(tv.isEncendido()){
            tv.setEncendido(false);
            System.out.println("El televisor se apagara... Televisor apagado");
        }
        else{
            System.out.println("El televisor esta apagado");
        }
        
    }
    
    public void subeVol(Television tv){
        int volActual = -1;
    
        
        if(tv.getVolumenActual()==tv.getVolMaximo()){
            System.out.println("El televisor esta en su volumen maximo");
        }
        else{
            volActual = tv.getVolumenActual()+1;
            tv.setVolumenActual(volActual);
            System.out.println("El volumen subio, volumen: "+tv.getVolumenActual());
        }
        
    }
    
    public void bajaVol(Television tv){
        int volActual;
    
        if(tv.getVolumenActual()==0){
            System.out.println("El volumen esta en cero");
        }
        else{
            volActual = tv.getVolumenActual()-1;
            tv.setVolumenActual(volActual);
            System.out.println("El volumen bajo, volumen: "+tv.getVolumenActual());
        }
        
    }
    
    public void subeCanal(Television tv){
        int canalActual;
        
        canalActual = tv.getCanalActual()+1;
        tv.setCanalActual(canalActual);
        System.out.println("Se cambio al canal siguiente.. canal: "+tv.getCanalActual());
    }
    
    public void bajaCanal(Television tv){
        int canalActual;
        
        canalActual = tv.getCanalActual()-1;
        tv.setCanalActual(canalActual);
        System.out.println("Se cambio al canal anterior.. canal: "+tv.getCanalActual());
    }
    
    public void cambiaCanal(Television tv, int canal){
        tv.setCanalActual(canal);
        System.out.println("Se cambio al canal: "+tv.getCanalActual());
    }
    
}
