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
    private int volumenActual;
    private int volMaximo;

    public Television(String marca, int tamanio, boolean encendido, int canalActual, int volumenActual, int volMaximo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
        this.volMaximo = volMaximo;
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

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolMaximo() {
        return volMaximo;
    }

    public void setVolMaximo(int volMaximo) {
        this.volMaximo = volMaximo;
    }

    @Override
    public String toString() {
        return "Television  " + "marca=" + marca + ", tamanio=" + tamanio + ", encendido=" + encendido + ", canalActual=" + canalActual + ", volumenActual=" + volumenActual + ", volMaximo=" + volMaximo;
    }

    
}
