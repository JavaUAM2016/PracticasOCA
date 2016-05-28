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
public class Ventilador {
    
    private String marca;
    private boolean encendido;
    private int velocidadActual;
    private int velMaxima;

    public Ventilador(String marca, boolean encendido, int velocidadActual, int velMaxima) {
        this.marca = marca;
        this.encendido = encendido;
        this.velocidadActual = velocidadActual;
        this.velMaxima = velMaxima;
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

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }
    
}
