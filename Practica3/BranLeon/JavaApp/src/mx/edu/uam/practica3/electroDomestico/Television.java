/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.electroDomestico;

/**
 *
 * @author invited
 */
public class Television {

    private String marca;
    private int tamaño;
    private boolean encendido=true;
    private int canActual;
    private int volActual;
    private int volMaximo=30;

    public Television(String marca, int tamaño, int canActual, int volActual) {
        marca = this.marca;
        tamaño = this.tamaño;
        canActual = this.canActual;
        volActual = this.volActual;
        volMaximo = this.volMaximo;

    }

    public String getMarca() {
        return marca;
    }

    public int getTam() {
        return tamaño;
    }

    public boolean getEncendido() {
        return encendido;
    }

    public int getCanActual() {
        return canActual;
    }

    public int getVolActual() {
        return volActual;
    }

    public int getVolMax() {
        return volMaximo;
    }
    
    
   

}
