package mx.edu.uam.practica4.factory;

import mx.edu.uam.practica4.control.Control;
import mx.edu.uam.practica4.electrodomestico.Electrodomestico;
import mx.edu.uam.practica4.familia.Familiar;

public abstract class AbstractFactory {
    public abstract Control getControl(String typeControl);
    public abstract Electrodomestico getElectrodomestico(String typeElectrodomestico);
    public abstract Familiar getFamiliar(String typeFamiliar);
}
