/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.controls;
import mx.edu.beavercheeks.practica4.devices.Television;
import mx.edu.beavercheeks.practica4.exceptions.SystemDevicesExceptions;

/**
 *
 * @author sozir
 */
public class TvRemote extends Remote
{
    
    public void subeVolumen(Television tv) throws SystemDevicesExceptions
    {
        if (tv.getEstado() == false)
        {
            //System.out.println("La televisión está apagada. No puede cambiar el volumen.");
            throw new SystemDevicesExceptions("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            if (tv.getVolumenActual() < tv.getVolumenMax())
            {
                tv.setVolumenActual(1);
               System.out.println("El volumen ha aumentado en una unidad. El volumen actual es de " + tv.getVolumenActual());
            }
            if (tv.getVolumenActual() == tv.getVolumenMax())
                //System.out.println("El volumen está al máximo nivel, no puede aumentar más.");
                throw new SystemDevicesExceptions("El volumen está al máximo nivel, no puede aumentar más.");
            
            /*if (tv.getVolumenActual() > volumenMax)
                tv.volumenActual = 100;*/
        }
    }
    public void bajaVolumen(Television tv) throws SystemDevicesExceptions
    {
        if (tv.getEstado()==false)
        {
            //System.out.println("La televisión está apagada. No puede cambiar el volumen.");
            throw new SystemDevicesExceptions("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            if (tv.getVolumenActual() < tv.getVolumenMax() || tv.getVolumenActual() == tv.getVolumenMax())
            {
                tv.setVolumenActual(-1);
                System.out.println("El volumen ha disminuido en una unidad. El volumen actual es de " + tv.getVolumenActual());
            }            
            /*if (tv.getVolumenActual() > volumenMax)
                volumenActual = 100;*/
            if (tv.getVolumenActual() <= 0)
                //System.out.println("El volumen está en el mínimo. No puede disminuir más.");
                throw new SystemDevicesExceptions("El volumen está en el mínimo. No puede disminuir más.");
        }
    }
    
    public void cambiaCanalMas(Television tv) throws SystemDevicesExceptions
    {
        if (tv.getEstado()==false)
        {
            //System.out.println("La televisión está apagada. No puede cambiar el canal.");
            throw new SystemDevicesExceptions("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            System.out.println("El canal actual es  " + tv.getCanalActual());
            System.out.println("Cambiando canal... ");
            tv.setCanalActual(1);
            System.out.println("El canal actual es  " + tv.getCanalActual());
        }
    }
    
    public void cambiaCanalMenos(Television tv) throws SystemDevicesExceptions
    {
        if (tv.getEstado()==false)
        {
            //System.out.println("La televisión está apagada. No puede cambiar el canal.");
            throw new SystemDevicesExceptions("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            System.out.println("El canal actual es  " + tv.getCanalActual());
            System.out.println("Cambiando canal... ");
            tv.setCanalActual(-1);
            System.out.println("El canal actual es  " + tv.getCanalActual());
        }
    }
    
    public void cambiaCanal(Television tv, int cualCanal) throws SystemDevicesExceptions
    {
        if (tv.getEstado()==false)
        {
            //System.out.println("La televisión está apagada. No puede cambiar el canal.");
            throw new SystemDevicesExceptions("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            System.out.println("El canal actual es  " + tv.getCanalActual());
            System.out.println("Cambiando canal... ");
            tv.setCanalCustom(cualCanal);
            System.out.println("El canal actual es  " + tv.getCanalActual());
        }
    }
    
}
