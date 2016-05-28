package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author invited
 */
public class Estereo {
    
    private String marca;
    private boolean encendido;
    private float estacionActual;
    private int volumenActual;

    public Estereo(String marca, boolean encendido, float estacionActual, int volumenActual) {
        this.marca = marca;
        this.encendido = encendido;
        this.estacionActual = estacionActual;
        this.volumenActual = volumenActual;
    }

    public String getMarca() {
        System.out.println("Marca del estereo: " + marca);
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        System.out.println("Marca del estereo: " + marca);
    }


    public boolean isEncendido() {
        if(encendido == true)
            System.out.println("ENCENDIDO!!");
        else
            System.out.println("APAGADO!!");
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
        if(encendido == true)
            System.out.println("ENCENDIDO!!");
        else
            System.out.println("APAGADO!!");
    }

    public float getEstacionActual() {
        System.out.println("Estaciòn actual: " + estacionActual);
        return estacionActual;
    }

    public void setEstacionActual(float estacionActual) {
        this.estacionActual = estacionActual;
        System.out.println("Estaciòn actual: " + estacionActual);
    }

    public int getVolumenActual() {
        System.out.println("Volumen actual: " + volumenActual);
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
        System.out.println("Volumen actual: " + volumenActual);
    }   
}
