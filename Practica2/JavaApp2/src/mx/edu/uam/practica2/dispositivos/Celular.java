package mx.edu.uam.practica2.dispositivos;

/**
 *
 * @author sidlors
 */
 public class Celular{
    
    public String modelo;
    String marca;
    public double precio;
    String color;
    long numero;
    boolean estaLibre=true;

      //constructor
    public Celular() {
        
    }

    
    //Sobrecarga del constructor
    public Celular(String modelo, String marca, double precio, String color, long numero, boolean estaLibre) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numero = numero;
        this.estaLibre = estaLibre;
    }
    
  
     
     
    //public visible para todos
    //    (package frendly) visible solo para el mismo paquete
    //protected Visible para si mismo y sus hereditarios
    //private Visible solo para si mismo
    
    public void marcaNumero(long numero){
        if(estaLibre){
          System.out.println("Marcando a... " + numero);
          estaLibre=false;
        }else
            System.out.println("Alerta: Mi Linea esta Ocupada!!");  
    }
    
    public void colgar(){
         estaLibre=true;
         System.out.println("Linea Libre..");
    }
    
    public void recibirLlamada(){
        
        if (estaLibre) {
            System.out.println("Ring...Ring...Ring...");
            System.out.println("Conversando...");
            estaLibre=false;
        } else {
            System.out.println("Beeep....  Beeep....");
            System.out.println("Linea ocupada.. deje su mensaje");
        }
    }
    
    public void conetarseInternet(String url){
        if (estaLibre) {
            System.out.println("Chrome://"+url);
        } else {
            
            System.out.println("Linea ocupada.. no se puede usar internet");
        }
        
    }
    
}
