/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electroDomesticos.Ventilador;

/**
 *
 * @author invited
 */
public class ControlVentilador {
    
    public void cambiaVelocidad(Ventilador ventilador){
        if(ventilador.getVelocidadMaxima() == ventilador.getVelocidadActual()){
            System.out.println("La velocidad ya está en el máximo");
        }
    }
}
