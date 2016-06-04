package mx.edu.uam.practica4.electrodomestico;

import mx.edu.uam.practica4.control.ControlRemoto;

/**
 *
 * @author invited
 */
public abstract class Electrodomestico {
    
    private ControlRemoto controlRemoto;
    private boolean encendido;
    private String marca;

    public ControlRemoto getControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(ControlRemoto controlRemoto) {
        this.controlRemoto = controlRemoto;
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
