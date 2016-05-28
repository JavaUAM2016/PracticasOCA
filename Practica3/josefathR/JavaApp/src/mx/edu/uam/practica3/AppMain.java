package mx.edu.uam.practica3;

import mx.edu.uam.practica3.controles.*;
import mx.edu.uam.practica3.electrodomesticos.*;
/**
 *
 * @author invited
 */
public class AppMain {

    public static void main(String[] args) {
        Television Sony = new Television("Sony",24);
        ControlTv crlTv = new ControlTv();
        
        crlTv.Power(Sony);
        crlTv.SubeVolumen(Sony);
        crlTv.BajaVolumen(Sony);
        crlTv.SubeCanal(Sony);
        crlTv.BajaCanal(Sony);
        crlTv.CambiaCanal(Sony, 10);
        crlTv.SubeCanal(Sony);
        crlTv.CambiaCanal(Sony, 2);
        crlTv.BajaCanal(Sony);
        crlTv.Power(Sony);
        crlTv.SubeVolumen(Sony);
        crlTv.BajaVolumen(Sony);
        crlTv.SubeCanal(Sony);
        crlTv.BajaCanal(Sony);
        crlTv.CambiaCanal(Sony, 5);
    }
    
}
