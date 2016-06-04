package mx.edu.uam.dispositivos;

/**
 *
 * @author Yafte Aaron Flores
 *
 */
public class Television extends Electrodomestico{
//variables 
    private int tamaño;   
    private int canalActual;
    private int volumenActual;
    private final int VOLUMENMAX=50;

    public Television(String marca, int tamaño, boolean encendido, int canalActual, int volumenActual) {
        this.tamaño = tamaño;
        super.setMarca(marca);
        super.setEncendido(encendido);
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
    }
   
// get and set
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
       
    public int getVolumenMax(){
        return VOLUMENMAX;
    }
    
}
