package mx.edu.uam.practica4.electrodomestico;

public class Xbox360 extends Electrodomestico{
    
    private boolean conexionInternet;
    private int capacidad;
    private int controlesConectados;
    private int controlesMax;
    private boolean charolaAbierta;

    public Xbox360(String marca, String color, boolean encendido, boolean conexionInternet, int capacidad, int controlesConectados, int controlesMax, boolean charolaAbierta) {
        setMarca(marca);
        setColor(color);
        setEncendido(encendido);
        this.conexionInternet = conexionInternet;
        this.capacidad = capacidad;
        this.controlesConectados=controlesConectados;
        this.controlesMax=controlesMax;
        this.charolaAbierta=charolaAbierta;
    }
    
    public Xbox360(){
        
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

    public int getControlesConectados() {
        return controlesConectados;
    }

    public void setControlesConectados(int controlesConectados) {
        this.controlesConectados = controlesConectados;
    }

    public int getControlesMax() {
        return controlesMax;
    }

    public void setControlesMax(int controlesMax) {
        this.controlesMax = controlesMax;
    }

    public boolean isCharolaAbierta() {
        return charolaAbierta;
    }

    public void setCharolaAbierta(boolean charolaAbierta) {
        this.charolaAbierta = charolaAbierta;
    }
}
