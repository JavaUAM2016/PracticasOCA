package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.familia.Familiar;
import mx.edu.uam.practica4.familia.Hijo;
import mx.edu.uam.practica4.familia.Madre;
import mx.edu.uam.practica4.familia.Padre;

public class FamiliarFactory extends AbstractFactory{

    @Override
    public Control getControl(String typeControl) {
        return null;
    }

    @Override
    public Electrodomestico getElectrodomestico(String typeElectrodomestico) {
        return null;
    }

    @Override
    public Familiar getFamiliar(String typeFamiliar) {
        Familiar familiar = null;
        switch(typeFamiliar){
            case "Padre":
                familiar = new Padre();
                break;
            case "Madre":
                familiar = new Madre();
                break;
            case "Hijo":
                familiar = new Hijo();
                break;
            default:
                System.out.println("Error al crear familiar, no soportado" + typeFamiliar);
        }
        return familiar;
    }
    
}
