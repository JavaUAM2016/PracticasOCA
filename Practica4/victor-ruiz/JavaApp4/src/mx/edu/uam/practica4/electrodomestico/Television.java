/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.electrodomestico;

/**
 *
 * @author invited
 */
public class Television extends ElectroDomestico{
    
    private int volumenMaximo;
    private int volumenActual;
    private int canalActual;

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }



    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolumenMaximo() {
        return volumenMaximo;
    }

    public void setVolumenMaximo(int volumenMaximo) {
        this.volumenMaximo = volumenMaximo;
    }


    
    
}
