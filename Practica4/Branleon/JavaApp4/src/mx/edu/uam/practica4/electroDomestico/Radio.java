/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electroDomestico;

/**
 *
 * @author invited
 */
public class Radio extends Electrodomestico{
      
    private String marca;
    private boolean encendido = false;
    private int estacionActual;
    private boolean estadoPelicula;
   

    public Radio(String marca) {
        this.marca = marca;

    }

    public String getMarca() {
        return marca;
    }


    public boolean getEncendido() {
        return encendido;
    }

    public int getEstacionActual() {
        return estacionActual;
    }
    
    public boolean getEstadoPelicula(){
    return estadoPelicula;
    }
    
    

    public void setEncendido(boolean b) {
        encendido = b;
    }

    
    public void setEstacionAct(int c){
        
       estacionActual=c;
    
    }
     public void setEstadoPelicula(boolean a){
     estadoPelicula=a;
    }
    
}
