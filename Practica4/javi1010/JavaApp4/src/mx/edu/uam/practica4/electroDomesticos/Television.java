/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electroDomesticos;

/**
 *
 * @author invited
 */
public class Television {
    
    private int tamanio;
    
    
    private int canalActual;
    private int volumenActual;
    private int volMaximo;

    public Television(int tamanio, int canalActual, int volumenActual, int volMaximo) {
    
        this.tamanio = tamanio;
      
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
        this.volMaximo = volMaximo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
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
        return "Television  " + "tamanio=" + tamanio + " canalActual=" + canalActual + ", volumenActual=" + volumenActual + ", volMaximo=" + volMaximo;
    }

    
}
