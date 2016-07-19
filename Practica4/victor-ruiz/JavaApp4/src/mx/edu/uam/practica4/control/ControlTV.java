/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Television;

/**
 *
 * @author invited
 */
public class ControlTV extends ControlRemoto{
    
    public void encender(Television tv){
        
        super.encender(tv);
        System.out.println("televison encendida");
    }
    
    public void apagar(Television tv){
        super.apagar(tv);
        System.out.println("televison apaganda...");
        
    }
    /**
     * sube el volumen al electrodosmetico
     * @param aparato
     * @throws SistemaAparatosException
     */
    public void subirVolumen(Television aparato){ //throws SistemaApartosException{
        Television tv = (Television) aparato;
        subeVolumenTV(tv);
    }
    /**
     * metodo privado que implementa la funcionalidad de subir el volumen a TV
     * @param tv
     * @throws sistemaAparatosException
     */
    private void subeVolumenTV(Television tv){
        if (tv.getVolumenActual() < tv.getVolumenMaximo()) {
            
        } else {
            System.out.println("Este aparato ya tiene todo el volumen");
        }
    }
    
    public void bajaVolumen(Television tv){
        if (tv.getVolumenActual() > -1) {
            
        } else {
            System.out.println("Este aparato ya no tiene volumen");
        }
    }
    
    public void cambiarCanal(Television tv,int canal){
        
        tv.setCanalActual(canal);

    }
    
    public void cambiaSiguienteCanal(Television tv){
        
        tv.setCanalActual(tv.getCanalActual()+1);
    }
    
    public void cambiaCanalAnterior(Television tv){
        
        tv.setCanalActual(tv.getCanalActual()-1);
    }
}
