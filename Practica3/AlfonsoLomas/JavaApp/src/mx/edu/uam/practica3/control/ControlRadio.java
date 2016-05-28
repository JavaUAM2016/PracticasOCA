
package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.electrodomestico.Radio;

/**
 *
 * @author AlfonsoLomas
 */
public class ControlRadio {
    
    public void powerRadio(Radio radio){
        if(radio.encendido){
            radio.setEncendido(false);
            System.out.println("El radio se està apagando");
        }else{
            radio.setEncendido(true);
            System.out.println("El radio se acaba de encender");
            System.out.println("Marca: " + radio.getMarca());
            System.out.println("Estaciòn: " + radio.getEstacionActual());
            System.out.println("Volumen: " + radio.getVolumenActual());
            System.out.println("Frecuencia: " + radio.getFrecuencia());
        }
    }
    
    public void subeVolumen(Radio radio){
        
    }
    
}
