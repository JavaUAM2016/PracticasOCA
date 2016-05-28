/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.Practica3;
import mx.edu.uam.Controles.*;
import mx.edu.uam.dispositivos.*;

/**
 *
 * @author invited
 */
public class appMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quiero ver la tele");
        //comenzamos a crear los objetos.
        Television television = new Television("Sony",51,false,21,20);
        ControlTelevision controlTelevision = new  ControlTelevision();
        
        //Prendemos la tele 
        controlTelevision.enciende(television);
        controlTelevision.apaga(television);
    }
    
}
