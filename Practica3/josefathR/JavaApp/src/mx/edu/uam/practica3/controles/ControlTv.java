package mx.edu.uam.practica3.controles;

import mx.edu.uam.practica3.electrodomesticos.Television;

public class ControlTv {

    public void Power(Television tv) {
        if (tv.isEstado()) {
            tv.setEstado(false);
            System.out.println("--[ Tv Apagada ]--");
        } else {
            tv.setEstado(true);
            System.out.println("--[ Tv Encendida ]--");
        }
    }

    public void SubeVolumen(Television tv) {
        if (tv.isEstado()) {
            if (tv.getVolumen() < tv.getMaxVolumen()) {
                tv.setVolumen(tv.getVolumen() + 2);
            }

            System.out.println("Volumen: " + tv.getVolumen());
        } else {
            System.out.println("Error: Tv Apagada");
        }
    }

    public void BajaVolumen(Television tv) {
        if (tv.isEstado()) {
            if (tv.getVolumen() > tv.getMinVolumen()) {
                tv.setVolumen(tv.getVolumen() - 2);
            }

            System.out.println("Volumen: " + tv.getVolumen());
        } else {
            System.out.println("Error: Tv Apagada");
        }
    }

    public void SubeCanal(Television tv) {
        if (tv.isEstado()) {

            if (tv.getCanal() == tv.getMaxCanal()) {
                tv.setCanal(tv.getMinCanal());
            } else {
                tv.setCanal(tv.getCanal() + 1);
            }

            System.out.println("Canal - " + tv.getCanal());
        } else {
            System.out.println("Error: Tv Apagada");
        }
    }

    public void BajaCanal(Television tv) {
        if (tv.isEstado()) {
            if (tv.getCanal() == tv.getMinCanal()) {
                tv.setCanal(tv.getMaxCanal());
            } else {
                tv.setCanal(tv.getCanal() - 1);
            }

            System.out.println("Canal - " + tv.getCanal());
        } else {
            System.out.println("Error: Tv Apagada");
        }
    }

    public void CambiaCanal(Television tv, int canal) {
        if (tv.isEstado()) {

            if (canal >= tv.getMinCanal() && canal <= tv.getMaxCanal()) {
                tv.setCanal(canal);
            }
            else
                System.out.println("Canal no disponible");
            
            System.out.println("Canal - " + tv.getCanal());
        } else {
            System.out.println("Error: Tv Apagada");
        }
    }
}
