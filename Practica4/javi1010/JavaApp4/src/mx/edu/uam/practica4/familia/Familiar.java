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
public class Familiar {
    
    private String nombre;
    private int edad;
    private ControlRemoto [] controles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ControlRemoto[] getControles() {
        return controles;
    }

    public void setControles(ControlRemoto[] controles) {
        this.controles = controles;
    }
    
    
    
    
}
