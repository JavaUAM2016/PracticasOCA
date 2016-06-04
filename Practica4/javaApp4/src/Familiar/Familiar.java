/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Familiar;

import mx.edu.uam.Controles.ControlRemoto;

/**
 *
 * @author invited
 *
 */
public abstract class Familiar {

    public void setControlesRemotos(ControlRemoto[] controles) {
        
    }

    public ControlRemoto [] getControlesRemotos() {
        ControlRemoto [] cont= new ControlRemoto[10];
        return cont;
    }

}
