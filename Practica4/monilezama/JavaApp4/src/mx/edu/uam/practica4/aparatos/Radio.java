
package mx.edu.uam.practica4.aparatos;


public class Radio extends Electrodomestico {

    private String marca;
private double estacionActual;
private boolean encendido=false;
private int volActual;
private int volMax=40;

    public int getVolMax() {
        return volMax;
    }
    
    public String getMarca() {
        return marca;
    }


    public boolean isEncendido() {
        return encendido;
    }

    
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getVolActual() {
        return volActual;
    }

    public void setVolActual(int volActual) {
        this.volActual = volActual;
    }

    public double getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(double estacionActual) {
        this.estacionActual = estacionActual;
    }
    
        

 

}
