/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author jhernandezn
 */
public class ControlFactory extends AbstractFactory {


    @Override
     public ControlRemoto getControl(String typeControl) {
        ControlRemoto control = null;
        switch (typeControl) {

            case "ControlTV":
                control = new ControlTV();
                break;
            case "ControlBlueRay":
                control = new ControlBlueRay();
                break;
            case "ControlVentilador":
                control = new ControlVentilador();
                break;
            default:
                System.err.println("Error al crear Control. no soportado: "+ typeControl);
        }

        return control;
        
    }

    @Override
    public ElectroDomestico getElectrodometico(String typeElectrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
