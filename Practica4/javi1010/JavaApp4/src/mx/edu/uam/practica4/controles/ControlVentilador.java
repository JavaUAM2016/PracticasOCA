/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electroDomesticos.Electrodomestico;
import mx.edu.uam.practica4.electroDomesticos.Ventilador;
/**
 *
 * @author invited
 */
public class ControlVentilador {
    
    public void enciende(Electrodomestico v){
        if (v.isEstaEncendido())
            System.out.println("El ventilador ya esta encendido");
        else{
            v.setEstaEncendido(true);
            System.out.println("El ventilador se encendera.. Ahora el ventilador esta encendido");
        }
    }
    
    public void apaga(Electrodomestico v){
        if(v.isEstaEncendido()){
            v.setEstaEncendido(false);
            System.out.println("El ventilador se apagara... Ventilador apagado");
        }
        else{
            System.out.println("El ventilador esta apagado");
        }
        
    }
    
    public void subeVel(Ventilador v){
        int velActual = -1;
    
        
        if(v.getVelMaxima()==v.getVelocidad()){
            System.out.println("El ventilador esta en su velocidad maxima");
        }
        else{
            velActual = v.getVelocidad()+1;
            v.setVelocidad(velActual);
            System.out.println("El ventilador subio de velocidad, velocidad: "+v.getVelocidad());
        }
        
    }
    
    public void bajaVel(Ventilador v){
        int velActual;
    
        if(v.getVelocidad()==0){
            System.out.println("La velocidad esta en cero");
        }
        else{
            velActual = v.getVelocidad()-1;
            v.setVelocidad(velActual);
            System.out.println("El ventilador bajo de velocidad, velocidad: "+v.getVelocidad());
        }
        
    }
    
    
    
}
