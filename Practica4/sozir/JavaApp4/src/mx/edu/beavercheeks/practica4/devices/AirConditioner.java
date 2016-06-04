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
public class AirConditioner extends Device
{
    private int temperatura;
    private boolean modo;
    private int velocidad;
    
    public AirConditioner()
    {
        isOn = false;
        marca = "Panasonic";
        temperatura = 0;
        modo = false;
        velocidad = 0;
    }
    
    public boolean getEstado()
    {
        return isOn;
    }
    
    public boolean setEstado(boolean comoEsta)
    {
        isOn = comoEsta;
        return isOn;
    }
    
    public int getTemperatura()
    {
        return temperatura;
    }
    
    public int setTemperatura(int cuantoMueve)
    {
        temperatura += cuantoMueve;
        return temperatura;
    }
    
    public boolean getModo()
    {
        return modo;
    }
    
    public boolean setModo(boolean frioCaliente)
    {
        modo = frioCaliente;
        return modo;
    }
    
    public int getVelocidad()
    {
        return velocidad;
    }
    
    public int setVelocidad(int cuantoMas)
    {
        velocidad += cuantoMas;
        return velocidad;
    }
}
