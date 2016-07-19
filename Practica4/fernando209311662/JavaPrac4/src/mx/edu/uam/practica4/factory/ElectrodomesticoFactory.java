/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.electrodomestico.PlayStation3;
import mx.edu.uam.practica4.electrodomestico.Radio;
import mx.edu.uam.practica4.electrodomestico.Television;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author invited
 */
public class ElectrodomesticoFactory extends AbstractFactory{

    @Override
    public Control getControl(String typeControl) {
        return null;
    }

    @Override
    public Electrodomestico getElectrodomestico(String typeElectrodomestico) {
        Electrodomestico electrodomestico = null;
        switch(typeElectrodomestico){
            case "Padre":
                electrodomestico = new PlayStation3();
                break;
            case "Madre":
                electrodomestico = new Radio();
                break;
            case "Hijo":
                electrodomestico = new Television();
                break;
            default:
                System.err.println("Error al crear electrodomestico, no soportado" + typeElectrodomestico);
        }
        return electrodomestico;
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        return null;
    }
    
}
