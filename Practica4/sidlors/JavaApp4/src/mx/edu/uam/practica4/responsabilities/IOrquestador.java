/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.responsabilities;

import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author sidlors
 */
public interface IOrquestador {
    
    public void setSiguiente(IOrquestador eslabon);
    public IOrquestador getSiguiente();
    //Aqui va el metodo de negocio
    public void configuraArrayControles(Familiar f, ControlRemoto[] controlesArray);
    
    
}
