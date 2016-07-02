/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electrodomestico;

import mx.edu.uam.practica4.control.ControlRemoto;

/**
 *
 * @author victor
 */
public abstract class ElectroDomestico {
    
    private ControlRemoto control;
    private boolean encendido;
    private String marca;

    public ControlRemoto getControl() {
        return control;
    }

    public void setControl(ControlRemoto control) {
        this.control = control;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
