/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.devices;

/**
 *
 * @author sozir
 */
public class Stereo extends Device
{
    private double estacionActual;
    private int volActual;
    
    public Stereo()
    {
        isOn = false;
        marca = "LG";
        maxVolume = 100;
        estacionActual = 87.1;
        volActual = 20;
    }
    
    public boolean getEstado()
    {
        return isOn;
    }
    
    public boolean setEstado(boolean estaEncendido)
    {
        isOn = estaEncendido;
        return isOn;
    }
    
    public int getMaxVolume()
    {
        return maxVolume;
    }
    
    public double getEstacionActual()
    {
        return estacionActual;
    }
    
    public double setEstacionManual(double subeEstacion)
    {
        estacionActual += subeEstacion;
        return estacionActual;
    }
    
    public int getvolActual()
    {
        return volActual;
    }
    
    public int setVolActual(int cuantoMas)
    {
        volActual += cuantoMas;
        return volActual;
    }
}
