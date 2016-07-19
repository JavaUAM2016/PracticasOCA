/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Radio;


/**
 *
 * @author invited
 */
public class ControlRadio extends ControlRemoto{
    
    public void enciende(Radio radio){
        super.encender(radio);
        System.out.println("El radio esta prendiendose.....");
    }
    
    public void apaga(Radio radio){
        super.apagar(radio);
        System.out.println("El radio esta apagandose.....");
       
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
