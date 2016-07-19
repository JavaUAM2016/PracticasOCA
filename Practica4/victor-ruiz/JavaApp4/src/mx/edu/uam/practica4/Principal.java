/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.control.ControlProyector;
import mx.edu.uam.practica4.control.ControlRadio;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTV;
import mx.edu.uam.practica4.electrodomestico.ElectroDomestico;
import mx.edu.uam.practica4.electrodomestico.Proyector;
import mx.edu.uam.practica4.electrodomestico.Radio;
import mx.edu.uam.practica4.electrodomestico.Television;
import mx.edu.uam.practica4.persona.Familiar;
import mx.edu.uam.practica4.persona.Padre;

/**
 *
 * @author invited
 */
public class Principal {
    
    public static void main(String[] args){
        
        Television tv = new Television();
        ControlRemoto controlTV = new ControlTV();

        ElectroDomestico radio = new Radio();
        ControlRemoto controlRadio = new ControlRadio();

        ControlRemoto[] controles ={controlTV,controlRadio};

        Familiar papa = new Padre();

        papa.setControlesRemotos(controles);
        controlTV=papa.getControlesRemotos()[0];
        controlTV.encender(tv);
        ((ControlTV)controlTV).cambiarCanal(tv, 25);
        System.out.println(tv.getCanalActual());
    }
}
