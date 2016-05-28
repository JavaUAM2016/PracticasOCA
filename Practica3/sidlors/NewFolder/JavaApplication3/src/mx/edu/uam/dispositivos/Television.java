package mx.edu.uam.dispositivos;

/**
 *
 * @author Yafte Aaron Flores
 *
 */
public class Television {
//variables 
    private String marca;
    private int tamaño;
    private boolean encendido;
    private int canalActual;
    private int volumenActual;
    private final int VOLUMENMAX=50;

    public Television(String marca, int tamaño, boolean encendido, int canalActual, int volumenActual) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
    }
   
// getters and setter
    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public int getCanalActual() {
        return canalActual;
    } 
    
    public boolean getEncendido(){
     return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public int getVolumenMax(){
        return VOLUMENMAX;
    }
    
}
