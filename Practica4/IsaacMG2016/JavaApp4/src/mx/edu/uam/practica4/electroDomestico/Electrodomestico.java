package mx.edu.uam.practica4.electroDomestico;

import mx.edu.uam.practica4.control.ControlRemoto;

/**
 *
 * @author Isaac MG
 */
public abstract class Electrodomestico {

    private ControlRemoto controlRemo;
    private boolean estaPrendido;
    private String marca;

    public ControlRemoto getControlRemo() {
        return controlRemo;
    }

    public void setControlRemo(ControlRemoto controlRemo) {
        this.controlRemo = controlRemo;
    }

    public boolean isEstaPrendido() {
        return estaPrendido;
    }

    public void setEstaPrendido(boolean estaPrendido) {
        this.estaPrendido = estaPrendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
