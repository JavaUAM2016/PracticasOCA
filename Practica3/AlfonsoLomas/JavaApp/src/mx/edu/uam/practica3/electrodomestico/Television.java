
package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author AlfonsoLomas
 */
public class Television {
    public String marca;
    public int tamanio;
    public boolean encendido;
    public int canalActual;
    public int canalMaximo;
    public int volumenActual;
    public int volumenMaximo;

    public Television(String marca, int tamanio, boolean encendido, int canalActual, int canalMaximo, int volumenActual, int volumenMaximo) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.canalMaximo = canalMaximo;
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
