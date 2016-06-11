//inversion de dependencias
package mx.edu.uam.practica4;
import mx.edu.uam.practica4.controles.ControlDvd;
import mx.edu.uam.practica4.controles.ControlTv;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.controles.ControlRadio;
import mx.edu.uam.practica4.aparatos.Radio;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.aparatos.Dvd;
import mx.edu.uam.practica4.aparatos.Electrodomestico;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;

public class AppMain {

    public static void main(String[] args) {
        Electrodomestico tele = new Television();
        Electrodomestico dvd= new Dvd();
        Electrodomestico radio= new Radio();
        Electrodomestico ventilador= new Ventilador();
        
        ControlRemoto controlTv= new ControlTv();
        ControlRemoto controlDvd= new ControlDvd();
        ControlRemoto controlRadio= new ControlRadio();
        ControlRemoto controlVentilador= new ControlVentilador();
       
        ControlRemoto[] controles= {controlTv,controlDvd,controlRadio,controlVentilador };
        
        Familiar papa= new Padre();
        papa.setControl(controles);
        controlTv=papa.getControl()[0];
        controlTv.prender(tele);
        ((ControlTv)controlTv).cambiaCanal((Television) tele, 25);

        
       
        /*Television tv=new Television();
        Ventilador venti= new Ventilador();
        Radio ra= new Radio();
        Dvd dvd= new Dvd();
        
        ControlTv controlTv= new ControlTv();
        ControlVentilador conVn= new ControlVentilador();
        ControlRadio controlRa= new ControlRadio();
        ControlDvd controlDvd= new ControlDvd();
        
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
        
        System.out.println(" ");
        System.out.println("Usando el dvd");
        controlDvd.prende(dvd);
        controlDvd.insertarDisco(dvd, "nemo");
        controlDvd.reproducir(dvd);
        controlDvd.adelantarReproduccion(dvd);
        controlDvd.reproducir(dvd);
        controlDvd.expulsarBandeja(dvd);
        controlDvd.atrasarReproduccion(dvd);
        controlDvd.insertarDisco(dvd, "Concierto Adele");
        controlDvd.reproducir(dvd);*/
        
    }
    
}
