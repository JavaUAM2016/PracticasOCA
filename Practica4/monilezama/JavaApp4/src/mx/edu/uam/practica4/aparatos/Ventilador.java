
package mx.edu.uam.practica4.aparatos;


public class Ventilador extends Electrodomestico{
    private String marca;
    private boolean encendido=false;
    private int subirVel;
    private int bajarVel;
    private int velActual;
    private boolean girando=false;
    private int volMax=3;

    public int getVolMax() {
        return volMax;
    }
    
    public int getBajarVel() {
        return bajarVel;
    }

    public String getMarca() {
        return marca;
    }

    public int getSubirVel() {
        return subirVel;
    }

    public int getVelActual() {
        return velActual;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setBajarVel(int bajarVel) {
        this.bajarVel = bajarVel;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public void setSubirVel(int subirVel) {
        this.subirVel = subirVel;
    }

    public void setVelActual(int velActual) {
        this.velActual = velActual;
    }

    public boolean isGirando() {
        return girando;
    }
    
    
    
    
}
