/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uam.dispositivos;

import mx.edu.uam.Controles.ControlRemoto;


/**
 *
 * @author invited
 *
 */
public abstract class Electrodomestico {
    
    private ControlRemoto controlRemoto;
    private boolean estaPrendido;
    private String marca;
    
    
    //Get and Set
    public boolean getEncendido(){
        return estaPrendido;
    }
    
    public void setEncendido(boolean prendido){
        estaPrendido = prendido;
    }
       
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
}
