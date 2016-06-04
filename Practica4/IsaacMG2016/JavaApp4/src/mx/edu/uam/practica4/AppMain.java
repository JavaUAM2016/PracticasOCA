
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.control.ControlTv;
import mx.edu.uam.practica4.electroDomestico.Television;

/**
 *
 * @author invited
 */
public class AppMain {

   
    public static void main(String[] args) {
        
                                 // marca,   tam, encendido canalActual,volumenActual, volMaximo,canalMax
        Television sony = new Television("Sony Inc",50,false,52,25,99,200);
        ControlTv ctrlSony = new ControlTv();
        ctrlSony.enciendeTv(sony);
        ctrlSony.subeVolumen(sony);
        ctrlSony.cambiaCanal(sony, 14);
        ctrlSony.bajaCanal(sony);
        ctrlSony.apagaTv(sony);
        ctrlSony.apagaTv(sony);
        ctrlSony.enciendeTv(sony);
        ctrlSony.cambiaCanal(sony,202);
        
    }    
    
}
