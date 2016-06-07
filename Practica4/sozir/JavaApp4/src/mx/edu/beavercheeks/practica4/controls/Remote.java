/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.controls;
import mx.edu.beavercheeks.practica4.devices.Device;

/**
 *
 * @author sozir
 */
public abstract class Remote 
{
    protected int noBaterias;
    protected String tipoBaterias;
    
    public void enciendeAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()==false)
        {
            cualAparato.setEstado(true);
            System.out.println("Encendiendo dispositivo..");
        }
        else 
            System.out.println("El aparato ya se encontraba encendido.");
    }
    
    public void apagaAparato(Device cualAparato)
    {
        if(cualAparato.getEstado()== false)
            System.out.println("El aparato ya se encontraba apagado");
        else
        {
            cualAparato.setEstado(false);
            System.out.println("Apagando dispositivo");
        }
    }
}
