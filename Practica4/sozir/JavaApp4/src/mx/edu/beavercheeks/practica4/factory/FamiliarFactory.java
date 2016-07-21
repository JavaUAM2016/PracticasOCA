/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.factory;

import mx.edu.beavercheeks.practica4.controls.Remote;
import mx.edu.beavercheeks.practica4.devices.Device;
import mx.edu.beavercheeks.practica4.familia.*;

/**
 *
 * @author sozir
 */
public class FamiliarFactory extends AbstractFactory
{

    @Override
    public Remote getRemote(String remoteType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Device getDevice(String deviceType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String familiarType) 
    {
        Familiar miembro = null;
        
        switch (familiarType)
        {
            case "Padre":
                miembro = new Padre();
                break;
            case "Madre":
                miembro = new Madre();
                break;
            case "Hijo":
                miembro = new Hijo();
                break;
            default: 
                System.err.println("Error. No se soporta el tipo de familiar " + familiarType);
        }
        return miembro;
    }
    
}
