package mx.edu.uam.practica4.electrodomestico;

public class Television extends Electrodomestico{
    private int tamaño;
    private int canalActual;
    private int volumenActual;
    private int volMaximo;
    private int canalMaximo;

    public Television(String marca, String color, boolean encendido, int tamaño, int canaActual, int volumenActual, int volMaximo, int canalMaximo) {
        setMarca(marca);
        setColor(color);
        setEncendido(encendido);
        this.tamaño = tamaño;
        this.canalActual = canaActual;
        this.volumenActual = volumenActual;
        this.volMaximo = volMaximo;
        this.canalMaximo=canalMaximo;
    }
    
    public Television(){
        
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamanño) {
        this.tamaño = tamanño;
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
