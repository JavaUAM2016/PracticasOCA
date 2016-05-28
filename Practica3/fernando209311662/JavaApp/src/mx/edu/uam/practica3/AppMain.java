package mx.edu.uam.practica3;

import mx.edu.uam.practica3.electrodomestico.Television;
import mx.edu.uam.practica3.control.ControlTelevision;

public class AppMain {

    public static void main(String[] args){
        //(marca, tamaño, encendido, canalActual, volActual, volMax, canalMax)
        Television LG=new Television("LG", 40, false, 39, 1, 100, 40);
        ControlTelevision controlTv=new ControlTelevision();
        System.out.println("Encender TV");
        controlTv.enciendeTv(LG);
        System.out.println("Encender TV");
        controlTv.enciendeTv(LG);
        System.out.println("Apagar TV");
        controlTv.apagaTv(LG);
        System.out.println("Subir canal");
        controlTv.subeCanal(LG);
        System.out.println("Subir canal");
        controlTv.subeCanal(LG);
        System.out.println("Bajar canal");
        controlTv.bajaCanal(LG);
        System.out.println("Bajar canal");
        controlTv.bajaCanal(LG);
        controlTv.subeVol(LG);
        System.out.println("Subir volumen");
        controlTv.subeVol(LG);
        System.out.println("Bajar volumen");
        controlTv.bajaVol(LG);
        System.out.println("Bajar volumen");
        controlTv.bajaVol(LG);
        System.out.println("Baja volumen");
        controlTv.bajaVol(LG);
        System.out.println("Baja volumen");
        controlTv.bajaVol(LG);
        System.out.println("Subir volumen");
        controlTv.subeVol(LG);
        System.out.println("Cambiar canal");
        controlTv.cambiaCanal(LG, 23);
        System.out.println("Cambiar canal");
        controlTv.cambiaCanal(LG, 55);
        
        
        
    }

    
}
