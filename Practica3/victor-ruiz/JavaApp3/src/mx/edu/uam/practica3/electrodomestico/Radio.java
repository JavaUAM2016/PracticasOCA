/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author invited
 */
public class Radio {
    private String marca;
    private boolean encendido=false;
    private int estacionActual;
    private int volumenActual;
    private int volumenMaximo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(int estacionActual) {
        this.estacionActual = estacionActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(int volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }
    
    
}
