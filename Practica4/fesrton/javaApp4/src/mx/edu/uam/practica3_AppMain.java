/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Radio;
import mx.edu.uam.practica4.control.ControlTelevision;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.control.ControlBlueRay;
import mx.edu.uam.practica4.control.ControlRadio;
import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;
/**
 *
 * @author invited
 */
public class practica3_AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Television T1 = new Television();
          T1.setEstaEncendido(true);
          T1.setVolumenAtual(25);
          T1.setCanalActual(68);
          T1.setMarca("sony");
          System.out.println("La marca de tele es: "+ T1.getMarca());
          
          
          ElectroDomestico tele = new Television(35, 15, 58);
          ControlRemoto controlTV = new ControlTelevision();
          
          ElectroDomestico blueRay = new BlueRay();
          ControlRemoto controlBlue = new ControlBlueRay();
          
         ControlRemoto[] controles ={controlTV,controlBlue};
         
         Familiar papa = new Padre();
         
         papa.setControlesRemotos(controles);
         controlTV=papa.getControlesRemotos()[0];
         controlTV.apagar(tele);
         ((ControlTelevision)controlTV).cambiarCanal(T1, 25);
         System.out.println(T1.getCanalActual());
         
          
          
          
         
          
         
         
         
          
        
        ControlTelevision TV = new ControlTelevision();
        TV.setNumBat(2);
        TV.setTipoBat("AAA");
        System.out.println("El control usa pilas tipo "+ TV.getTipoBat()+" y "+TV.getNumBat()+" de baterias ");
        
        
        TV.encender(T1);
        TV.apagar(T1);
        TV.encender(T1);
        
        
        
     /**   
        
        
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        TV.subeVol(T1);
        
        TV.bajaVol(T1);
        TV.bajaVol(T1);
        TV.bajaVol(T1);
        
        System.out.println("");
        
        TV.subeCanal(T1);
        TV.subeCanal(T1);
        TV.subeCanal(T1);
        TV.bajaCanal(T1);
        TV.bajaCanal(T1);
        TV.bajaCanal(T1);
        
        System.out.println("");
        
        TV.cambiarCanal(T1, 23);
         System.out.println("Radio");
        R.encenderRaddio(R1);
        R.bajarVolumen(R1);
        R.bajarVolumen(R1);
        R.subirVolumen(R1);
        R.bajarEstacion(R1);
        R.bajarEstacion(R1);
        R.subirEstacion(R1);
        R.cambiarEstacion(R1, 56.8);
        R.bajarEstacion(R1);
        R.encenderRaddio(R1);
       
        */
        
       
      
    }
    
}
