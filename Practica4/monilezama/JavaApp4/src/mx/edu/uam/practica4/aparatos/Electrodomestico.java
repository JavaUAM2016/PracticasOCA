/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.aparatos;

import mx.edu.uam.practica4.controles.ControlRemoto;

/**
 *solo se escriben los atributos y metodos, y pueden no implementarse
 * @author invited
 */
public abstract class Electrodomestico {
    private ControlRemoto control;
    private String  marca;
    private boolean encendido;

    public ControlRemoto getControl() {
        return control;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setControl(ControlRemoto control) {
        this.control = control;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
   
}
