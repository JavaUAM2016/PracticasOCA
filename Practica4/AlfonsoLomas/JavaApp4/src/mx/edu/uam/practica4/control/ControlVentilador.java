package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Ventilador;

/**
 *
 * @author invited
 */
public class ControlVentilador extends ControlRemoto{

    public void powerVentilador(Ventilador ventilador) {
        if (ventilador.isEncendido()) {
            ventilador.setEncendido(false);
            System.out.println("El ventilador se esta apagando!!!");
        } else {
            ventilador.setEncendido(true);
            System.out.println("El ventilador se acaba de encender");
            System.out.println("Velocidad: " + ventilador.getVelocidadActual());
        }
    }

    public void subeVelocidad(Ventilador ventilador) {
        if (ventilador.isEncendido()) {
            if (ventilador.getVelocidadActual() < ventilador.getVelocidadMaxima()) {
                ventilador.setVelocidadActual(ventilador.getVelocidadActual() + 1);
                System.out.println("Velocidad: " + ventilador.getVelocidadActual());
            } else {
                System.out.println("La velocidad està al màximo!");
                System.out.println("Velocidad: " + +ventilador.getVelocidadActual());
            }
        } else {
            System.out.println("Ventilador apagado");
        }
    }
    
    public void bajaVelocidad(Ventilador ventilador){
        if(ventilador.isEncendido()){
            if(ventilador.getVelocidadActual() <= 0){
                ventilador.setVelocidadActual(0);
                System.out.println("La velocidad està al mìnimo!");
                System.out.println("Velocidad: " + +ventilador.getVelocidadActual());
            }else{
                ventilador.setVelocidadActual(ventilador.getVelocidadActual()-1);
                System.out.println("Velocidad: " + +ventilador.getVelocidadActual());
            }
        } else {
            System.out.println("Ventilador apagado");
        }
    }
    
    public void cambiaVelocidad(Ventilador ventilador, int velocidad){
        if(ventilador.isEncendido()){
            ventilador.setVelocidadActual(velocidad);
            System.out.println("Velocidad: " + +ventilador.getVelocidadActual());
        } else {
            System.out.println("Ventilador apagado");
        }
    }

}
