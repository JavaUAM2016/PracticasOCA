package mx.edu.uam.practica4.electrodomesticos;

import mx.edu.uam.practica4.controles.ControlRemoto;

public abstract class Electrodomestico {
    
    private ControlRemoto control;
    private boolean       powerStatus;
    private String        marca;

    public ControlRemoto getControl() {
        return control;
    }

    public void setControl(ControlRemoto control) {
        this.control = control;
    }

    public boolean isPowerStatus() {
        return powerStatus;
    }

    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
