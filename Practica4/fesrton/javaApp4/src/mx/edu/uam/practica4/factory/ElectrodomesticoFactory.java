/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;


/**
 *
 * @author jhernandezn
 */
public  class ElectrodomesticoFactory extends AbastractFactory{

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
   
    
    
}
