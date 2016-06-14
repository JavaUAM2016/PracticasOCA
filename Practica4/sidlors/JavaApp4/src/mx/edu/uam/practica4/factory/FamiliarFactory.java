/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Hija;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;

/**
 *
 * @author jhernandezn
 */
public class FamiliarFactory extends AbstractFactory {

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
            case "Hija":
                familiar = new Hija();
                break;
            case "Hijo":
                familiar = new Hijo();
                break;

            default:
                System.err.println("Error al crear familiar. no soportado: "+ typeFamiliar);
        }

        return familiar;
    }

    @Override
    public ControlRemoto getControl(String typeControl) {
        return null;
    }

    @Override
    public ElectroDomestico getElectrodometico(String typeElectrodomestico) {
        return null;
    }

}
