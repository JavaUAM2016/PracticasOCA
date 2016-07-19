package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.familia.Familiar;

public class ControlFactory extends AbstractFactory{

    @Override
    public Control getControl(String typeControl) {
        Control controlRemoto = null;
        switch(typeControl){
            
        }
        return controlRemoto;
    }

    @Override
    public Electrodomestico getElectrodomestico(String typeElectrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
