/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.controls;
import mx.edu.beavercheeks.practica4.devices.*;
//import mx.edu.beavercheeks.practica4.devices.Fan;

/**
 *
 * @author sozir
 */
public class FanRemote extends Remote
{
    Fan ventilador = new Fan();
    
    @Override
    //Sobrecarga del método para aumentar velocidad cuando se enciende
    public void enciendeAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()==false)
        {
            cualAparato.setEstado(true);
            ventilador.setVelocidad(1);
            System.out.println("Encendiendo dispositivo..");
        }
        else 
            System.out.println("El aparato ya se encontraba encendido.");
    }
    
    @Override
    //Sobrecarga del método para quitar velocidad cuando se apaga
    public void apagaAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()== false)
            System.out.println("El aparato ya se encontraba apagado");
        else
        {
            ventilador.setVelocidad(0);
            cualAparato.setEstado(false);
            System.out.println("Apagando dispositivo");
        }
    }
   
    public void aumentaVelocidad()
    {
        if (ventilador.getEstado()== false)
            System.out.println("El ventilador se encuentra apagado. No puede aumentar la velocidad.");
        else
        {
            if (ventilador.getVelocidad() <= 0)
            {
             ventilador.setVelocidad(1);
             System.out.println("Velocidad aumentada. Velocidad actual: " + ventilador.getVelocidad());
            }
            else if (ventilador.getVelocidad() <= 1)
            {
                ventilador.setVelocidad(2);
                System.out.println("Velocidad aumentada. Velocidad actual: " + ventilador.getVelocidad());
            }
            else if (ventilador.getVelocidad() <= 2)
            {
                ventilador.setVelocidad(3);
                System.out.println("Velocidad aumentada. Velocidad actual: " + ventilador.getVelocidad());
            }
            else if (ventilador.getVelocidad() <= 3)
                System.out.println("El ventilador se encuentra en velocidad máxima. No puede aumentar más.");
        }    
    }
    
    public void disminuyeVelocidad()
    {
       if (ventilador.getEstado()== false || ventilador.getVelocidad() == 0)
            System.out.println("El ventilador se encuentra apagado. No puede disminuir la velocidad.");
        else
        {
            if (ventilador.getVelocidad() > 0 && ventilador.getVelocidad() <=1)
            {
                ventilador.setVelocidad(0);
                System.out.println("El ventilador se encuentra en velocidad mínima. Apagando.");
                ventilador.setEstado(false);
            }
            else if (ventilador.getVelocidad() > 1 && ventilador.getVelocidad() <=2)
            {
                ventilador.setVelocidad(1);
                System.out.println("Velocidad disminuida. Velocidad actual: " + ventilador.getVelocidad());
            }
            else if (ventilador.getVelocidad() > 2 && ventilador.getVelocidad() <=3)
            {
                ventilador.setVelocidad(2);
                System.out.println("Velocidad disminuida. Velocidad actual: " + ventilador.getVelocidad());
            }
        }  
    }
    
    public void giraVentiladorDerecha()
    {
        if (ventilador.getEstado()== false || ventilador.getVelocidad() == 0)
            System.out.println("El ventilador se encuentra apagado. No puede girar.");
        else
        {
            if (ventilador.getGiratorio() == false)
            {
                ventilador.setGiratorio(1);
                System.out.println("Iniando giro hacia la derecha...");
            }
            else
                System.out.println("El ventilador ya se encontraba girando.");
        }
    }
    
    public void giraVentiladorIzquierda()
    {
        if (ventilador.getEstado()== false || ventilador.getVelocidad() == 0)
            System.out.println("El ventilador se encuentra apagado. No puede girar.");
        else
        {
            if (ventilador.getGiratorio() == false)
            {
                ventilador.setGiratorio(2);
                System.out.println("Iniando giro hacia la izquierda...");
            }
            else
                System.out.println("El ventilador ya se encontraba girando.");
        }
    }
    
    public void programaApagado(int cuantoTiempo)
    {
         if (ventilador.getEstado()== false || ventilador.getVelocidad() == 0 || ventilador.getTimer() == 0)
            System.out.println("El ventilador se encuentra apagado.");
        else
        {
            ventilador.setTimer(cuantoTiempo);
            System.out.println("Ventilador programado para apagarse en " + ventilador.getTimer() + " minutos.");
        }
    }
}
