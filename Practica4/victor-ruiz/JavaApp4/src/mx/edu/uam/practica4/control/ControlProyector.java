/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Proyector;

/**
 *
 * @author invited
 */
public class ControlProyector extends ControlRemoto{
    
    
    public void encender(Proyector proyector){
        super.encender(proyector);
        System.out.println(" el proyecto se esta prendiendo...");
        
        
    }
    
    public void apagar(Proyector proyector){
        super.apagar(proyector);
        System.out.println(" el proyecto esta apagado...");
        
    }
    
    public void subirZoom(Proyector proyector){
        int zoomActual;
        
        zoomActual = proyector.getZoomActual();  
        zoomActual = zoomActual +1;
           
        System.out.println("la television subio de zoom a "+zoomActual);
    }
    
    public void bajarZoom(Proyector proyector){
        int zoomActual;
        
        zoomActual = proyector.getZoomActual();  
        zoomActual = zoomActual +1;
           
        System.out.println("la television subio de zoom a "+zoomActual);
    }
    
    public void subirBrillo(Proyector proyector){
        int brilloActual;
        int brilloMax;
        proyector = new Proyector();
        if (proyector.isEncendido()) {
            brilloMax = proyector.getBrilloMaximo();
            brilloActual = proyector.getBrilloActual();
            if (brilloActual < brilloMax) {
                brilloActual = brilloActual +1;
                proyector.setZoomActual(brilloActual);
            }
            
        }
        System.out.println("la television esta pagada");
    }
    
    public void bajarBrillo(Proyector proyector){
        int brilloActual;
        int brilloMax;
        proyector = new Proyector();
        if (proyector.isEncendido()) {
            brilloMax = proyector.getBrilloMaximo();
            brilloActual = proyector.getBrilloActual();
            if (brilloActual < brilloMax) {
                brilloActual = brilloActual-1;
                proyector.setZoomActual(brilloActual);
            }
            
        }
        System.out.println("la television esta pagada");
    }
    
}
