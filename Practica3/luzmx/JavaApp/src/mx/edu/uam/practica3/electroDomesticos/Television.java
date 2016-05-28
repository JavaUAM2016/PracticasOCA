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
public class Television {
    
    private String marca;
    private int tamanio;
    private boolean encendido;
    private int canalActual;
    private int volMaximo;
    private int volActual;
    private int ultimoCanal;

    public Television(String marca, int tamanio, boolean encendido, int canalActual, int volMaximo, int volActual, int ultimoCanal) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.volMaximo = volMaximo;
        this.volActual = volActual;
        this.ultimoCanal = ultimoCanal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public int getVolMaximo() {
        return volMaximo;
    }

    public void setVolMaximo(int volMaximo) {
        this.volMaximo = volMaximo;
    }

    public int getVolActual() {
        return volActual;
    }

    public void setVolActual(int volActual) {
        this.volActual = volActual;
    }

    public int getUltimoCanal() {
        return ultimoCanal;
    }

    public void setUltimoCanal(int ultimoCanal) {
        this.ultimoCanal = ultimoCanal;
    }
}
