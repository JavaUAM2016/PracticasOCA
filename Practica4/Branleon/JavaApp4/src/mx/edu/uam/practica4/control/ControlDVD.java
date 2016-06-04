/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import java.util.Scanner;
import mx.edu.uam.practica4.electroDomestico.DVD;

/**
 *
 * @author invited
 */
public class ControlDVD extends Control {
    
    public boolean encender(DVD a) {

        boolean enc = a.getEncendido();
        if (enc == false) {

            System.out.println("Encendiendo...");

            a.setEncendido(true);

        } else {
            System.out.println("La DVD esta encendida");

        }
        return enc;
    }

    public void apagado(DVD b) {
        boolean enc = b.getEncendido();

        if (enc == true) {
            b.setEncendido(false);
            System.out.println("Apagando...");

        } else {
            System.out.println("La DVD esta apagada");
        }

    }


    public void nextCap(DVD e) {
        int canAct = e.getCapActual();

        if (e.getEncendido() == true) {
            if (canAct > 0) {

                e.setCapAct(canAct + 1);

            }
        } else {
            System.out.println("DVD Apagada");
        }
        System.out.println("Capitulo--->" + e.getCapActual());
    }

    public void antCap(DVD f) {

        int canAct = f.getCapActual();
        boolean enc = f.getEncendido();
        if (enc == true) {
            if (canAct > 0) {
                f.setCapAct(canAct - 1);

            } else {
                System.out.println("***Capitulo invalido***");
            }
        } else {
            System.out.println("DVD Apagada");

        }
        System.out.println("Capitulo--->" + f.getCapActual());
    }

    public void cambiaCap(DVD g) {

        Scanner sc = new Scanner(System.in);

        if (g.getEncendido() == true) {
            System.out.println("Escribe el capitulo");
            int c = sc.nextInt();
            int canAct = g.getCapActual();

            if (c > 0) {

                g.setCapAct(c);
                canAct = c;

            } else {

                System.out.println("***Capitulo invalido***");

            }
        } else {
            System.out.println("DVD Apagada");

        }
        System.out.println("Capitulo--->" + g.getCapActual());
    }
    
}
