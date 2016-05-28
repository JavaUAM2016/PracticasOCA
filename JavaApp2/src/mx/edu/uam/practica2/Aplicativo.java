package mx.edu.uam.practica2;

import mx.edu.uam.practica2.dispositivo.Celular;

public class Aplicativo {

    public static void main(String[] args) {
        
        Celular Xperia   = new Celular();
        Celular Iphone   = new Celular("5s", "Iphone", 19000.0, "blanco", 5532019155L, true);
        
        pruebaTelefono(Iphone);
        pruebaTelefono(Xperia);
        
    }
    
    static void pruebaTelefono(Celular telefono){
        
        System.out.println("\n--------------------------------[ Procesos ]--------------------------------\n");
        System.out.println("Modelo : " + telefono.modelo);
        telefono.marcarNumero(5532019155L);
        telefono.colgar();
        telefono.recibirLlamada();
        telefono.marcarNumero(5532019155L);
        telefono.colgar();
        telefono.coneccionInternet("www.google.com");
        telefono.marcarNumero(5532019155L);
        telefono.colgar();
        telefono.marcarNumero(5532019155L);
        telefono.coneccionInternet("www.facebook.com");
        telefono.colgar();
    }
}
