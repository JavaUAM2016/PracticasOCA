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
public class Padre extends Familiar {

    public void setControl(ControlRemoto[] control) {
        this.control = control;
    }

    public ControlRemoto[] getControl() {
        return control;
    }
    
}
