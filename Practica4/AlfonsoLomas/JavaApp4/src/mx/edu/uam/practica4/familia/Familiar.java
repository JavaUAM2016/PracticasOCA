package mx.edu.uam.practica4.familia;

import mx.edu.uam.practica4.control.ControlRemoto;

/**
 *
 * @author invited
 */
public abstract class Familiar {
    
    private String nombre;
    private int edad;
    private ControlRemoto[] controlRemoto;

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

    public ControlRemoto[] getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(ControlRemoto[] controlRemoto) {
        this.controlRemoto = controlRemoto;
    }
        
}
