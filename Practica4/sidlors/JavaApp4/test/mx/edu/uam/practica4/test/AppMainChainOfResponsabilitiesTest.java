/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.test;

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
import mx.edu.uam.practica4.responsabilities.IOrquestador;
import mx.edu.uam.practica4.responsabilities.OrquestadorBlueRay;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sidlors
 */
public class AppMainChainOfResponsabilitiesTest {
    
    private IOrquestador orquestador;
    private AbstractFactory fabricaObjetos;
    private Padre padre;
    
    @Before
    public void setUp() {
        fabricaObjetos = SistemaFactory.getFactory("CONTROL");
        ControlTV controlTV = (ControlTV) fabricaObjetos.getControl("ControlTV");
        ControlVentilador controlVentilador = (ControlVentilador) fabricaObjetos.getControl("ControlVentilador");
        ControlBlueRay controlBlueRay = (ControlBlueRay) fabricaObjetos.getControl("ControlBlueRay");
        
        fabricaObjetos = SistemaFactory.getFactory("FAMILIAR");

        padre = (Padre) fabricaObjetos.getFamiliar("Padre");
        Madre madre = (Madre) fabricaObjetos.getFamiliar("Madre");
        Hijo hijo = (Hijo) fabricaObjetos.getFamiliar("Hijo");
        Hija hija = (Hija) fabricaObjetos.getFamiliar("Hija");
        ControlRemoto[] controles={controlBlueRay,controlTV,controlVentilador};
        orquestador=new OrquestadorBlueRay();
        orquestador.configuraArrayControles(padre,controles );
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAsignaciones() {
        
       
    }
}
