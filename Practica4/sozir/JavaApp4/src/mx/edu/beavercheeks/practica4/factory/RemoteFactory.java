/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.factory;

import mx.edu.beavercheeks.practica4.controls.*;
import mx.edu.beavercheeks.practica4.devices.Device;
import mx.edu.beavercheeks.practica4.familia.Familiar;

/**
 *
 * @author sozir
 */
public class RemoteFactory extends AbstractFactory
{

    @Override
    public Remote getRemote(String remoteType) 
    {
        Remote control = null;
        switch (remoteType)
        {
            case "Control TV":
                control = new TvRemote();
                break;
            case "Control Stereo":
                control = new StereoRemote();
                break;
            case "Control Ventilador":
                control = new FanRemote();
                break;
            case "Control AC":
                control = new AcRemote();
                break;
            default: 
                System.err.println("Error al crear el control. No se soporta la opcion: " + remoteType);
        }
        return control;
    }

    @Override
    public Device getDevice(String deviceType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String familiarType) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
