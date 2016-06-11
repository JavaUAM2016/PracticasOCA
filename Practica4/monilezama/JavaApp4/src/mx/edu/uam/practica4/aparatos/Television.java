
package mx.edu.uam.practica4.aparatos;


public class Television extends Electrodomestico{
    private String marca;
    private int tamanio;
    private boolean encendido=false; //apagada
    private int canalActual;
    private int volActual;
    private int volMax=30;

    public int getVolMax() {
        return volMax;
    }
    
    public int getCanalActual() {
        return canalActual;
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getVolActual() {
        return volActual;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setVolActual(int volActual) {
        this.volActual = volActual;
    }
    
    
      
    
           
}
