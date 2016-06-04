/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electroDomestico;

/**
 *
 * @author invited
 */
public class Television extends Electrodomestico{

    private String marca;
    private int tamaño;
    private boolean encendido = false;
    private int canActual;
    private int volActual;
    private int volMaximo = 30;

    public Television(String marca, int tamaño) {
        this.marca = marca;
        this.tamaño = tamaño;

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

    public void setEncendido(boolean b) {
        encendido = b;
    }

    public void setVolAct(int a) {

        volActual = a;
    }
    public void setCanAct(int c){
        
        canActual=c;
    
}
}
