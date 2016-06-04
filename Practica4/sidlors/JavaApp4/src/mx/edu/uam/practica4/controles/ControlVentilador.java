package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.aparatos.Ventilador;


/**
 *
 * @author jhernandezn
 */
public class ControlVentilador extends ControlRemoto{

    /**
     * Enciende Ventilador
     * @param ventilador 
     */
    public void encender(Ventilador ventilador) {
        super.encender(ventilador);
        System.out.println("Ventilador Encendida");
    }

    /**
     * Apaga Ventilador
     * @param ventilador 
     */
    public void apagar(Ventilador ventilador) {
        super.apagar(ventilador);
        System.out.println("Ventilador apagada");
    }
    
}
