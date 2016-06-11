
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Ventilador;

/**
 *
 * @author Isaac MG
 */
public class ControlVentilador {
    
    
    public boolean estaEncendido(Ventilador v){
        
        if(v.isEncendido())
            return true;
        else
            return false;
    }
    
    public void enciendeVentilador(Ventilador v){
        
        if(!estaEncendido(v)){
            System.out.println("Ventilador encendido\n");
            v.setEncendido(true);
        }else{
            System.out.println("Ventilador Encendido, tecla no valida\n");
        }
    }
    
    public void apagaVentilador(Ventilador v){
        if(estaEncendido(v)){
            System.out.println("Apagando Ventilador !!");
            v.setEncendido(false);   
        }else
            System.out.println("Ventilador apagado, tecla no valida\n");
    }
    
    public void subirVelocidad(Ventilador v){
        if(v.getVelocidadActual() > 0 && v.getVelocidadActual() < v.getVelMaxima())
            v.setVelocidadActual(v.getVelMaxima()+1);
        else
            System.out.println("Cambio de velocidad invalido...\n");
    }
    
    public void bajarVelocidad(Ventilador v){
        if(v.getVelocidadActual() > 0 && v.getVelocidadActual() <= v.getVelMaxima())
            v.setVelocidadActual(v.getVelocidadActual()-1);
        else
            System.out.println("Cambio de velocidad Invalido...\n");
    }
    
}//fin class

