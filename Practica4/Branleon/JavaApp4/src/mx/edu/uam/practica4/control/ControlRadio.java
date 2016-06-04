package mx.edu.uam.practica4.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.electroDomestico.DVD;
import mx.edu.uam.practica4.electroDomestico.Radio;

/**
 *
 * @author invited
 */
public class ControlRadio extends Control {
     public boolean encender(Radio a) {

        boolean enc = a.getEncendido();
        if (enc == false) {

            System.out.println("Encendiendo...");

            a.setEncendido(true);

        } else {
            System.out.println("La DVD esta encendida");

        }
        return enc;
    }

    public void apagado(Radio b) {
        boolean enc = b.getEncendido();

        if (enc == true) {
            b.setEncendido(false);
            System.out.println("Apagando...");

        } else {
            System.out.println("La DVD esta apagada");
        }

    }


    public void sigEstacion(Radio e) {
        int canAct = e.getEstacionActual();

        if (e.getEncendido() == true) {
            if (canAct > 0) {

                e.setEstacionAct(canAct + 1);

            }
        } else {
            System.out.println("DVD Apagada");
        }
        System.out.println("Capitulo--->" + e.getEstacionActual());
    }

    public void antEstacion(Radio f) {

        int canAct = f.getEstacionActual();
        boolean enc = f.getEncendido();
        if (enc == true) {
            if (canAct > 0) {
                f.setEstacionAct(canAct - 1);

            } else {
                System.out.println("***Capitulo invalido***");
            }
        } else {
            System.out.println("DVD Apagada");

        }
        System.out.println("Capitulo--->" + f.getEstacionActual());
    }

    
}
