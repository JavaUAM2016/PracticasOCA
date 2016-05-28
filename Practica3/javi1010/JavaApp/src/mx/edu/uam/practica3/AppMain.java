/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3;

import mx.edu.uam.practica3.controles.ControlBlueRay;
import mx.edu.uam.practica3.controles.ControlTelevision;
import mx.edu.uam.practica3.controles.ControlVentilador;
import mx.edu.uam.practica3.electroDomesticos.BlueRay;
import mx.edu.uam.practica3.electroDomesticos.Television;
import mx.edu.uam.practica3.electroDomesticos.Ventilador;

/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        System.out.println();
        System.out.println("***************************BlueRay************************");
        BlueRay br = new BlueRay("Sony",false,1,"Ampliado");
        System.out.println(br);
        ControlBlueRay controlBlueRay = new ControlBlueRay();
        controlBlueRay.enciende(br);
        controlBlueRay.subirCapitulo(br);
        controlBlueRay.subirCapitulo(br);
        controlBlueRay.bajarCapitulo(br);
        controlBlueRay.cambiaFormatoPantalla(br, "Normal");
        controlBlueRay.apaga(br);
        controlBlueRay.apaga(br);
    }
    
}
