package mx.edu.uam.practica3.electrodomestico;

public class Xbox360 {
    
    private String marca;
    private String color;
    private boolean encendido;
    private boolean conexionInternet;
    private int capacidad;
    private int controles;

    public Xbox360(String marca, String color, boolean encendido, boolean conexionInternet, int capacidad, int controles) {
        this.marca = marca;
        this.color = color;
        this.encendido = encendido;
        this.conexionInternet = conexionInternet;
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isConexionInternet() {
        return conexionInternet;
    }

    public void setConexionInternet(boolean conexionInternet) {
        this.conexionInternet = conexionInternet;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }
    

}
