/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electroDomesticos.Electrodomestico;

/**
 *
 * @author invited
 */
public abstract class ControlRemoto {
    
    private int numBaterias;
    private String tipoPila;

   public void enciende(Electrodomestico aparato){
       
   }
   
   public void apaga(Electrodomestico aparato){
       
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
