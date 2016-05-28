/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.aparatos;

/**
 *
 * @author invited
 */
public class Television {
    
     private String marca;
     private  int tamaño;
     private boolean encendido;
     private int volumenAtual;
     private int volMax= 30;
     private int canalActual;

    public Television() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVolumenAtual() {
        return volumenAtual;
    }

    public void setVolumenAtual(int volumenAtual) {
        this.volumenAtual = volumenAtual;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }
    
    
    
    
}
