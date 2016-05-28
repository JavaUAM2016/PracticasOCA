package mx.edu.uam.practica3.electrodomestico;

public class Television {
    private String marca;
    private int tamaño;
    private boolean encendido;
    private int canalActual;
    private int volumenActual;
    private int volMaximo;
    private int canalMaximo;

    public Television(String marca, int tamaño, boolean encendido, int canaActual, int volumenActual, int volMaximo, int canalMaximo) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.encendido = encendido;
        this.canalActual = canaActual;
        this.volumenActual = volumenActual;
        this.volMaximo = volMaximo;
        this.canalMaximo=canalMaximo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamanño) {
        this.tamaño = tamanño;
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

    public void setCanalActual(int canaActual) {
        this.canalActual = canaActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolMaximo() {
        return volMaximo;
    }

    public void setVolMaximo(int volMaximo) {
        this.volMaximo = volMaximo;
    }

    public int getCanalMaximo() {
        return canalMaximo;
    }

    public void setCanalMaximo(int canalMaximo) {
        this.canalMaximo = canalMaximo;
    }
    
}
