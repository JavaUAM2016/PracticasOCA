/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.aparatos;

/**
 *
 * @author invited
 */
public class Radio extends ElectroDomestico{
    
    private boolean encendido;
    private int subirVolumen;
    private int bajarVolumen;
    private double estacionActual;
    private double subirEstacion;
    private double bajarEstacion;
    private int volActual;

    public Radio() {
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVolActual() {
        return volActual;
    }

    public void setVolActual(int volActual) {
        this.volActual = volActual;
    }

    public int getSubirVolumen() {
        return subirVolumen;
    }

    public void setSubirVolumen(int subirVolumen) {
        this.subirVolumen = subirVolumen;
    }

    public int getBajarVolumen() {
        return bajarVolumen;
    }

    public void setBajarVolumen(int bajarVolumen) {
        this.bajarVolumen = bajarVolumen;
    }

    public double getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(double estacionActual) {
        this.estacionActual = estacionActual;
    }

    public double getSubirEstacion() {
        return subirEstacion;
    }

    public void setSubirEstacion(double subirEstacion) {
        this.subirEstacion = subirEstacion;
    }

    public double getBajarEstacion() {
        return bajarEstacion;
    }

    public void setBajarEstacion(double bajarEstacion) {
        this.bajarEstacion = bajarEstacion;
    }
    
}
