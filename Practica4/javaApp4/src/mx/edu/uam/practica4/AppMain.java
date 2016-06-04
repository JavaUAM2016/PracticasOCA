/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import Familiar.Familiar;
import Familiar.padre;
import mx.edu.uam.Controles.*;
import mx.edu.uam.dispositivos.*;
/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        System.out.println("Quiero ver la tele");
        //comenzamos a crear los objetos.
        Electrodomestico television = new Television("Sony",51,false,21,20);
        ControlRemoto controlTelevision = new  ControlTelevision();
        
        //Prendemos la tele 
        controlTelevision.encender(television);
        controlTelevision.apagar(television);
        
        ControlRemoto[] controles = {controlTelevision};
        
        //array
        Familiar papa = new padre();
        
        papa.setControlesRemotos(controles);
        controlTelevision = papa.getControlesRemotos()[0];
        controlTelevision.apagar(television);
               
    }
    
}
