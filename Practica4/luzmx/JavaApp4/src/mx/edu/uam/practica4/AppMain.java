/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.electroDomesticos.BlueRay;
import mx.edu.uam.practica4.electroDomesticos.ElectroDomestico;
import mx.edu.uam.practica4.electroDomesticos.Television;
import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;


public class AppMain {
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Television tv = new Television();
        ControlRemoto controlTV = new ControlTV();
          
        ElectroDomestico blueRay = new BlueRay();
        ControlRemoto controlBlue = new ControlBlueRay();
          
        ControlRemoto[] controles ={controlTV,controlBlue};
         
        Familiar papa = new Padre();
         
        papa.setControlesRemotos(controles);
        controlTV=papa.getControlesRemotos()[0];
        controlTV.apagar(tv);
        System.out.println(tv.getCanalActual());
        ((ControlTV)controlTV).cambiarCanal(tv, 25);
        System.out.println(tv.getCanalActual());
        tv.getVolumenActual();
        System.out.println(tv.getCanalActual());
        
        
        // Control blue-ray
        
        controlBlue= papa.getControlesRemotos()[1];

    }
    
}
