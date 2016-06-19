/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.electrodomestico.Radio;


/**
 *
 * @author invited
 */
public class ControlRadio {
    
    public void enciende(Radio radio){
        radio.setEncendido(true);
        System.out.println("El radio esta prendiendose.....");
    }
    
    public void apaga(Radio radio){
        System.out.println("El radio esta apagandose.....");
        radio.setEncendido(false);
    }
    
    public void subeVolumen(Radio radio){
        int volumenActual;
        
        volumenActual = radio.getVolumenActual();
        volumenActual = volumenActual +1;
         
        System.out.println("el radio subio de volumen a "+volumenActual);
    }
    
    public void bajaVolumen(Radio radio){
        int volumenActual;
        
        volumenActual = radio.getVolumenActual();
        volumenActual = volumenActual-1;
         
        System.out.println("el radio subio de volumen a "+volumenActual);
    }
    
    public void cambiaEstacion(Radio radio,int estacion){
        System.out.println("el radio cambio a la estacion "+estacion);
    }
    
    public void cambiaSiguienteEstacion(Radio radio){
        int canalActual;
        
        canalActual = radio.getEstacionActual();
        canalActual = canalActual+1;
        
        System.out.println("la television cambio al siguiente canal que es el "+canalActual);
    }
    
    public void cambiaEstacionAnterior(Radio radio){
       int canalActual;
        
       canalActual = radio.getEstacionActual();
       canalActual = canalActual-1;
        
       System.out.println("la television cambio al siguiente canal que es el "+canalActual);
    }
}
