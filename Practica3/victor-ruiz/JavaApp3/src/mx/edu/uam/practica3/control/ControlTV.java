/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.electrodomestico.Television;

/**
 *
 * @author invited
 */
public class ControlTV {
    
    public void enciende(Television tv){
        
        tv.setEncendido(true);
        System.out.println("televison, prendiendo.....");
    }
    
    public void apaga(Television tv){
        System.out.println("televison, apagando.....");
        
        tv.setEncendido(false);
    }
    
    public void subeVolumen(Television tv){
        int volumenActual;
        
        volumenActual = tv.getVolumenActual();
        volumenActual = volumenActual +1;
         
        System.out.println("la television subio de volumen a "+volumenActual);
    }
    
    public void bajaVolumen(Television tv){
        int volumenActual;
         volumenActual = tv.getVolumenActual();
        volumenActual = volumenActual +1;
         
        System.out.println("la television bajo de volumen a "+volumenActual);
    }
    
    public void cambiaCanal(Television tv,int canal){
        
        System.out.println("la television cambio al canal "+ canal);

    }
    
    public void cambiaSiguienteCanal(Television tv){
        int canalActual;
        
        canalActual = tv.getCanalActual();
        canalActual = canalActual+1;
        
        System.out.println("la television cambio al siguiente canal que es el "+canalActual);
    }
    
    public void cambiaCanalAnterior(Television tv){
        int canalActual;
        canalActual = tv.getCanalActual();
        canalActual = canalActual+1;
        
        System.out.println("la television cambio al canal anterior que es el "+canalActual);

    }
}
