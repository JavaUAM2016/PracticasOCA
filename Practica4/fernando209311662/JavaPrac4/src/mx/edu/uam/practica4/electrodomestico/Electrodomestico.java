package mx.edu.uam.practica4.electrodomestico;

import mx.edu.uam.practica4.control.Control;

public abstract class Electrodomestico {
    
    private Control control;
    private String marca;
    private String color;
    private boolean encendido;

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
