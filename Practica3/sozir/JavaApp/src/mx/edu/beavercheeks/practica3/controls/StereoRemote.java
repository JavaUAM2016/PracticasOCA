/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica3.controls;
import mx.edu.beavercheeks.practica3.devices.Stereo;

/**
 *
 * @author invited
 */
public class StereoRemote 
{
    Stereo st = new Stereo();
    
    public void enciendeStereo()
    {
        if(st.getStatus() == false)
        {
            st.setStatus(true);
            System.out.println("Encendiendo stereo. Bienvenido.");
        }
        else
            System.out.println("El stereo ya se encontraba encendido.");
    }
    
    public void apagaStereo()
    {
        if(st.getStatus() == false)
            System.out.println("El stereo se encuentra apagado.");
        else
        {
            st.setStatus(true);
            System.out.println("Apagando stereo. Adiós.");
        }
    }
    
    public void subeVolumen()
    {
        if (st.getStatus()==false)
        {
            System.out.println("El stereo se encuentra apagado, no se puede modificar el volumen.");
        }
        else
        {
            if(st.getvolActual() < st.getMaxVolume())
            {
                st.setVolActual(1);
                System.out.println("El volumen ha aumentado en una unidad. El volumen actual es de " + st.getvolActual());
            }
            if (st.getvolActual() == st.getMaxVolume())
                System.out.println("El volumen está al máximo nivel, no puede aumentar más.");
                
        }
        
    }
    
    public void bajaVolumen()
    {
        if (st.getStatus()==false)
        {
            System.out.println("El stereo se encuentra apagado, no se puede modificar el volumen.");
        }
        else
        {
            if(st.getvolActual() < st.getMaxVolume() || st.getvolActual() == st.getMaxVolume() )
            {
                st.setVolActual(-1);
                System.out.println("El volumen ha disminuído en una unidad. El volumen actual es de " + st.getvolActual());
            }
            if (st.getvolActual() <= 0)
                System.out.println("El volumen está en el mínimo. No puede disminuir más.");
                
        }
        
    }
    
    public void cambiaEstacionManualMas()
    {
        if (st.getStatus() == false)
            System.out.println("El stereo se encuentra apagado, no se puede modificar el volumen.");
        else
        {
            System.out.println("La estación actual es  " + st.getEstacionActual());
            System.out.println("Cambiando estación... ");
            st.setEstacionManual(0.1);
            System.out.println("La estación actual es  " + st.getEstacionActual());
        }
    }
    
    public void cambiaEstacionManualMenos()
    {
        if (st.getStatus() == false)
            System.out.println("El stereo se encuentra apagado, no se puede modificar el volumen.");
        else
        {
            System.out.println("La estación actual es  " + st.getEstacionActual());
            System.out.println("Cambiando estación... ");
            st.setEstacionManual(-0.1);
            System.out.println("La estación actual es  " + st.getEstacionActual());
        }
    }
    
}
