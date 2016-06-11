package mx.edu.main.practica4.test;

import mx.edu.uam.practica4.electrodomestico.*;
import mx.edu.uam.practica4.control.*;
import mx.edu.uam.practica4.familia.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppMainTest {
    
    private Television tv;
    private Control controlTV;
    private Electrodomestico xbox360;
    private Control controlBlue;
    private Control[] controles;
    private Familiar papa;

    public AppMainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tv = new Television();
        controlTV = new ControlTelevision();
        xbox360 = new Xbox360();
        controlBlue = new ControlXbox();
        papa = new Padre();
        controles=new Control[2];
        controles[0]=controlTV;
        controles[1]= controlBlue ;



        papa.setControles(controles);
        controlTV = papa.getControles()[0];
        controlTV.onOff(tv);
        ((ControlTelevision) controlTV).cambiaCanal(tv, 25);
    }

    @Test
    public void testApp() {

        assertSame(25, tv.getCanalActual());
    }

}
