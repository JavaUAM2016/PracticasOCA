package mx.edu.uam.practica4.electroDomesticos;

import mx.edu.uam.practica4.controles.ControlRemoto;


public abstract class ElectroDomestico {
    
    private ControlRemoto control;
    private boolean estaEncendido;
    private String marca;

    
    public ControlRemoto getControl() {
        return control;
    }

    public void setControl(ControlRemoto control) {
        this.control = control;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
   

   
    
    
}
