package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Xbox360;

public class ControlXbox extends Control{
    
    public ControlXbox(String tamPilas, int numPilas){
        setTamPilas(tamPilas);
        setNumPilas(numPilas);
    }
    
    public void onOffInternet(Xbox360 xbox){
        if(xbox.isEncendido()){
             if(xbox.isConexionInternet()){
                System.out.println("Desconectando... x(");
                xbox.setConexionInternet(false);
            }
            else{
                System.out.println("Conectando a internet... :)");
                xbox.setConexionInternet(true);
            }
        } 
    }
    
    public void abrirCerrar(Xbox360 xbox){
        if(xbox.isEncendido()){
             if(xbox.isCharolaAbierta()){
                System.out.println("Cerrando charola");
                xbox.setCharolaAbierta(false);
            }
            else{
                System.out.println("Abriendo charola");
                xbox.setCharolaAbierta(true);
            }
        }  
    }
    
    public void conectaControl(Xbox360 xbox){
        if(xbox.isEncendido()){
            if(xbox.getControlesConectados()>=xbox.getControlesMax())
                System.out.println("Ya no se pueden conectarmás controles");
            else{
                System.out.println("Conectando control...");
                xbox.setControlesConectados(xbox.getControlesConectados()+1);
            }
        }
    }
    
    public void desconectaControl(Xbox360 xbox){
        if(xbox.isEncendido()){
            if(xbox.getControlesConectados()==0)
                System.out.println("Ya no hay controles conectados");
            else{
                System.out.println("Desconectando control...");
                xbox.setControlesConectados(xbox.getControlesConectados()-1);
            }
        }
    } 
}
