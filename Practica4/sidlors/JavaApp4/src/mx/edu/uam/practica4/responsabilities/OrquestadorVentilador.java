/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.responsabilities;


import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.factory.AbstractFactory;
import mx.edu.uam.practica4.factory.SistemaFactory;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author sidlors
 */
public class OrquestadorVentilador implements IOrquestador{

    
     private IOrquestador siguiente;
     private AbstractFactory fabricaObjetos;
     
    public OrquestadorVentilador() {
        
        fabricaObjetos = SistemaFactory.getFactory("CONTROL");
    
    }
    
    
    @Override
    public void setSiguiente(IOrquestador eslabon) {
        siguiente=eslabon;
    }

    @Override
    public IOrquestador getSiguiente() {
       return siguiente;
    }

    @Override
    public void configuraArrayControles(Familiar f, ControlRemoto[] controlesArray) {
        
        if (controlesArray == null || f == null) {
            System.err.println("Error Array o persona nulo!!");
        } else {
            for (int i=0;i<controlesArray.length;i++) {
                if (controlesArray[i] instanceof ControlVentilador) {
                    ControlVentilador controlVentilador = (ControlVentilador) fabricaObjetos.getControl("ControlVentilador");
                    controlesArray[i]=controlVentilador;
                    System.out.println("control de ventilador asignado en: "+i);
                } 
            }
            System.out.println("Fin de la cadena..");
        }
        
    }
    
}
