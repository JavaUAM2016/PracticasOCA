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
    private boolean encedido;
    private int velocidadMaxima;
    private int velocidadActual;

    public Ventilador(String marca, boolean encedido, int velocidadMaxima, int velocidadActual) {
        this.marca = marca;
        this.encedido = encedido;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncedido() {
        return encedido;
    }

    public void setEncedido(boolean encedido) {
        this.encedido = encedido;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    
    
    
}
