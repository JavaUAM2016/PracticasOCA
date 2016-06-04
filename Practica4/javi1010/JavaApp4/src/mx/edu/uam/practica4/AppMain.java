/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTelevision;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.electroDomesticos.BlueRay;
import mx.edu.uam.practica4.electroDomesticos.Electrodomestico;
import mx.edu.uam.practica4.electroDomesticos.Television;
import mx.edu.uam.practica4.electroDomesticos.Ventilador;

/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***************************BlueRay************************");
        
        Electrodomestico br = new BlueRay(1,"Normal");
        ControlRemoto controlBlueRay = new ControlBlueRay();
        
        ControlRemoto[] controles=new ControlRemoto[10];
        
        controlBlueRay.setNumBaterias(5);
        controlBlueRay.setTipoPila("AAA");
        System.out.println(controlBlueRay);
        
        br.setMarca("Sony");
        br.setEstaEncendido(false);
        
        
        System.out.println(br);
        controlBlueRay.enciende(br);
        ((ControlBlueRay)controlBlueRay).subirCapitulo((BlueRay)br);
        ((ControlBlueRay)controlBlueRay).bajarCapitulo((BlueRay)br);
        ((ControlBlueRay)controlBlueRay).bajarCapitulo((BlueRay)br);
        ((ControlBlueRay)controlBlueRay).cambiaFormatoPantalla((BlueRay)br, "Ampliado");
   
        controlBlueRay.apaga(br);
        System.out.println(br);
        controlBlueRay.apaga(br);
        
        /*
        System.out.println("***************************Television************************");
        Television tv1 = new Television("Samsung", 50, false, 1, 10, 50);
        System.out.println(tv1.toString());
        ControlTelevision controlTv = new ControlTelevision();
        controlTv.enciende(tv1);
        controlTv.subeVol(tv1);
        controlTv.cambiaCanal(tv1, 40);
        controlTv.enciende(tv1);
        controlTv.subeCanal(tv1);
        controlTv.apaga(tv1);
        
        System.out.println();
        System.out.println("***************************Ventilador************************");
        Ventilador ventilador = new Ventilador("Patito", false, "Blanco", 0, 3);
        System.out.println(ventilador);
        ControlVentilador controlV = new ControlVentilador();
        controlV.enciende(ventilador);
        controlV.subeVel(ventilador);
        controlV.subeVel(ventilador);
        controlV.subeVel(ventilador);
        controlV.subeVel(ventilador);
        controlV.bajaVel(ventilador);
        controlV.apaga(ventilador);
        
        */
    }
    
}
