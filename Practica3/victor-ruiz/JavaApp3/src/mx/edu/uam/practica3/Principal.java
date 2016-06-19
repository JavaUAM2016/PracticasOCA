/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3;

import mx.edu.uam.practica3.control.ControlProyector;
import mx.edu.uam.practica3.control.ControlRadio;
import mx.edu.uam.practica3.control.ControlTV;
import mx.edu.uam.practica3.electrodomestico.Proyector;
import mx.edu.uam.practica3.electrodomestico.Radio;
import mx.edu.uam.practica3.electrodomestico.Television;

/**
 *
 * @author invited
 */
public class Principal {
    
    public static void main(String[] args){
        
        Television tv = new Television();
        ControlTV controltv = new ControlTV();
        
        tv.setCanalActual(5);
        tv.setTamanio(40);
        tv.setMarca("SONY");
        tv.setVolumenMaximo(10);
        tv.setVolumenActual(6);
        
        controltv.apaga(tv);
        controltv.enciende(tv);
        controltv.subeVolumen(tv);
        controltv.cambiaSiguienteCanal(tv);
        controltv.apaga(tv);
        
        Radio radio = new Radio();
        ControlRadio controlRadio = new ControlRadio();
        
        
        radio.setEstacionActual(100);
        radio.setMarca("SONY");
        radio.setVolumenMaximo(30);
        radio.setVolumenActual(10);
        
        controlRadio.enciende(radio);
        controlRadio.cambiaEstacion(radio, 101);
        controlRadio.apaga(radio);
        
        
        
        Proyector proyector = new Proyector();
        ControlProyector controlP = new ControlProyector();
        
        proyector.setBrilloMaximo(10);
        proyector.setMarca("Samsung");
        proyector.setBrilloActual(5);
        proyector.setZoomMaximo(10);
        proyector.setZoomActual(7);
        
        controlP.enciende(proyector);
        controlP.bajarZoom(proyector);
        controlP.subirBrillo(proyector);
        controlP.apaga(proyector);
    
    }
}
