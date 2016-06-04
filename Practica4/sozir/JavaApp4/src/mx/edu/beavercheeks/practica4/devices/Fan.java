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
public class Fan extends Device
{
    private int velocidad;
    private boolean giratorio;
    private int timer;
    
    public Fan()
    {
        isOn = false;
        marca = "Home Line";
        velocidad = 0;
        giratorio = false;
        timer = 0;
    }
    
    public boolean getEstado()
    {
        return isOn;
    }
    
    public boolean setEstado(boolean loEnciendo)
    {
        isOn = loEnciendo;
        return isOn;
    }
    
    public int getVelocidad()
    {
        return velocidad;
    }
    
    public int setVelocidad(int queVelocidad)
    {
        switch (queVelocidad)
        {
            case 1:
                velocidad = 1;
                break;
            case 2: 
                velocidad = 2;
                break;
            case 3:
                velocidad = 3;
                break;
            default:
                //System.out.println("El valor que especificó no se encuentra en el rago permitido. Velocidad en 0.");
                velocidad = 0;
                break;
        }
        return velocidad;
    }
    
    public boolean getGiratorio()
    {
        return this.giratorio;
    }
    
    public boolean setGiratorio(int haciaDonde)
    {
        if (haciaDonde == 1 || haciaDonde == 2)
            this.giratorio = true;
        else
            this.giratorio = false;
        
        return this.giratorio;
    }
    
    public int getTimer()
    {
        return this.timer;
    }
    
    public int setTimer(int cuantoTiempo)
    {
        this.timer = cuantoTiempo;
        return this.timer;
    }
}
