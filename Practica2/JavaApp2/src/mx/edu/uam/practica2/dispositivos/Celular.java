package mx.edu.uam.practica2.dispositivos;

/**
 *
 * @author invited
 */
public class Celular {
    
    public String modelo;
    String marca;
    double precio;
    String color;
    long numero;
    boolean estaLibre = true;

    // constructor
    public Celular() {
    }

    // Sobrecarga del constructor
    public Celular(String modelo, String marca, double precio, String color, long numero, boolean estaLibre) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numero = numero;
        this.estaLibre = estaLibre;
    }
    
    public void marcaNumero(long numero){
        if(estaLibre){
            System.out.println("Marcando a... " + numero);
            estaLibre = false;
        }else
            System.out.println("Alerta: Linea Ocupada");
    }
    
    public void colgar(){
        estaLibre = true;
        System.out.println("Linea Libre...");
    }
    
    public void recibirLlamada(){
        if (estaLibre) {
            System.out.println("Ring...Ring...Ring...");
            System.out.println("Conversando");
            estaLibre = false;
        } else {
            System.out.println("Beeep... Beeep... ");
            System.out.println("Linea Ocupada... deje su mensaje");
        }
    }
    
    public void conectarseInternet(String url){
        if(estaLibre){
            System.out.println("Chrome://"+url);
        }else
            System.out.println("Linea Ocupada...No puede conectarse a Internet");
    }
    
}
