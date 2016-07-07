/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.aparatos.BlueRay;

/**
 *
 * @author invited
 */
public class ControlBlueRay extends ControlRemoto {
    
    
     public void enciendeTV (BlueRay B){
        
        
        if(B.isEstaEncendido()== true){
            
            
            
            ;
            System.out.println("EL blueray ya estaba encendia");
            
            System.out.println("");
        }else{
              
              System.out.println("BlueRay encendida");
              
        
            
        }
       
    }
    
    public void apagaTV(BlueRay B){
        B.setEstaEncendido(false);
        
        
    }
    
    
    
    
    public void subeVol(BlueRay B){
        if(B.getVolumenAtual()==B.getVolMax()){
            System.out.println("Volumen maximo");
        }else{
            B.setVolumenAtual(B.getVolumenAtual()+1);
            System.out.println("El volumen actual es: "+B.getVolumenAtual());
        }
    }
    
    public void bajaVol(BlueRay B){
        if(B.getVolumenAtual()==0){
            System.out.println("Volumen minimo");
        }else{
            B.setVolumenAtual(B.getVolumenAtual()-1);
            System.out.println("El volumen actual es: "+B.getVolumenAtual());
        }
    }
    
}
