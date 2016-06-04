
package mx.edu.uam.practica4.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class Radio {
    private String marca;
    private int tamanio;
    private boolean encendido;
    private int estacionActual;
    private int volumenActual;
    private int volumenMaximo;
    private String frecuencia;

    public Radio(String marca, int tamanio, boolean encendido, int estacionActual, int volumenActual, int volumenMaximo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.estacionActual = estacionActual;
        this.volumenActual = volumenActual;
        this.volumenMaximo = volumenMaximo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getEstacionActual() {
        return estacionActual;
    }

    public void setEstacionActual(int estacionActual) {
        this.estacionActual = estacionActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(int volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }
    
        
    
    
}
