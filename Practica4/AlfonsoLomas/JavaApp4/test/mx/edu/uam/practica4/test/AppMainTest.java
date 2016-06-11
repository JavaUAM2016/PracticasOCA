package mx.edu.uam.practica4.test;

import mx.edu.uam.practica4.control.ControlRemoto;
import mx.edu.uam.practica4.control.ControlTv;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.electrodomestico.Television;
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
    private Electrodomestico blueRay;
    private ControlRemoto controlBlue;
    private ControlRemoto[] controles;
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
        controlTV = new ControlTv();
        //blueRay = new BlueRay();
        //controlBlue = new ControlBlueRay();
        papa = new Padre();
        controles=new ControlRemoto[2];
        controles[0]=controlTV;
        controles[1]= controlBlue ;



        papa.setControlRemoto(controles);
        controlTV = papa.getControlRemoto()[0];
        controlTV.encender(tv);
        ((ControlTv) controlTV).cambiaCanal(tv, 25);
    }

    @Test
    public void testApp() {

        assertSame(25, tv.getCanalActual());
    }

}