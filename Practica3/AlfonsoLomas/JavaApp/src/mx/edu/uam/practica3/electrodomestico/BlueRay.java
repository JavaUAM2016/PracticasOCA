/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class BlueRay {
    public String marca;
    public int tamanio;
    public boolean encendido;
    public int volumenActual;
    public int volumenMaximo;
    public boolean reproducir;
    public boolean conectarInternet;
    public boolean existeDvd;
    public boolean avanzarCapitulo;
    public boolean regresarCapitulo;

    public BlueRay(String marca, int tamanio, boolean encendido, int volumenActual, int volumenMaximo, boolean reproducir, boolean conectarInternet, boolean existeDvd, boolean avanzarCapitulo, boolean regresarCapitulo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.volumenActual = volumenActual;
        this.volumenMaximo = volumenMaximo;
        this.reproducir = reproducir;
        this.conectarInternet = conectarInternet;
        this.existeDvd = existeDvd;
        this.avanzarCapitulo = avanzarCapitulo;
        this.regresarCapitulo = regresarCapitulo;
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

    public boolean isReproducir() {
        return reproducir;
    }

    public void setReproducir(boolean reproducir) {
        this.reproducir = reproducir;
    }

    public boolean isConectarInternet() {
        return conectarInternet;
    }

    public void setConectarInternet(boolean conectarInternet) {
        this.conectarInternet = conectarInternet;
    }

    public boolean isExisteDvd() {
        return existeDvd;
    }

    public void setExisteDvd(boolean existeDvd) {
        this.existeDvd = existeDvd;
    }

    public boolean isAvanzarCapitulo() {
        return avanzarCapitulo;
    }

    public void setAvanzarCapitulo(boolean avanzarCapitulo) {
        this.avanzarCapitulo = avanzarCapitulo;
    }

    public boolean isRegresarCapitulo() {
        return regresarCapitulo;
    }

    public void setRegresarCapitulo(boolean regresarCapitulo) {
        this.regresarCapitulo = regresarCapitulo;
    }
    
    
}
