/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.aparatos;

/**
 *
 * @author invited
 */
public class BlueRay extends ElectroDomestico{
    
     
     private int volumenAtual;
     private int volMax=50;
     

    public BlueRay() {
    }


    public int getVolumenAtual() {
        return volumenAtual;
    }

    public void setVolumenAtual(int volumenAtual) {
        this.volumenAtual = volumenAtual;
    }

    public int getVolMax() {
        return volMax;
    }

    public void setVolMax(int volMax) {
        this.volMax = volMax;
    }
     
    
    
}
