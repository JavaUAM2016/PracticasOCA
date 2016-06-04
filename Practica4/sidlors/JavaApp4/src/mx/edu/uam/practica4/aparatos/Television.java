package mx.edu.uam.practica4.aparatos;

/**
 *
 * @author jhernandezn
 */
public class Television extends ElectroDomestico{
    
    private int volumenMaximo;
    private int volumenActual;
    private int canalActual;

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
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
    
    

    
}
