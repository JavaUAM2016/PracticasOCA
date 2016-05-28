package mx.edu.uam.practica3;

import java.util.Scanner;
import mx.edu.uam.practica3.electrodomesticos.Television;
import mx.edu.uam.practica3.controles.ControlTv;
/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Television tv = new Television();
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Has comprado una nueva televisión!, de que marca es? ");
        tv.setMarca(entrada.nextLine());
        
        System.out.println();
        System.out.print("La máquina está apagada en estos momentos... ");
        System.out.println(tv.getEncendido());
        System.out.print("Enciendo la máquina...");
        ControlTv.enciende(tv);
        System.out.println(tv.getEncendido());
        
        System.out.println();
        System.out.println("El volumen por defecto es " + tv.getVolumenActual());
        System.out.println("Al bajar de volumen tenemos un error:");
        ControlTv.bajaVolumen(tv);
        System.out.println("Ahora subimos 2 veces el volumen");
        ControlTv.subeVolumen(tv);
        ControlTv.subeVolumen(tv);
        System.out.println("El volumen actual es " + tv.getVolumenActual());
        
        System.out.println();
        System.out.println("El canal por defecto es: " + tv.getCanalActual());
        System.out.print("Al subir de canal ahora estamos en ");
        ControlTv.subeCanal(tv);
        System.out.println(tv.getCanalActual());
        System.out.println("Al bajar 2 veces de canal tenemos un error:");
        ControlTv.bajaCanal(tv);
        ControlTv.bajaCanal(tv);
        
        System.out.println();
        System.out.println("Ahora cambiaremos al canal 22...");
        ControlTv.cambiaCanal(tv, 22);
        System.out.println("Ahora estamos en el canal " + tv.getCanalActual());
        
        System.out.println();
        System.out.print("Al bajar de canal ahora estamos en ");
        ControlTv.bajaCanal(tv);
        System.out.println(tv.getCanalActual());
        
        System.out.println();
        System.out.println("Ahora apago mi tv...");
        ControlTv.apaga(tv);
        System.out.println("Mi TV está apagada... " + tv.getEncendido());
        System.out.println("Trato de apagar de nuevo la TV y obtengo un mensaje: ");
        ControlTv.apaga(tv);
        
    }
    
}
