/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica3.devices;

/**
 *
 * @author invited
 */
public class Stereo 
{
    //private String marca;
    private boolean encendido;
    private int maxVolume;
    private double estacionActual;
    private int volActual;
    
    public Stereo()
    {
        this.encendido = false;
        this.maxVolume = 100;
        this.estacionActual = 87.1;
        this.volActual = 20;
    }
    
    public boolean getStatus()
    {
        return this.encendido;
    }
    
    public boolean setStatus(boolean estaEncendido)
    {
        this.encendido = estaEncendido;
        return this.encendido;
    }
    
    public int getMaxVolume()
    {
        return this.maxVolume;
    }
    
    public double getEstacionActual()
    {
        return this.estacionActual;
    }
    
    public double setEstacionManual(double subeEstacion)
    {
        this.estacionActual += subeEstacion;
        return estacionActual;
    }
    
    public int getvolActual()
    {
        return this.volActual;
    }
    
    public int setVolActual(int cuantoMas)
    {
        this.volActual += cuantoMas;
        return this.volActual;
    }
}
