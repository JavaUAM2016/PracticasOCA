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
public class Proyector extends ElectroDomestico{
   
    private int zoomActual;
    private int zoomMaximo;
    private int brilloActual;
    private int brilloMaximo;
    private int resolucion;

   
    public int getZoomActual() {
        return zoomActual;
    }

    public void setZoomActual(int zoomActual) {
        this.zoomActual = zoomActual;
    }

    public int getZoomMaximo() {
        return zoomMaximo;
    }

    public void setZoomMaximo(int zoomMaximo) {
        this.zoomMaximo = zoomMaximo;
    }

    public int getBrilloActual() {
        return brilloActual;
    }

    public void setBrilloActual(int brilloActual) {
        this.brilloActual = brilloActual;
    }

    public int getBrilloMaximo() {
        return brilloMaximo;
    }

    public void setBrilloMaximo(int brilloMaximo) {
        this.brilloMaximo = brilloMaximo;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    
    
    
}
