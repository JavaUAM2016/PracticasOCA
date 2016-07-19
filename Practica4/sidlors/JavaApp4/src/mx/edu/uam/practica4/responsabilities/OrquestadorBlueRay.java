/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.responsabilities;

import mx.edu.uam.practica4.controles.ControlBlueRay;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.controles.ControlTV;
import mx.edu.uam.practica4.controles.ControlVentilador;
import mx.edu.uam.practica4.factory.AbstractFactory;
import mx.edu.uam.practica4.factory.SistemaFactory;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author sidlors
 */
public class OrquestadorBlueRay implements IOrquestador {

    private IOrquestador siguiente;
    private AbstractFactory fabricaObjetos;

    public OrquestadorBlueRay() {
        fabricaObjetos = SistemaFactory.getFactory("CONTROL");

    }

    @Override
    public void setSiguiente(IOrquestador eslabon) {
        siguiente = eslabon;
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
                if (controlesArray[i] instanceof ControlBlueRay) {
                    ControlBlueRay controlBR = (ControlBlueRay) fabricaObjetos.getControl("ControlBlueRay");
                    controlesArray[i]=controlBR;
                    System.out.println("controlBlueRay asignado en: "+i);
                } 
            }
            setSiguiente(new OrquestadorTelevision());
            siguiente.configuraArrayControles(f, controlesArray);
        }

    }

}
