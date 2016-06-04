/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.controles;
import mx.edu.uam.practica4.aparatos.Electrodomestico;
public abstract class ControlRemoto {
    private int numBaterias;
    private String tipoBaterias;
    boolean encender;
    boolean apagar;
    
    public void encender(Electrodomestico aparato){}

    public void prender(Electrodomestico tele) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  


    
}
