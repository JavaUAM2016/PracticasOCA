/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.aparatos.Television;

/**
 *
 * @author invited
 */
public class ControlTelevision {
    
    
     
    
    public void enciendeTV (Television T){
        
        
        if(T.isEncendido()== true){
            
            
            
            
            System.out.println("La tv ya estaba encendia");
            
            System.out.println("");
        }else{
              
              System.out.println("TV encendida");
              System.out.println("El canal actual es: "+ T.getCanalActual());
              System.out.println("El volumen actual es: "+ T.getVolumenAtual());
              System.out.println("");
        
            
        }
       
    }
    
    public void apagaTV(Television T){
        T.setEncendido(false);
        
        
    }
    
    
    
    
    public void subeVol(Television T){
        if(T.getVolumenAtual()==T.getVolMax()){
            System.out.println("Volumen maximo");
        }else{
            T.setVolumenAtual(T.getVolumenAtual()+1);
            System.out.println("El volumen actual es: "+T.getVolumenAtual());
        }
    }
    
    public void bajaVol(Television T){
        if(T.getVolumenAtual()==0){
            System.out.println("Volumen minimo");
        }else{
            T.setVolumenAtual(T.getVolumenAtual()-1);
            System.out.println("El volumen actual es: "+T.getVolumenAtual());
        }
    }
    
    public void subeCanal(Television T){
        if(T.getCanalActual()==69){
            T.setCanalActual(1);
            System.out.println("El canal actual es: "+ T.getCanalActual());
        }else{
            T.setCanalActual(T.getCanalActual()+1);
            System.out.println("El canal actual es: "+T.getCanalActual());
        }
    }
    
    public void bajaCanal(Television T){
        if(T.getCanalActual()==1){
            
            T.setCanalActual(69);
            System.out.println("El canal actual es: "+ T.getCanalActual());
        }else{
            T.setCanalActual(T.getCanalActual()-1);
            System.out.println("El canal actual es: "+T.getCanalActual());
        }
    }
    
    public void cambiarCanal(Television T, int C){
        
        T.setCanalActual(C);
        
        System.out.println("El canal actual es: " +T.getCanalActual());
    }
   
    
    
}
