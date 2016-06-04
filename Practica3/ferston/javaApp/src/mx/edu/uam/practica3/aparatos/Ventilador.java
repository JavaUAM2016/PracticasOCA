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
public class Ventilador {
    
     private String marca;
     private boolean encendido;
     private boolean girar;
     private int subir;
     private int bajar;

    public Ventilador() {
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

    public boolean isGirar() {
        return girar;
    }

    public void setGirar(boolean girar) {
        this.girar = girar;
    }

    public int getSubir() {
        return subir;
    }

    public void setSubir(int subir) {
        this.subir = subir;
    }

    public int getBajar() {
        return bajar;
    }

    public void setBajar(int bajar) {
        this.bajar = bajar;
    }
     
     
     
     
    
}
