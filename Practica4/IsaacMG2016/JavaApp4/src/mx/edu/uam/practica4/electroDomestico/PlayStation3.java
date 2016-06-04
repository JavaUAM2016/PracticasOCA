package mx.edu.uam.practica4.electroDomestico;

/**
 *
 * @author invited
 */
public class PlayStation3 {
    
    private String marca;
    private int discoDuro;
    private boolean encendido;
    private boolean wifi;
    private int jugadores;
    private int videoJuegosInstall;
    
    private int capacidadDiscoDuroMax;
    private int noJugadoresMax;
    private int videoJuegoActual;// no va 

    public PlayStation3(String marca, int discoDuro, boolean encendido, boolean wifi, int jugadores, int videoJuegosInstall, int capacidadDiscoDuroMax, int noJugadoresMax, int videoJuegoActual) {
        this.marca = marca;
        this.discoDuro = discoDuro;
        this.encendido = encendido;
        this.wifi = wifi;
        this.jugadores = jugadores;
        this.videoJuegosInstall = videoJuegosInstall;
        this.capacidadDiscoDuroMax = capacidadDiscoDuroMax;
        this.noJugadoresMax = noJugadoresMax;
        this.videoJuegoActual = videoJuegoActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getVideoJuegosInstall() {
        return videoJuegosInstall;
    }

    public void setVideoJuegosInstall(int videoJuegosInstall) {
        this.videoJuegosInstall = videoJuegosInstall;
    }

    public int getCapacidadDiscoDuroMax() {
        return capacidadDiscoDuroMax;
    }

    public void setCapacidadDiscoDuroMax(int capacidadDiscoDuroMax) {
        this.capacidadDiscoDuroMax = capacidadDiscoDuroMax;
    }

    public int getNoJugadoresMax() {
        return noJugadoresMax;
    }

    public void setNoJugadoresMax(int noJugadoresMax) {
        this.noJugadoresMax = noJugadoresMax;
    }

    public int getVideoJuegoActual() {
        return videoJuegoActual;
    }

    public void setVideoJuegoActual(int videoJuegoActual) {
        this.videoJuegoActual = videoJuegoActual;
    }

}//fin class
