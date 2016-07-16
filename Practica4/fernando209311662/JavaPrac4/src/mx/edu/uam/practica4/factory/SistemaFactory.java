package mx.edu.uam.practica4.factory;

public abstract class SistemaFactory {
    public static AbstractFactory getFactory(String choice){
        AbstractFactory factoryType = null;
        
        switch(choice){
            case "CONTROL":
                factoryType=new ControlFactory();
                break;
            case "ELECTRODOMESTICO":
                factoryType=new ElectrodomesticoFactory();
                break;
            case "FAMILIAR":
                factoryType=new FamiliarFactory();
                break;
            default:
                System.out.println("Error no hay factory para el Componente solicitado");
        }
        return factoryType;
    }
}
