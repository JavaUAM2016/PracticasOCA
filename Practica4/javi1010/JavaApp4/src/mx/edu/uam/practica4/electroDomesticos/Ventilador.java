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
public class Ventilador extends Electrodomestico{
    
    private String color;
    private int velocidad;
    private int velMaxima;

    public Ventilador(String color, int velocidad, int velMaxima) {
        
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

    @Override
    public String toString() {
        return "Ventilador " + "color=" + color + ", velocidad=" + velocidad + ", velMaxima=" + velMaxima;
    }
    
    
    
    
    
    
}
