/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.electroDomesticos;

/**
 *
 * @author invited
 */
public class BlueRay {
    
    private String marca;
    private boolean encendido;
    private int capituloActual;
    private String formatoPantalla;

    public BlueRay(String marca, boolean encendido, int capituloActual, String formatoPantalla) {
        this.marca = marca;
        this.encendido = encendido;
        this.capituloActual = capituloActual;
        this.formatoPantalla = formatoPantalla;
    }

    public String getFormatoPantalla() {
        return formatoPantalla;
    }

    public void setFormatoPantalla(String formatoPantalla) {
        this.formatoPantalla = formatoPantalla;
    }

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

    public int getCapituloActual() {
        return capituloActual;
    }

    public void setCapituloActual(int capituloActual) {
        this.capituloActual = capituloActual;
    }

    @Override
    public String toString() {
        return "BlueRay " + "marca=" + marca + ", encendido=" + encendido + ", capituloActual=" + capituloActual + ", formatoPantalla=" + formatoPantalla;
    }
    
    
    
    
}
