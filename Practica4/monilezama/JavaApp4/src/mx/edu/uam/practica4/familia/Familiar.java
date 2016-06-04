/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.familia;

import mx.edu.uam.practica4.controles.ControlRemoto;

/**
 *
 * @author invited
 */
public abstract class Familiar {
     private String nombre;
     private int edad;
     ControlRemoto[] control;

    public void setControlesRemotos(ControlRemoto[] controles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ControlRemoto[] getControlRemotos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
