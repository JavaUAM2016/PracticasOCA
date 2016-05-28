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
    private String tarea;
    private boolean conetadoWIFI;
    private int volumenActual;

    public BlueRay(String marca, boolean encendido, String tarea, boolean conetadoWIFI, int volumenActual) {
        this.marca = marca;
        this.encendido = encendido;
        this.tarea = tarea;
        this.conetadoWIFI = conetadoWIFI;
        this.volumenActual = volumenActual;
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

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public boolean isConetadoWIFI() {
        return conetadoWIFI;
    }

    public void setConetadoWIFI(boolean conetadoWIFI) {
        this.conetadoWIFI = conetadoWIFI;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }
 
}
