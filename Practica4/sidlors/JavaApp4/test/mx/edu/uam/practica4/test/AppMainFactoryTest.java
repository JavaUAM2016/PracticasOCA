/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.factory.AbstractFactory;
import mx.edu.uam.practica4.factory.SistemaFactory;
import mx.edu.uam.practica4.familia.Hija;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author sidlors
 */
public class AppMainFactoryTest {

    private static AbstractFactory fabricaObjetos;
    private ControlTV controlTV;
    private ControlVentilador controlVentilador;
    private ControlBlueRay controlBlueRay;
    private Television tv;
    private BlueRay blueRay;
    private Ventilador ventilador;
    private Padre padre;
    private Madre madre;
    private Hijo hijo;
    private Hija hija;

    @Before
    public void setUp() {
        fabricaObjetos = SistemaFactory.getFactory("CONTROL");
        controlTV = (ControlTV) fabricaObjetos.getControl("ControlTV");
        controlVentilador = (ControlVentilador) fabricaObjetos.getControl("ControlVentilador");
        controlBlueRay = (ControlBlueRay) fabricaObjetos.getControl("ControlBlueRay");

        fabricaObjetos = SistemaFactory.getFactory("ELECTRODOMESTICO");

        tv = (Television) fabricaObjetos.getElectrodometico("Television");
        blueRay = (BlueRay) fabricaObjetos.getElectrodometico("BlueRay");
        ventilador = (Ventilador) fabricaObjetos.getElectrodometico("Ventilador");

        fabricaObjetos = SistemaFactory.getFactory("FAMILIAR");

        padre = (Padre) fabricaObjetos.getFamiliar("Padre");
        madre = (Madre) fabricaObjetos.getFamiliar("Madre");
        hijo = (Hijo) fabricaObjetos.getFamiliar("Hijo");
        hija = (Hija) fabricaObjetos.getFamiliar("Hija");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        
        //hint: Cambia el orden de los controles asignados al array ;)
        ControlRemoto[] controlesPadre={controlVentilador,controlTV,controlBlueRay,controlBlueRay};
        padre.setControlesRemotos(controlesPadre);
        
        for (ControlRemoto controlRemoto : controlesPadre) {
            if (controlRemoto instanceof ControlBlueRay) {
                ControlBlueRay controlBlueRay = (ControlBlueRay) controlRemoto;
                controlBlueRay.cambiarCapitulo(blueRay, 12);
                assertEquals(12, blueRay.getCapituloActual());
                System.out.println("Canal del bluray actual: " +blueRay.getCapituloActual());
            }else if(controlRemoto instanceof ControlVentilador){
                ControlVentilador controlVentilador = (ControlVentilador) controlRemoto;
                controlVentilador.apagar(ventilador);
            }else{
                ControlTV controlTV = (ControlTV) controlRemoto;
                controlTV.apagar(tv);
            }
        }

    }
}
