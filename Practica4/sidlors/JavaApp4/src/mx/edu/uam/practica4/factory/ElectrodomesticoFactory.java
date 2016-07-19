/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.aparatos.Ventilador;
import mx.edu.uam.practica4.controles.ControlRemoto;
import mx.edu.uam.practica4.familia.Familiar;

/**
 *
 * @author jhernandezn
 */
public class ElectrodomesticoFactory extends AbstractFactory{
    
    
    @Override
    public ElectroDomestico getElectrodometico(String typeElectrodomestico) {
         ElectroDomestico electroDomestico=null;
        
        switch(typeElectrodomestico){
        
            case "Television":
                electroDomestico=new Television();
                break;
            case "Ventilador":
                electroDomestico=new Ventilador();
                break;
            case "BlueRay":
                electroDomestico=new BlueRay();
                break;
            default:
                
                System.err.println("Error al crear Electrodomestico. no soportado: "+ typeElectrodomestico);
                
            
        }
        return electroDomestico;
    }

    @Override
    public ControlRemoto getControl(String typeControl) {
        
        throw new UnsupportedOperationException("Operacion Invalida");
        
    }

    

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        throw new UnsupportedOperationException("Operacion Invalida");
    }
    
   
    
    
}
