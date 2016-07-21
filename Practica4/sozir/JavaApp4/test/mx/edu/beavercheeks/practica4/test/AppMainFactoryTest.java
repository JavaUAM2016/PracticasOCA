/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.test;
import mx.edu.beavercheeks.practica4.factory.*;
import mx.edu.beavercheeks.practica4.controls.*;
import mx.edu.beavercheeks.practica4.devices.*;
import mx.edu.beavercheeks.practica4.exceptions.SystemDevicesExceptions;
import mx.edu.beavercheeks.practica4.familia.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase cuya finalidad es realizar la prueba de funcionalidad de la fábrica
 * abstracta de objetos AbstractFactory.
 * @author rcamarena
 */
public class AppMainFactoryTest 
{
    /*Declaraciones*/
    //Fábrica
    private static AbstractFactory fabricaObj;
    //Controles
    private TvRemote cTV;
    private FanRemote cV;
    private StereoRemote cS;
    private AcRemote cAC;
    //Electrodomésticos
    private Television tv;
    private Fan vent;
    private Stereo stereo;
    private AirConditioner ac;
    //Familiares
    private Padre padre;
    private Madre madre;
    private Hijo hijo;
    
    @Before
    public void setUp() 
    {
        /*Inicializaciones*/
        //Fabricando primer objeto de tipo control
        fabricaObj = SystemFactory.getFactory("CONTROL");
        //Asignando tipos de objeto por fábrica
        cTV = (TvRemote) fabricaObj.getRemote("Control TV");
        cV = (FanRemote) fabricaObj.getRemote("Control Ventilador");
        cS = (StereoRemote) fabricaObj.getRemote("Control Stereo");
        cAC = (AcRemote) fabricaObj.getRemote("Control AC");
        
        //Fabricando segundo objeto de tipo Device
        fabricaObj = SystemFactory.getFactory("ELECTRODOMESTICO");
        //Asignando tipos de objeto por fábrica
        tv = (Television) fabricaObj.getDevice("Television");
        vent = (Fan) fabricaObj.getDevice("Ventilador");
        stereo = (Stereo) fabricaObj.getDevice("Stereo");
        ac = (AirConditioner) fabricaObj.getDevice("Aire Acondicionado");
        
        //Fabricando tercer objeto de tipo Familiar
        fabricaObj = SystemFactory.getFactory("FAMILIAR");
        //Asingando tpos de objeto por fabrica
        padre = (Padre) fabricaObj.getFamiliar("Padre");
        madre = (Madre) fabricaObj.getFamiliar("Madre");
        hijo = (Hijo) fabricaObj.getFamiliar("Hijo");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void hello() throws SystemDevicesExceptions 
     {
         /*Proceso de Prueba*/
         // Creando arreglo de controles. 
         Remote[] controles = {cTV, cV, cS, cAC };
         // Asignando arreglo de controles a un familiar
         hijo.setControlRemoto(controles);
         // Validando instancias
         for (Remote control : controles)
         {
             if (control instanceof TvRemote)
             {
                 TvRemote cTV = (TvRemote) control;
                 cTV.enciendeAparato(tv);
                 cTV.cambiaCanal(tv, 13);
                 assertEquals(13,tv.getCanalActual());
                 System.out.println("Canal actual de la televisión: " + tv.getCanalActual());
             }
             else if (control instanceof FanRemote)
             {
               FanRemote cV = (FanRemote) control;
               cV.apagaAparato(vent);
             }
             else if (control instanceof StereoRemote)
             {
                StereoRemote cS = (StereoRemote) control;
                cS.enciendeAparato(stereo);
             }
             else
             {
                 AcRemote cAC = (AcRemote) control;
                 cAC.aumentaVelocidad(ac);
             }
         }
     }
}
