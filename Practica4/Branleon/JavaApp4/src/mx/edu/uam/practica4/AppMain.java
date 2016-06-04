/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.control.ControlDVD;
import mx.edu.uam.practica4.control.ControlTelevision;
import mx.edu.uam.practica4.electroDomestico.Electrodomestico;
import mx.edu.uam.practica4.electroDomestico.Familia.Papa;
import mx.edu.uam.practica4.electroDomestico.Television;

/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       /* Television tele = new Television("LG",40);
        ControlTelevision usar = new ControlTelevision();
        
        tele.setCanAct(5);
        tele.setVolAct(10);
        
        
        usar.encender(tele);
        usar.bajarCan(tele);
        usar.bajarVol(tele);
        usar.subirCan(tele);
        usar.subirVol(tele);
        usar.cambiaCanal(tele);
        usar.apagado(tele);*/
        
       // Electrodomestico tele = new Television("lg",40);
        Control controlTelevision = new ControlTelevision();
        
        //Electrodomestico DVD = new DVD();
        //Control controlDVD = new ControlDVD;
        
        //Control[] controles ={controlTelevision,controlDVD};
        
        //Familiar papa= new Papa();
        
                
                
        
    }

}
