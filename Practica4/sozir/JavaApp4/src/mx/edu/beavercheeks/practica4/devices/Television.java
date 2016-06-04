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
public class Television extends Device
{
    private final int tamanio;
    private int canalActual;
    private int volumenActual;

    public Television()
    {
        marca = "Sony";
        tamanio = 32;
        isOn = false;
        maxVolume = 100;
    }
    
    public boolean getEstado()
    {
        return isOn;
    }
    
    public boolean setEstado(boolean howsTV)
    {
        isOn = howsTV;
        return isOn;
    }
    
    public int getVolumenActual()
    {
        return volumenActual;
    }
    
    public int setVolumenActual(int cuantoMueve)
    {
        volumenActual += cuantoMueve;
        return volumenActual;
    }
    
    public int getVolumenMax()
    {
        return maxVolume;
    }
    
    public int getCanalActual()
    {
        return canalActual;
    }
      
    public int setCanalActual(int cuantoMueve)
    {
        canalActual += cuantoMueve;
        return canalActual;
    }
    
    public int setCanalCustom (int queCanal)
    {
        canalActual = queCanal;
        return canalActual;
    }
}
