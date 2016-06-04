/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.devices;
//import mx.edu.beavercheeks.practica4.controls.Remote;

/**
 *
 * @author sozir
 */
public abstract class Device 
{
    //private Remote control;
    public boolean isOn;
    protected String marca;
    protected int maxVolume;
    
    public boolean getEstado()
    {
        return isOn;
    }
    
    public boolean setEstado(boolean comoEsta)
    {
        isOn = comoEsta;
        return isOn;
    }
}
