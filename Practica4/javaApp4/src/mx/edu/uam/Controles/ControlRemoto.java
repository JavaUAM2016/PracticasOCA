/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.edu.uam.Controles;


import mx.edu.uam.dispositivos.Electrodomestico;

public abstract class ControlRemoto {
     
    int numBaterias;
    String tipoBaterias;
    
    public void encender(Electrodomestico dispositivo){
        boolean estado= dispositivo.getEncendido();
        if(estado)
            System.err.println("Ya estoy prendida no me vuelvas a prender");
        else {
            dispositivo.setEncendido(true);
            System.out.println("Ya se predio la tele");            
        }
    }
    
    public void apagar(Electrodomestico dispositivo){
    boolean estado= dispositivo.getEncendido();
        if(estado == false)
            System.err.println("Ya estoy apagada no me vuelvas a apagar");
        else {
            dispositivo.setEncendido(false);
            System.out.println("Ya se apago la tele");
        }
    }
       
}
