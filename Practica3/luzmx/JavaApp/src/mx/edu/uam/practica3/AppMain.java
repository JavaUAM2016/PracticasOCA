/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3;

import mx.edu.uam.practica3.controles.ControlBlueRay;
import mx.edu.uam.practica3.controles.ControlTelevision;
import mx.edu.uam.practica3.electroDomesticos.BlueRay;
import mx.edu.uam.practica3.electroDomesticos.Television;

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
        
        ControlTelevision controlTv = new ControlTelevision();
        ControlBlueRay controlBlueRay = new ControlBlueRay();
        Television tele = new Television("Samsung", 32, true, 236 , 100, 20, 999);
        BlueRay blueray = new BlueRay("LG", true, "Pelicula ", true, 24);
        
        // Tareas Televisión
        controlTv.enciendeTv(tele);
        controlTv.apagaTv(tele);
        controlTv.enciendeTv(tele);
        controlTv.subeVolumen(tele);
        controlTv.cambiaCanal(tele, 205);
        controlTv.subeCanal(tele);
        
        System.out.println("");
        
        // Tareas Blue-Ray
        controlBlueRay.cambiaTarea(blueray, "Fotos");
        controlBlueRay.conectarseWIFI(blueray);
        controlBlueRay.tareaActual(blueray);
        controlBlueRay.enciendeBlueRay(blueray);
  
    }
    
}
