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
public class Television extends ElectroDomestico{
    
    
     private  int tamaño;
     
     private int volumenAtual;
     private int volMax= 30;
     private int canalActual;

    public Television() {
        
        
    }

    public Television(int tamaño, int volumenAtual, int canalActual) {
        this.tamaño = tamaño;
        this.volumenAtual = volumenAtual;
        this.canalActual = canalActual;
    }
    
    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
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

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }
    
    
    
    
}
