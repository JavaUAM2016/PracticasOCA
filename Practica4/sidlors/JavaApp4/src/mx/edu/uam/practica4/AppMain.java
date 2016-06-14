/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.factory.AbstractFactory;
import mx.edu.uam.practica4.factory.ControlFactory;
import mx.edu.uam.practica4.factory.SistemaFactory;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Hija;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;

/**
 *
 * @author sidlors
 */
public class AppMain {
    
    public static void main(String[] args) {
        
        
        AbstractFactory  fabricaObjetos=SistemaFactory.getFactory("CONTROL");
        ControlTV ControlTV=(ControlTV)fabricaObjetos.getControl("ControlTV");
        ControlVentilador controlVentilador=(ControlVentilador)fabricaObjetos.getControl("ControlVentilador");
        ControlBlueRay controlBlueRay=(ControlBlueRay)fabricaObjetos.getControl("ControlBlueRay");
        
        fabricaObjetos=SistemaFactory.getFactory("ELECTRODOMESTICO");
        
        Television tv=(Television)fabricaObjetos.getElectrodometico("Television");
        BlueRay blueRay=(BlueRay)fabricaObjetos.getElectrodometico("BlueRay");
        Ventilador ventilador=(Ventilador)fabricaObjetos.getElectrodometico("Ventilador");
        
        fabricaObjetos=SistemaFactory.getFactory("FAMILIAR");
        
        Padre padre=(Padre)fabricaObjetos.getFamiliar("Padre");
        Madre madre=(Madre)fabricaObjetos.getFamiliar("Madre");
        Hijo hijo=(Hijo)fabricaObjetos.getFamiliar("Hijo");
        Hija hija=(Hija)fabricaObjetos.getFamiliar("Hija");
        
        // System.out.println(tv.getCanalActual());
         
         
    }
    
}
