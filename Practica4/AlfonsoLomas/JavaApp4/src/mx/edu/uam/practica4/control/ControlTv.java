package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Television;

/**
 *
 * @author AlfonsoLomas
 */
public class ControlTv extends ControlRemoto {

    public void powerTv(Television tv) {
        if (tv.isEncendido()) {
            tv.setEncendido(false);
            System.out.println("El televisor se esta apagando!!!");
        } else {
            tv.setEncendido(true);
            System.out.println("El televisor se acaba de encender");
            System.out.println("Volumen: " + tv.getVolumenActual());
            System.out.println("Canal: " + tv.getCanalActual());

        }
    }

    public void subeVolumen(Television tv) {
        if (tv.isEncendido()) {
            if (tv.getVolumenActual() < tv.getVolumenMaximo()) {
                tv.setVolumenActual(tv.getVolumenActual() + 1);
                System.out.println("Volumen: " + tv.getVolumenActual());
            } else {
                System.out.println("El volumen està al màximo!!!");
                System.out.println("Volumen: " + tv.getVolumenActual());
            }
        } else {
            System.out.println("La tv està apagada");
        }
    }

    public void bajaVolumen(Television tv) {
        if (tv.isEncendido()) {
            if (tv.getVolumenActual() <= 0) {
                tv.setVolumenActual(0);
                System.out.println("El volumen està al mìnimo");
                System.out.println("Volumen: " + tv.getVolumenActual());
            } else {
                tv.setVolumenActual(tv.getVolumenActual() - 1);
                System.out.println("Volumen: " + tv.getVolumenActual());
            }
        } else {
            System.out.println("La tv està apagada");
        }
    }

    public void subeCanal(Television tv) {
        if (tv.isEncendido()) {
            if (tv.getCanalActual() < tv.getCanalMaximo()) {
                tv.setCanalActual(tv.getCanalActual() + 1);
                System.out.println("Canal: " + tv.getCanalActual());
            } else {
                tv.setCanalActual(1);
                System.out.println("Canal: " + tv.getCanalActual());
            }
        } else {
            System.out.println("La tv està apagada");
        }
    }

    public void bajaCanal(Television tv) {
        if (tv.isEncendido()) {
            if (tv.getCanalActual() <= 1) {
                tv.setCanalActual(tv.getCanalMaximo());
                System.out.println("Canal: " + tv.getCanalActual());
            } else {
                tv.setCanalActual(tv.getCanalActual() - 1);
                System.out.println("Canal: " + tv.getCanalActual());
            }
        } else {
            System.out.println("La tv està apagada");
        }
    }

    public void cambiaCanal(Television tv, int canal) {
        if (tv.isEncendido()) {
            tv.setCanalActual(canal);
            System.out.println("Canal: " + tv.getCanalActual());
        } else {
            System.out.println("La tv està apagada");
        }
    }

}
