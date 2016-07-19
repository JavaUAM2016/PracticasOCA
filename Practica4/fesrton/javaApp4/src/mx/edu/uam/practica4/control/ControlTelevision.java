/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.aparatos.Television;

/**
 *
 * @author invited
 */
public class ControlTelevision extends ControlRemoto {
    
    
     
    
    
       
    
    public void subeVol(Television T){
        if(T.getVolumenAtual()==T.getVolMax()){
            System.out.println("Volumen maximo alacanzado");
        }else{
            T.setVolumenAtual(T.getVolumenAtual()+1);
            System.out.println(" Sube volumen...El volumen actual es: "+T.getVolumenAtual());
        }
    }
    
    public void bajaVol(Television T){
        if(T.getVolumenAtual()==0){
            System.out.println("Volumen minimo");
        }else{
            T.setVolumenAtual(T.getVolumenAtual()-1);
            System.out.println("Baja volumen....El volumen actual es: "+T.getVolumenAtual());
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
