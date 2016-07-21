/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.factory;

import mx.edu.beavercheeks.practica4.controls.Remote;
import mx.edu.beavercheeks.practica4.devices.*;
import mx.edu.beavercheeks.practica4.familia.Familiar;

/**
 *
 * @author sozir
 */
public class DeviceFactory extends AbstractFactory
{

    @Override
    public Remote getRemote(String remoteType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Device getDevice(String deviceType) 
    {
        Device electrodomestico = null;
        
        switch(deviceType)
        {
            case "Television":
                electrodomestico = new Television();
                break;
            case "Stereo":
                electrodomestico = new Stereo();
                break;
            case "Ventilador":
                electrodomestico = new Fan();
                break;
            case "Aire Acondicionado":
                electrodomestico = new AirConditioner();
                break;
            default: 
                System.err.println("Error. No se soporta el tipo de dispositivo " + deviceType + " solicitado.");
        }
        return electrodomestico;
        
    }

    @Override
    public Familiar getFamiliar(String familiarType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
