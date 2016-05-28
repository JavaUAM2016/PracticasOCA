/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electroDomesticos.BlueRay;

/**
 *
 * @author invited
 */
public class ControlBlueRay {
    
    public void enciendeBlueRay(BlueRay blueray){
        if(blueray.isEncendido()){
            System.out.println("El blue-ray ya se encuentra encedido");
        }else{
            blueray.setEncendido(true);
            System.out.println("Se cambia el estado a ON");
        }
    }
    
    public void apagaBlueRay(BlueRay blueray){
        if(blueray.isEncendido()){
            blueray.setEncendido(false);
            System.out.println("Se cambia el estado a OFF");
        }else{
            System.out.println("No se puede apagar el blue-ray pues se encuentra apagada");
        }
    }
        
    public void tareaActual(BlueRay blueray){
            System.out.println("Tarea Actual :" + blueray.getTarea());
    }
    
    public void cambiaTarea(BlueRay blueray, String tarea){
        blueray.setTarea(tarea);
        System.out.println("La tarea se cambio a: "+ tarea);
    }
    
    public void conectarseWIFI(BlueRay blueray){
        if(blueray.isEncendido()){
            if (blueray.isConetadoWIFI()) {
                System.out.println("El blue ray ya se encuentra conectado a WIFI");
            }else{
                blueray.setConetadoWIFI(true);
                System.out.println("El blue ray se conectó al WIFI");
            }
        }else{
            System.out.println("El blue ray se encuentra apagado... Encienda");
        }
    }
    
}
