package mx.edu.uam.practica3.control;

import mx.edu.uam.practica3.electrodomestico.Xbox360;

public class ControlXbox {
    
    public void conectaInternet(Xbox360 xbox){
        if(xbox.isConexionInternet()){
            System.out.println("Ya estaba conectado a internet");
        }
        else{
            System.out.println("Conectando a internet");
            xbox.setConexionInternet(true);
        }
    }
    
    public void desconectarInternet(Xbox360 xbox){
        if(xbox.isConexionInternet()){
            System.out.println("Desconectando de internet");
            xbox.setConexionInternet(false);
        }
        else{
            System.out.println("Ya estaba desconectado de internet");
        }
    }
    
    public void onOf(Xbox360 xbox){
        if(xbox.isEncendido()){
            System.out.println("Se esta apagando la consola");
            xbox.setEncendido(false);
        }
        else{
            System.out.println("Se esta encendiendo la consola");
            xbox.setEncendido(true);
        }
    }
    
    public void conectaControl(Xbox360 xbox){
        
    }
    
}
