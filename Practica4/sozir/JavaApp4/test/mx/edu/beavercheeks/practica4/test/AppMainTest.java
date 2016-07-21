/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.test;

import mx.edu.beavercheeks.practica4.controls.Remote;
import mx.edu.beavercheeks.practica4.controls.StereoRemote;
import mx.edu.beavercheeks.practica4.controls.TvRemote;
import mx.edu.beavercheeks.practica4.devices.Device;
import mx.edu.beavercheeks.practica4.devices.Stereo;
import mx.edu.beavercheeks.practica4.devices.Television;
import mx.edu.beavercheeks.practica4.exceptions.SystemDevicesExceptions;
import mx.edu.beavercheeks.practica4.familia.Familiar;
import mx.edu.beavercheeks.practica4.familia.Padre;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcamarena
 */
public class AppMainTest 
{ 
    private Television tv;
    private Remote controlTV;
    private Device st;
    private Remote controlSt;
    private Remote[] controles;
    private Familiar padre;
    
    public AppMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        tv = new Television();
        controlTV = new TvRemote();
        st = new Stereo();
        controlSt = new StereoRemote();
        padre = new Padre();
        controles=new Remote[2];
        controles[0]=controlTV;
        controles[1]= controlSt ;
        
        padre.setControlRemoto(controles);
        controlTV = padre.getControlRemoto()[0];
        //controlTV.enciendeAparato(tv);
        controlTV.apagaAparato(tv);
        try
        {
            ((TvRemote) controlTV).cambiaCanal(tv, 25);
        }
        catch (SystemDevicesExceptions excepcion)
        {
            System.err.println("Error: " +excepcion.getMessage());
            excepcion.getStackTrace();
        }
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testApp() 
    {
        assertSame(25, tv.getCanalActual());
    }
}
