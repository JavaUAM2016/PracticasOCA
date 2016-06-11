
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.control.ControlRadio;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTv;
import mx.edu.uam.practica4.electroDomestico.Electrodomestico;
import mx.edu.uam.practica4.electroDomestico.Radio;
import mx.edu.uam.practica4.electroDomestico.Television;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;

/**
 *
 * @author invited
 */
public class AppMain {

   
    public static void main(String[] args) {
        
                                 // marca,   tam, encendido canalActual,volumenActual, volMaximo,canalMax
        Electrodomestico sony = new Television("Sony Inc",50,true,52,25,99,200);
        ControlRemoto crTv = new ControlTv();
        ControlRemoto crRadio = new ControlRadio();
        
        ControlRemoto[] controles ={crTv,crRadio};
        Familiar padre = new Padre("Ponchito",32, controles,"Nada",0);
        
        crTv = padre.getControl()[0];
        crTv.apagar(sony);
        ((ControlTv)crTv).bajaCanal((Television)sony);
        
        
        
        //String marca, int wattsPotencia, boolean encendido, double estacionActual, int volumenActual, double estacionesMax, int volMax)
//        Electrodomestico radio = new Radio("Sorny",100000,true,200.5,20,600.5,50;
//        crTv.encender(sony);
//        cr.apagar(sony);
/*        ControlTv ctrlSony = new ControlTv();
        ctrlSony.enciendeTv(sony);
        ctrlSony.subeVolumen(sony);
        ctrlSony.cambiaCanal(sony, 14);
        ctrlSony.bajaCanal(sony);
        ctrlSony.apagaTv(sony);
        ctrlSony.apagaTv(sony);
        ctrlSony.enciendeTv(sony);
        ctrlSony.cambiaCanal(sony,202);
*/
        
        
        
    }    
    
}
