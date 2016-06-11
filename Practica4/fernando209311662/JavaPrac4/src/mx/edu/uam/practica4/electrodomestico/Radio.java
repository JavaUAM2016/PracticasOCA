
package mx.edu.uam.practica4.electrodomestico;

public class Radio extends Electrodomestico{
    
    private String marca;
    private int wattsPotencia;
    private boolean encendido;
    private double estacionActual;
    private int volumenActual;
    
    private double estacionesMax;
    private int volMax;

    public Radio(String marca, int wattsPotencia, boolean encendido, double estacionActual, int volumenActual, double estacionesMax, int volMax) {
        this.marca = marca;
        this.wattsPotencia = wattsPotencia;
        this.encendido = encendido;
        this.estacionActual = estacionActual;
        this.volumenActual = volumenActual;
        this.estacionesMax = estacionesMax;
        this.volMax = volMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getWattsPotencia() {
        return wattsPotencia;
    }

    public void setWattsPotencia(int wattsPotencia) {
        this.wattsPotencia = wattsPotencia;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(double estacionActual) {
        this.estacionActual = estacionActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public double getEstacionesMax() {
        return estacionesMax;
    }

    public void setEstacionesMax(double estacionesMax) {
        this.estacionesMax = estacionesMax;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }
}
