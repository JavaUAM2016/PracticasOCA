package mx.edu.uam.practica3.electrodomesticos;

public class Television {
    private String  marca;
    private int     pulgadas;
    private boolean powerStatus;
    private int     volumen;
    private int     maxVolumen = 100;
    private int     minVolumen = 0;
    private int     canal;
    private int     maxCanal = 10;
    private int     minCanal = 2;

    public Television(String marca, int pulgadas) {
        this.pulgadas = pulgadas;
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isEstado() {
        return powerStatus;
    }

    public void setEstado(boolean estado) {
        this.powerStatus = estado;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getMaxVolumen() {
        return maxVolumen;
    }

    public void setMaxVolumen(int maxVolumen) {
        this.maxVolumen = maxVolumen;
    }

     public int getMinVolumen() {
        return minVolumen;
    }

    public void setMinVolumen(int minVolumen) {
        this.minVolumen = minVolumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getMaxCanal() {
        return maxCanal;
    }

    public void setMaxCanal(int maxCanal) {
        this.maxCanal = maxCanal;
    }

    public int getMinCanal() {
        return minCanal;
    }

    public void setMinCanal(int minCanal) {
        this.minCanal = minCanal;
    }
}
