/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.control.ControlBlueRay;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTelevision;
import mx.edu.uam.practica4.control.ControlVentilador;
import mx.edu.uam.practica4.familia.Familiar;



/**
 *
 * @author jhernandezn
 */
public  class ControlFactory extends AbastractFactory {

    @Override
    public ControlRemoto getControl(String typeControl) {
        
        ControlRemoto controlRemoto = null;
        switch (typeControl) {
            case "ControlTV":
                controlRemoto = new ControlTelevision();
                break;
            case "ControlBlueRay":
                controlRemoto = new ControlBlueRay();
                break;
            case "ControlVentilador":
                controlRemoto = new ControlVentilador();
                break;
            default:
                System.err.println("Error al crear Control. no soportado: " + typeControl);
        }

        return controlRemoto;
    }

    @Override
    public ElectroDomestico getElectrodomestico(String typeElectrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
