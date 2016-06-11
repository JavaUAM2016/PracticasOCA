package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electroDomesticos.ElectroDomestico;


/**
 *
 * @author jhernandezn
 */
public abstract  class ControlRemoto {
    
    private int numBaterias;
    private String tipoPila;


    /**
     * Enciende Aparatos
     * @param aparato 
     */
    public void encender(ElectroDomestico aparato) {
        
    }

    /**
     * Apaga Aparatos
     * @param aparato 
     */
    public void apagar(ElectroDomestico aparato) {
     
    }
    

    public int getNumBaterias() {
        return numBaterias;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public String getTipoPila() {
        return tipoPila;
    }

    public void setTipoPila(String tipoPila) {
        this.tipoPila = tipoPila;
    }

    @Override
    public String toString() {
        return "ControlRemoto " + "numBaterias=" + numBaterias + ", tipoPila=" + tipoPila;
    }


}
