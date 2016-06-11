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

    public ControlRemoto[] getControl() {
        return control;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setControl(ControlRemoto[] control) {
        this.control = control;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

   
    

    
}
