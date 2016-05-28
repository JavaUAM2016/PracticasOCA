/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3;

import mx.edu.uam.practica3.control.ControlTelevision;
import mx.edu.uam.practica3.electroDomestico.Television;

/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Television tele = new Television("LG", 40, 5, 10);
        ControlTelevision usar = new ControlTelevision();
        
        

        boolean a= usar.encender(tele);
        a=tele.getEncendido();
        usar.bajarCan(tele);
        usar.bajarVol(tele);
        usar.subirCan(tele);
        usar.subirVol(tele);
        usar.cambiaCanal(tele);
        usar.apagado(tele);
    }

}
