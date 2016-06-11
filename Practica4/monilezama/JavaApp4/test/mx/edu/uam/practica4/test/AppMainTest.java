/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;
//programacion orientada a aspectos (auditar)hacer que ciertos metodos se ejecuten antes o despues de cierto metodo
import mx.edu.uam.practica4.aparatos.Dvd;
import mx.edu.uam.practica4.aparatos.Electrodomestico;
import mx.edu.uam.practica4.aparatos.Radio;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.controles.ControlDvd;
import mx.edu.uam.practica4.controles.ControlRadio;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTv;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Padre;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author invited
 */
public class AppMainTest {
    
    private Television tv;
    private ControlRemoto controlTV;
    private Electrodomestico dvd;
    private ControlRemoto controlDvd;
    private ControlRemoto[] controles;
    private Familiar papa;
    
    public AppMainTest() {
    }
    
    

    //solo debe de haber un metodo before
    @BeforeClass
    public static void setUpClass() {
        System.out.println("before");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        tv = new Television();
        controlTV = new ControlTv();
        dvd = new Dvd();
        controlDvd = new ControlDvd();
        papa = new Padre();
        controles=new ControlRemoto[2];
        controles[0]=controlTV;
        controles[1]= controlDvd ;



        papa.setControl(controles);
        controlTV = papa.getControl()[0];
        controlTV.prender(tv);
        ((ControlTv) controlTV).cambiaCanal(tv, 25);
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }
    
    @Test
    public void testApp() {
        System.out.println("Esto es una prueba unitaria");
        assertSame(25, tv.getCanalActual());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        System.out.println("Esto es una prueba unitaria No 2");
    }
}
