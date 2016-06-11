package mx.edu.uam.practica4.familia;

import mx.edu.uam.practica4.control.Control;

public abstract class Familiar {
    
    private String nombre;
    private int edad;
    private Control[] controles;

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

    public Control[] getControles() {
        return controles;
    }

    public void setControles(Control[] controles) {
        this.controles = controles;
    }
       
}
