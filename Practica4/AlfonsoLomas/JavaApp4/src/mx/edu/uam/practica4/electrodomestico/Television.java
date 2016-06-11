package mx.edu.uam.practica4.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class Television extends Electrodomestico {
    
    private int tamanio;
    private int canalActual;
    private int canalMaximo;
    private int volumenActual;
    private int volumenMaximo;

    public Television(String nombre, int tamanio, boolean encendido, int canalActual, int canalMaximo, int volumenActual, int volumenMaximo) {
        setMarca(nombre);
        setEncendido(encendido);
        setControlRemoto(null);
        this.tamanio = tamanio;
        this.canalActual = canalActual;
        this.canalMaximo = canalMaximo;
        this.volumenActual = volumenActual;
        this.volumenMaximo = volumenMaximo;
    }

    public Television() {
        
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public int getCanalMaximo() {
        return canalMaximo;
    }

    public void setCanalMaximo(int canalMaximo) {
        this.canalMaximo = canalMaximo;
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
