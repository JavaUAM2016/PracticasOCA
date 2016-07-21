/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.factory;

/**
 *
 * @author sozir
 */
public abstract class SystemFactory 
{
    public static AbstractFactory getFactory(String choice)
    {
        AbstractFactory factoryType = null;
        
        switch(choice)
        {
            case "CONTROL":
                factoryType = new RemoteFactory();
                break;
            case "ELECTRODOMESTICO":
                factoryType = new DeviceFactory();
                break;
            case "FAMILIAR":
                factoryType = new FamiliarFactory();
                break;
            default: 
                System.err.println("Error. No existe una fábrica para el componente solicitado " + choice);
        }
        return factoryType;
    }
}
