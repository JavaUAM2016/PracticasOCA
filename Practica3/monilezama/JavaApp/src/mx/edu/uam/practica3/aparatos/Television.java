
package mx.edu.uam.practica3.aparatos;


public class Television {
    private String marca;
    private int tamanio;
    private boolean encendido=false; //apagada
    private int canalActual;
    private int volActual;
    
    
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setVolActual(int volActual) {
        this.volActual = volActual;
    }
    
    
      
    
           
}
