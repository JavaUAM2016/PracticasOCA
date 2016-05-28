/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica3.control;

import java.util.Scanner;
import mx.edu.uam.practica3.electroDomestico.Television;

/**
 *
 * @author invited
 */
public class ControlTelevision {

    public boolean encender(Television a) {

        boolean enc = a.getEncendido();
        if (enc == false) {

            System.out.println("Encendiendo...");
            enc = true;
            
        } else {
            System.out.println("La Television esta encendida");
            

        }
        return enc;
    }

    public void apagado(Television b) {
        boolean enc = b.getEncendido();

        if (enc == true) {
            enc = false;
            System.out.println("Apagando...");

        } else {
            System.out.println("La Television esta apagada");
        }

    }

    public void subirVol(Television c) {
        int volAct = c.getVolActual();
        int volMax = c.getVolMax();

        if (c.getEncendido() == true) {
            if (volAct < volMax) {

                volAct = volAct + 1;

                System.out.println("Volumen--->" + volAct);

            }
            if (volAct == volMax) {
                System.out.println("Maximo Volumen");
            }
        } else {
            System.out.println("Televion Apagada");
        }

    }

    public void bajarVol(Television d) {

        int volAct = d.getVolActual();

        if (d.getEncendido() == true) {

            if (volAct > 0) {
                volAct = volAct - 1;
                System.out.println("Volumen--->" + volAct);

            } else {
                System.out.println("Minimo Volumen");
            }
        } else {
            System.out.println("Televion Apagada");

        }
    }

    public void subirCan(Television e) {
        int canAct = e.getCanActual();

        if (e.getEncendido() == true) {
            if (canAct > 0) {

                canAct = canAct + 1;

                System.out.println("Canal--->" + canAct);
            }
        } else {
            System.out.println("Televion Apagada");
        }

    }

    public void bajarCan(Television f) {

        int canAct = f.getCanActual();
        boolean enc =f.getEncendido();
        if ( enc == true) {
            if (canAct > 0) {
                canAct = canAct - 1;
                System.out.println("Canal--->" + canAct);

            } else {
                System.out.println("***Canal invalido***");
            }
        } else {
            System.out.println("Televion Apagada");

        }
    }

    public void cambiaCanal(Television g) {

        Scanner sc = new Scanner(System.in);

        if (g.getEncendido() == true) {
            System.out.println("Escribe el canal");
            int c = sc.nextInt();
            int canAct = g.getCanActual();

            if (c > 0) {
                canAct = c;
                System.out.println("Canal--->" + canAct);

            } else {

                System.out.println("***Canal invalido***");

            }
        } else {
            System.out.println("Televion Apagada");

        }
    }
}
    

