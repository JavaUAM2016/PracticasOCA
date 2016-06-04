/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.controls;
import mx.edu.beavercheeks.practica4.devices.*;

/**
 *
 * @author sozir
 */
public class AcRemote extends Remote
{
    AirConditioner ac = new AirConditioner();
    
    @Override
    //Sobrecarga del método para aumentar velocidad cuando se enciende
    public void enciendeAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()==false)
        {
            cualAparato.setEstado(true);
            ac.setModo(true);
            ac.setVelocidad(1);
            System.out.println("Encendiendo dispositivo..");
        }
        else 
            System.out.println("El aparato ya se encontraba encendido.");
    }
    
    @Override
    //Sobrecarga del método para poner velocidad en 0 cuando se apaga.
    public void apagaAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()== false)
            System.out.println("El aparato ya se encontraba apagado");
        else
        {
            cualAparato.setEstado(false);
            ac.setVelocidad(0);
            System.out.println("Apagando dispositivo");
        }
    }
    
    public void modoCaliente()
    {
        if (ac.getEstado()== false)
            System.out.println("El AC se encuentra apagado, enciéndalo para poder operar.");
        else
        {
            ac.setModo(false);
            ac.setTemperatura(10);
            ac.setVelocidad(2);
            System.out.println("El AC ahora calienta. La temperatura es de "+ ac.getTemperatura() + "°. La velocidad es de "+ ac.getVelocidad());
        }
    }
    
    public void modoFrio()
    {
        if (ac.getEstado()==false)
            System.out.println("El AC se encuentra apagado, enciéndalo para poder operar.");
        else
        {
            ac.setModo(true);
            ac.setTemperatura(-10);
            ac.setVelocidad(2);
            System.out.println("El AC ahora enfría. La temperatura es de "+ ac.getTemperatura() + "°. La velocidad es de "+ ac.getVelocidad());
        }
    }
    
    public void aumentaVelocidad()
    {
        if (ac.getEstado()==false)
            System.out.println("El AC se encuentra apagado, enciéndalo para poder operar.");
        else
        {
            ac.setVelocidad(1);
            System.out.println("La velocidad es de "+ ac.getVelocidad());
        }
    }
    
    public void disminuyeVelocidad()
    {
       if (ac.getEstado()==false)
            System.out.println("El AC se encuentra apagado, enciéndalo para poder operar.");
        else
        {
            ac.setVelocidad(-1);
            System.out.println("La velocidad es de "+ ac.getVelocidad());
        } 
    }
    
    
}
