package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.aparatos.ElectroDomestico;


/**
 *
 * @author jhernandezn
 */
public  class ControlRemoto {

    /**
     * Enciende Aparatos
     * @param aparato 
     */
    public void encender(ElectroDomestico aparato) {
        aparato.setEstaEncendido(true);
    }

    /**
     * Apaga Aparatos
     * @param aparato 
     */
    public void apagar(ElectroDomestico aparato) {
        aparato.setEstaEncendido(true);
    }

}
