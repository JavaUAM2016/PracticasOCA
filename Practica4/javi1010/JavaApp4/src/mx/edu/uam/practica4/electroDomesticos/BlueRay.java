/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electroDomesticos;

/**
 *
 * @author invited
 */
public class BlueRay extends Electrodomestico{
    
    private int capituloActual;
    private String formatoPantalla;

    public BlueRay(int capituloActual, String formatoPantalla) {

        this.capituloActual = capituloActual;
        this.formatoPantalla = formatoPantalla;
    }

    public String getFormatoPantalla() {
        return formatoPantalla;
    }

    public void setFormatoPantalla(String formatoPantalla) {
        this.formatoPantalla = formatoPantalla;
    }

  

    public int getCapituloActual() {
        return capituloActual;
    }

    public void setCapituloActual(int capituloActual) {
        this.capituloActual = capituloActual;
    }

    @Override
    public String toString() {
        
        return "BlueRay " + "marca= " + super.getMarca() +", encendido="+super.isEstaEncendido()+ ", capituloActual=" + capituloActual + ", formatoPantalla=" + formatoPantalla;
    }
    
    
    
    
}
