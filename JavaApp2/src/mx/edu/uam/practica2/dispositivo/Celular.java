package mx.edu.uam.practica2.dispositivo;


public class Celular {
    
    public String  modelo;
    String  marca;
    Double  precio;
    String  color;
    Long    numero;
    public Boolean estaLibre = true;
    
    // Constructor
    public Celular(){
        
    }
    
    // Sobre carga del constructor
    public Celular(String modelo, String marca, Double precio, String color, Long numero, Boolean estaLibre) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numero = numero;
        this.estaLibre = estaLibre;
    }
  
    public void marcarNumero(Long numero){
        System.out.println("Intentando marcar");
        if (estaLibre){
          System.out.println("Marcando a " + numero + " ...");
          estaLibre = false;
        } 
        else
            System.out.println("Numero ocupado!");
    }
    
    public void colgar(){
            estaLibre = true;
            System.out.println("La linea esta libre...");
    }
    
    public void recibirLlamada(){
        System.out.println("Llamada Entrante");
        if (estaLibre) {
            System.out.println("Ring... Ring... Ring...");
            System.out.println("En llamada...");
            estaLibre = false;
        }
        else
            System.out.println("Tono de Ocupado!");
    
    }
    
    public void coneccionInternet(String url){
        System.out.println("Intentando abrir el navegador");
        if (estaLibre) {
            System.out.println("Abriendo direccion " + url + " en el navegador" );
            estaLibre = false;
        }
        else
            System.out.println("Telefono ocupado!");
        
                
    }
    
}
