
package mx.edu.uam.practica3;
import mx.edu.uam.practica3.controles.*;
import mx.edu.uam.practica3.aparatos.*;

public class AppMain {

  
    
  public static void main(String[] args) {
        Television tv=new Television();
        Ventilador venti= new Ventilador();
        Radio ra= new Radio();
        ControlTv controlTv= new ControlTv();
        ControlVentilador conVn= new ControlVentilador();
        ControlRadio controlRa= new ControlRadio();
        
       System.out.println("Usando la Tv");
        controlTv.prender(tv);
        controlTv.cambiaCanal(tv, 400);
        controlTv.prender(tv);
        controlTv.prender(tv);
        controlTv.subeVol(tv);
        controlTv.subeCanal(tv);
        controlTv.prender(tv);
        
        System.out.println(" ");
        System.out.println("Usando el ventilador");
        conVn.prende(venti);
        conVn.girar(venti);
        conVn.subeVel(venti);
        conVn.prende(venti);
        conVn.girar(venti);
        conVn.prende(venti);
        conVn.bajaVel(venti);
        
         System.out.println(" ");
        System.out.println("Usando el radio");
        controlRa.prende(ra);
        controlRa.cambiarEstacion(ra,91.3);
        controlRa.bajarEstacion(ra);
        controlRa.prende(ra);
        controlRa.subirEstacion(ra);
    }
    
}
