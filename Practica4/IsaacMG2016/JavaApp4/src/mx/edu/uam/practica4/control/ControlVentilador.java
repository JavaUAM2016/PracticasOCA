/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Ventilador;

/**
 *
 * @author invited
 */
public class ControlVentilador {
    
    
    public boolean estaEncendido(Ventilador v){
        
        if(v.isEncendido())
            return true;
        else
            return false;
    }
    
    public void enciendeVentilador(Ventilador v){
        
        if(!estaEncendido(v)){
            System.out.println("Ventilador encendido");
            v.setEncendido(true);
        }else{
            System.out.println("El ventilador esta encendido, tecla no valida ");
        }
    }
    
}
