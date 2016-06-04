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
public class DVD extends Electrodomestico{
    
    private String marca;
    private boolean encendido = false;
    private int capActual;
    private boolean estadoPelicula;
   

    public DVD(String marca) {
        this.marca = marca;

    }

    public String getMarca() {
        return marca;
    }


    public boolean getEncendido() {
        return encendido;
    }

    public int getCapActual() {
        return capActual;
    }
    
    public boolean getEstadoPelicula(){
    return estadoPelicula;
    }
    
    

    public void setEncendido(boolean b) {
        encendido = b;
    }

    
    public void setCapAct(int c){
        
        capActual=c;
    
    }
     public void setEstadoPelicula(boolean a){
     estadoPelicula=a;
    }
    
}
