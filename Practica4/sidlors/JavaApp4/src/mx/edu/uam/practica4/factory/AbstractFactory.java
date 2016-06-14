/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author jhernandezn
 */
public abstract class AbstractFactory {
    
    public abstract ControlRemoto getControl(String typeControl);
    public abstract ElectroDomestico getElectrodometico(String typeElectrodomestico);
    public abstract Familiar getFamiliar(String typeFamiliar);
    
}
