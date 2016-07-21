/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4;
import mx.edu.beavercheeks.practica4.controls.*;
import mx.edu.beavercheeks.practica4.devices.*;
import mx.edu.beavercheeks.practica4.exceptions.SystemDevicesExceptions;
import mx.edu.beavercheeks.practica4.familia.*;


/**
 *
 * @author sozir
 */
public class JavaApp4 {

    /**
     * @param args the command line arguments
     * @throws mx.edu.beavercheeks.practica4.exceptions.SystemDevicesExceptions
     */
    public static void main(String[] args) throws SystemDevicesExceptions {
        // TODO code application logic here
        
       Device tv = new Television();
       Remote cTV = new TvRemote();
       
       Device st = new Stereo();
       Remote cST = new StereoRemote();
       
       Device fan = new Fan();
       Remote cFAN = new FanRemote();
       
       Device ac = new AirConditioner();
       Remote cAC = new AcRemote();
       
       Remote[] controles = {cTV, cST, cFAN, cAC};
       
       Familiar padre = new Padre();
       padre.setControlRemoto(controles);
       
       //Probando TV
       cTV=padre.getControlRemoto()[0];
       cTV.enciendeAparato(tv);
       ((TvRemote)cTV).cambiaCanalMas((Television)tv);
       ((TvRemote)cTV).subeVolumen((Television)tv);
       ((TvRemote)cTV).cambiaCanalMenos((Television)tv);
       ((TvRemote)cTV).bajaVolumen((Television)tv);
       ((TvRemote)cTV).cambiaCanal((Television)tv, 13);
       ((TvRemote)cTV).apagaAparato((Television)tv);
       
       //Probando Stereo
       cST=padre.getControlRemoto()[1];
       cST.enciendeAparato(st);
       ((StereoRemote)cST).cambiaEstacionManualMas((Stereo)st);
       ((StereoRemote)cST).subeVolumen((Stereo)st);
       ((StereoRemote)cST).cambiaEstacionManualMas((Stereo)st);
       ((StereoRemote)cST).cambiaEstacionManualMenos((Stereo)st);
       ((StereoRemote)cST).subeVolumen((Stereo)st);
       ((StereoRemote)cST).bajaVolumen((Stereo)st);
       cST.apagaAparato(st);
       
       //Probando Ventilador
       cFAN = padre.getControlRemoto()[2];
       ((FanRemote)cFAN).enciendeAparato(fan, (Fan)fan);
       ((FanRemote)cFAN).aumentaVelocidad((Fan)fan);
       ((FanRemote)cFAN).aumentaVelocidad((Fan)fan);
       ((FanRemote)cFAN).giraVentiladorIzquierda((Fan)fan);
       ((FanRemote)cFAN).giraVentiladorDerecha((Fan)fan);
       ((FanRemote)cFAN).programaApagado((Fan)fan, 7);
       ((FanRemote)cFAN).disminuyeVelocidad((Fan)fan);
       ((FanRemote)cFAN).disminuyeVelocidad((Fan)fan);
       ((FanRemote)cFAN).apagaAparato(fan, (Fan)fan);
       
       //Probando Aire Acondicionado
       cAC = padre.getControlRemoto()[3];
       ((AcRemote)cAC).enciendeAparato(ac, (AirConditioner)ac);
       ((AcRemote)cAC).aumentaVelocidad((AirConditioner)ac);
       ((AcRemote)cAC).modoCaliente((AirConditioner)ac);
       ((AcRemote)cAC).aumentaVelocidad((AirConditioner)ac);
       ((AcRemote)cAC).modoFrio((AirConditioner)ac);
       ((AcRemote)cAC).disminuyeVelocidad((AirConditioner)ac);
       ((AcRemote)cAC).apagaAparato(ac, (AirConditioner)ac);
     }
    
}
