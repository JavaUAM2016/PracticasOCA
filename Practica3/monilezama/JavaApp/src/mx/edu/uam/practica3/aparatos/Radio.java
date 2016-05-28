
package mx.edu.uam.practica3.aparatos;


public class Radio {

    private String marca;
private double estacionActual;
private boolean encendido=false;
private int volActual;

    

    public String getMarca() {
        return marca;
    }


    public boolean isEncendido() {
        return encendido;
    }

    
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
