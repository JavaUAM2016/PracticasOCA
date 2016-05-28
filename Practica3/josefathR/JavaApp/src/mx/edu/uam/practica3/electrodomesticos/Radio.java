package mx.edu.uam.practica3.electrodomesticos;

public class Radio {

    private String marca;
    private boolean powerStatus;
    private String[] modo; // "CD","USB","AM","FM","AUX","BLUETOOTH"
    private int volumen;
    private String estado; // reproduciendo, sintonizando, conectando, leyendo, etc.
    private int maxVolumen = 100;
    private int minVolumen = 0;
    private int estacion;
    private int maxEstacionAM = 10;
    private int maxEstacionFM = 10;
    private int minEstacionAM = 2;
    private int minEstacionFM = 2;

    public Radio(String marca,String[] modo) {
        this.marca = marca;
        this.modo = new String[modo.length];
        
        for (int i = 0; i < modo.length; i++) {
            this.modo[i] = modo[i];
        }
    }
    
}
