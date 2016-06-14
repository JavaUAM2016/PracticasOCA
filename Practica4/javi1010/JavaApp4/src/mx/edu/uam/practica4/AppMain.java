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
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;

/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
        */
        
       Electrodomestico tele = new Television(50, 2, 10, 30);
       tele.setMarca("Sony");
       ControlRemoto controlTV = new ControlTelevision();
       
       Electrodomestico blueRay = new BlueRay(1, "Normal");
       blueRay.setMarca("Samsung");
       ControlRemoto controlBlueRay = new ControlBlueRay();
       
       Electrodomestico ventilador = new Ventilador("blanco", 1, 4);
       ventilador.setMarca("Kobblenz");
       ControlRemoto controlVentilador = new ControlVentilador();
       
       ControlRemoto [] controles = {controlTV, controlBlueRay,controlVentilador};
       Familiar papa = new Padre();
       Familiar madre = new Madre();
       Familiar hijo = new Hijo();
      
       System.out.println("**********************Televisiòn***********************");
       System.out.println(tele);
       papa.setControles(controles);
       controlTV = papa.getControles()[0];
       controlTV.enciende(tele);
       ((ControlTelevision)controlTV).cambiaCanal((Television)tele, 5);
       
       System.out.println("**********************BlueRay***********************");
       System.out.println(blueRay);
       
       madre.setControles(controles);
       controlBlueRay = madre.getControles()[1];
       controlBlueRay.enciende(blueRay);
       controlBlueRay.enciende(blueRay);
       ((ControlBlueRay)controlBlueRay).cambiaFormatoPantalla((BlueRay)blueRay, "expandido");
        
    }
    
}
