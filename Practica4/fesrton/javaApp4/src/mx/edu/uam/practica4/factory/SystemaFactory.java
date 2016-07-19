/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

/**
 *
 * @author ferso
 */
public abstract class SystemaFactory {
    
    public static AbastractFactory getFactory(String choice) {

    AbastractFactory factoryType = null;

        switch (choice) {

            case "CONTROL":
                factoryType = new ControlFactory();
                break;
            case "ELECTRODOMESTICO":
                factoryType = new ElectrodomesticoFactory() {};
                break;
            case "FAMILIAR":
                factoryType = new FamiliarFactory() {};
                break;
            default:
                System.err.println("Error no hay fabrica para el Componente solicitada: "+choice);
        }
        return factoryType;
    }
    
    
    
}
