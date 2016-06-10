package mx.edu.uam.practica4.aparatos;

import mx.edu.uam.practica4.controles.ControlRemoto;


/**
 *
 * @author jhernandezn
 */
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
