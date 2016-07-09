/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;


/**
 *
 * @author jhernandezn
 */
public  class FamiliarFactory extends AbastractFactory {

    @Override
    public ControlRemoto getControl(String typeControl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ElectroDomestico getElectrodomestico(String typeElectrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        Familiar familiar = null;
        switch (typeFamiliar) {

            case "Padre":
                familiar = new Padre();
                break;
            case "Madre":
                familiar = new Madre();
                break;
            
            case "Hijo":
                familiar = new Hijo();
                break;

            default:
                System.err.println("Error al crear familiar. no soportado: "+ typeFamiliar);
        }

        return familiar;

    


    }
}