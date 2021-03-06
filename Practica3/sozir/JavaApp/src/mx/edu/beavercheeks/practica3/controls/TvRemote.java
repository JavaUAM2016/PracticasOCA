/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica3.controls;
import mx.edu.beavercheeks.practica3.devices.Television;

/**
 *
 * @author invited
 */
public class TvRemote {
    
    Television tv = new Television();
    
    public void enciendeTV()
    {
        if(tv.getTVStatus() == false)
        {
            tv.setTVStatus(true);
            System.out.println("Encendiendo televisión...");
        }
        else
            System.out.println("La televisión ya estaba encendida...");
    }

    public void apagaTV()
    {
        if(tv.getTVStatus() == false)
        {
            System.out.println("La televisión ya estaba apagada...");
        }
        else
            tv.setTVStatus(false);
            System.out.println("Apagando TV. Adiós...");
    }
    
    public void subeVolumen()
    {
        if (tv.getTVStatus() == false)
        {
            System.out.println("La televisión está apagada. No puede cambiar el volumen.");
        }
        else
        {
            if (tv.getVolumenActual() < tv.getVolumenMax())
            {
                tv.setVolumenActual(1);
               System.out.println("El volumen ha aumentado en una unidad. El volumen actual es de " + tv.getVolumenActual());
            }
            if (tv.getVolumenActual() == tv.getVolumenMax())
                System.out.println("El volumen está al máximo nivel, no puede aumentar más.");
            /*if (tv.getVolumenActual() > volumenMax)
                tv.volumenActual = 100;*/
        }
    }
    public void bajaVolumen()
    {
        if (tv.getTVStatus()==false)
        {
            System.out.println("La televisión está apagada. No puede cambiar el volumen.");
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
                System.out.println("El volumen está en el mínimo. No puede disminuir más.");
        }
    }
    
    public void cambiaCanalMas()
    {
        if (tv.getTVStatus()==false)
        {
            System.out.println("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            System.out.println("El canal actual es  " + tv.getCanalActual());
            System.out.println("Cambiando canal... ");
            tv.setCanalActual(1);
            System.out.println("El canal actual es  " + tv.getCanalActual());
        }
    }
    
    public void cambiaCanalMenos()
    {
        if (tv.getTVStatus()==false)
        {
            System.out.println("La televisión está apagada. No puede cambiar el canal.");
        }
        else
        {
            System.out.println("El canal actual es  " + tv.getCanalActual());
            System.out.println("Cambiando canal... ");
            tv.setCanalActual(-1);
            System.out.println("El canal actual es  " + tv.getCanalActual());
        }
    }
    
    public void cambiaCanal(int cualCanal)
    {
        if (tv.getTVStatus()==false)
        {
            System.out.println("La televisión está apagada. No puede cambiar el canal.");
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
