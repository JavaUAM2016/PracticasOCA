/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.aparatos;

/**
 *
 * @author invited
 */
public class Ventilador extends ElectroDomestico{
    
    
     private boolean girar;
     private int subir;
     private int bajar;

    public Ventilador() {
    }

    public boolean isGirar() {
        return girar;
    }

    public void setGirar(boolean girar) {
        this.girar = girar;
    }

    public int getSubir() {
        return subir;
    }

    public void setSubir(int subir) {
        this.subir = subir;
    }

    public int getBajar() {
        return bajar;
    }

    public void setBajar(int bajar) {
        this.bajar = bajar;
    }
     
     
     
     
    
}
