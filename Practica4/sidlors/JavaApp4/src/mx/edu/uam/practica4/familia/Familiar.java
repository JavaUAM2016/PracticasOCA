package mx.edu.uam.practica4.familia;

import mx.edu.uam.practica4.controles.ControlRemoto;

/**
 *
 * @author jhernandezn
 */
public abstract class Familiar {
    
    private String nombre;
    private int edad;
    private ControlRemoto[] controlesRemotos;

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

    public ControlRemoto[] getControlesRemotos() {
        return controlesRemotos;
    }

    public void setControlesRemotos(ControlRemoto[] controlesRemotos) {
        this.controlesRemotos = controlesRemotos;
    }
    
    
    
}
