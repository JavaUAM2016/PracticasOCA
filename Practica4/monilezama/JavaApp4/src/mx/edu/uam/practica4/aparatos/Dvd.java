package mx.edu.uam.practica4.aparatos;

/**
 *
 * @author monica
 */
public class Dvd extends Electrodomestico{
    private String marca;
    private String video;
    private boolean encendido=false;
    private boolean reproduciendo=false;
    private int capituloActual;
    private boolean bandejaAbierta=false;
    private boolean discoInsertado=false; //tiene disco adentro?

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public boolean isReproduciendo() {
        return reproduciendo;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setReproduciendo(boolean reproduciendo) {
        this.reproduciendo = reproduciendo;
    }

    public void setCapituloActual(int capituloActual) {
        this.capituloActual = capituloActual;
    }

    public int getCapituloActual() {
        return capituloActual;
    }

    public boolean isBandejaAbierta() {
        return bandejaAbierta;
    }

    public void setBandejaAbierta(boolean bandejaAbierta) {
        this.bandejaAbierta = bandejaAbierta;
    }

    public boolean isDiscoInsertado() {
        return discoInsertado;
    }

    public void setDiscoInsertado(boolean discoInsertado) {
        this.discoInsertado = discoInsertado;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    
    
    
    
    
}
