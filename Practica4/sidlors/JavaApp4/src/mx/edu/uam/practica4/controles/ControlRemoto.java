package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;


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
        aparato.setEstaEncendido(true);
    }

    /**
     * Apaga Aparatos
     * @param aparato 
     */
    public void apagar(ElectroDomestico aparato) {
     
       aparato.setEstaEncendido(false);
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
