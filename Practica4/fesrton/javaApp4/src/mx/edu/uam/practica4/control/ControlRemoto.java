/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.aparatos.ElectroDomestico;

/**
 *
 * @author invited
 */
public abstract class ControlRemoto {

    
private int numBat;
private String tipoBat;

    public int getNumBat() {
        return numBat;
    }

    public void setNumBat(int numBat) {
        this.numBat = numBat;
    }

    public String getTipoBat() {
        return tipoBat;
    }

    public void setTipoBat(String tipoBat) {
        this.tipoBat = tipoBat;
    }
    

    
    public void encender(ElectroDomestico aparato) {
        
        if(aparato.isEstaEncendido()== true){
            
            
            
            
            System.out.println("el aparato ya estaba encendo");
            
            System.out.println("");
        }else{
              
              System.out.println("aparato encendido");
              aparato.setEstaEncendido(true);
              
        
            
        }
       

    }

    public void apagar(ElectroDomestico aparato) {
        
        aparato.setEstaEncendido(false);
        System.out.println("Aoarato apagado");

    }

}
