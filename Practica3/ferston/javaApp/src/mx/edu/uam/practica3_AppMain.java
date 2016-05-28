/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam;

import mx.edu.uam.practica3.control.ControlTelevision;
import mx.edu.uam.practica3.aparatos.Television;
/**
 *
 * @author invited
 */
public class practica3_AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Television T1 = new Television();
          T1.setEncendido(true);
          T1.setVolumenAtual(25);
          T1.setCanalActual(68);
          
        
        ControlTelevision TV = new ControlTelevision();
        
        TV.enciendeTV(T1);
        TV.enciendeTV(T1);
        TV.apagaTV(T1);
        
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        
        TV.bajaVol(T1);
        TV.bajaVol(T1);
        TV.bajaVol(T1);
        
        System.out.println("");
        
        TV.subeCanal(T1);
        TV.subeCanal(T1);
        TV.subeCanal(T1);
        TV.bajaCanal(T1);
        TV.bajaCanal(T1);
        TV.bajaCanal(T1);
        
        System.out.println("");
        
        TV.cambiarCanal(T1, 23);
         
       
        
        
       
      
    }
    
}
