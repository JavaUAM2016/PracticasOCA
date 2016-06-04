/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import java.util.Scanner;
import mx.edu.uam.practica4.electroDomestico.Television;

/**
 *
 * @author invited
 */
public class ControlTelevision extends Control {

    public boolean encender(Television a) {

        boolean enc = a.getEncendido();
        if (enc == false) {

            System.out.println("Encendiendo...");

            a.setEncendido(true);

        } else {
            System.out.println("La Television esta encendida");

        }
        return enc;
    }

    public void apagado(Television b) {
        boolean enc = b.getEncendido();

        if (enc == true) {
            b.setEncendido(false);
            System.out.println("Apagando...");

        } else {
            System.out.println("La Television esta apagada");
        }

    }

    public void subirVol(Television c) {
        
        if (c.getEncendido() == true) {
            if (c.getVolActual() < c.getVolMax()) {

                c.setVolAct(c.getVolActual() + 1);

            }
            if (c.getVolActual() == c.getVolMax()) {
                System.out.println("Maximo Volumen");
            }
        } else {
            System.out.println("Televion Apagada");
        }

        System.out.println("Volumen--->" + c.getVolActual());
    }

    public void bajarVol(Television d) {

        int volAct = d.getVolActual();

        if (d.getEncendido() == true) {

            if (volAct > 0) {
                d.setVolAct(volAct - 1);

            } else {
                System.out.println("Minimo Volumen");
            }
        } else {
            System.out.println("Televion Apagada");

        }
        System.out.println("Volumen--->" + d.getVolActual());
    }

    public void subirCan(Television e) {
        int canAct = e.getCanActual();

        if (e.getEncendido() == true) {
            if (canAct > 0) {

                e.setCanAct(canAct + 1);

            }
        } else {
            System.out.println("Televion Apagada");
        }
        System.out.println("Canal--->" + e.getCanActual());
    }

    public void bajarCan(Television f) {

        int canAct = f.getCanActual();
        boolean enc = f.getEncendido();
        if (enc == true) {
            if (canAct > 0) {
                f.setCanAct(canAct - 1);

            } else {
                System.out.println("***Canal invalido***");
            }
        } else {
            System.out.println("Televion Apagada");

        }
        System.out.println("Canal--->" + f.getCanActual());
    }

    public void cambiaCanal(Television g) {

        Scanner sc = new Scanner(System.in);

        if (g.getEncendido() == true) {
            System.out.println("Escribe el canal");
            int c = sc.nextInt();
            int canAct = g.getCanActual();

            if (c > 0) {

                g.setCanAct(c);
                canAct = c;

            } else {

                System.out.println("***Canal invalido***");

            }
        } else {
            System.out.println("Televion Apagada");

        }
        System.out.println("Canal--->" + g.getCanActual());
    }
}
