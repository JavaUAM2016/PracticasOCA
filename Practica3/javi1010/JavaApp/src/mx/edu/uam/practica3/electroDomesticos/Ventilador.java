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
public class Ventilador {
    
    private String marca;
    private boolean encendido;
    private String color;
    private int velocidad;
    private int velMaxima;

    public Ventilador(String marca, boolean encendido, String color, int velocidad, int velMaxima) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
        this.velMaxima = velMaxima;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public String toString() {
        return "Ventilador " + "marca=" + marca + ", encendido=" + encendido + ", color=" + color + ", velocidad=" + velocidad + ", velMaxima=" + velMaxima;
    }
    
    
    
    
    
    
}
