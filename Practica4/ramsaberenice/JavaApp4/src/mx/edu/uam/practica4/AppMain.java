package mx.edu.uam.practica4;

import mx.edu.uam.practica4.controles.ControlEstereo;
import mx.edu.uam.practica4.electrodomestico.Estereo;
import mx.edu.uam.practica4.electrodomestico.Television;
/**
 *
 * @author invited
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.println("T E L E V I S O R \n");
//        Television tv = new Television("SONY", 54, true, 2, 25);
//        tv.isEncendido();
//        tv.getMarca();
//        tv.getPulgadas();
//        tv.getCanalActual();
//        tv.getVolumenActual();
//        
        System.out.println("\n E S T E R E O");
        Estereo estereo = new Estereo("SAMSUNG", false, (float) 955.3, 49);
//        estereo.isEncendido();
//        
//        estereo.getMarca();
//        estereo.getEstacionActual();
//        estereo.getVolumenActual();        
        ControlEstereo contEstereo = new ControlEstereo();
        contEstereo.enciendeEstereo(estereo);
        contEstereo.subeVol(estereo);
        contEstereo.bajaVol(estereo);
//        contEstereo.subeEstacion(estereo);
//        contEstereo.bajaEstacion(estereo);
    }    
}
//PARA PRACTICA 4
//Electrodomestico tele = new Television();
//ControlRemoto controlTV = new ControlTV();
//Electrodomestico blueRay = new BlueRay();
//ControlRemoto controlBlueRay = new BlueRay();
//ControlRemoto[] controles = (controlTV, controlBlueRay);
//Familiar papa = new Padre();
//papa.setControlesRemotos(controles);
//controlTV = papa.getControlesRemotos()[0];
//controlTV.apagar(television);
//((ControlTV)controlTV).cambiarCanalAnterior((Television)tele);