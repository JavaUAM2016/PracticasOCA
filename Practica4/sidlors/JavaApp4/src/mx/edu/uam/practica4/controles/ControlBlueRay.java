package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.aparatos.BlueRay;
import mx.edu.uam.practica4.aparatos.ElectroDomestico;
import mx.edu.uam.practica4.exceptions.SistemaAparatosException;


/**
 *
 * @author jhernandezn
 */
public class ControlBlueRay extends ControlRemoto {
    
    /**
     * Enciende BlueRay
     * @param blueRay 
     */
     public void encender(BlueRay blueRay) {
        super.encender(blueRay);
        System.out.println("BlueRay encendido");
    }

     /**
      * Apaga BlueRay
      * @param blueRay 
      */
    public void apagar(BlueRay blueRay) {
        super.apagar(blueRay);
        System.out.println("BlueRay apagado");
    }

    /**
     * Sube Volumen de BlueRay
     * @param aparato
     * @throws SistemaAparatosException 
     */
    public void subirVolumen(ElectroDomestico aparato) throws SistemaAparatosException {
        if (aparato instanceof BlueRay) {
            BlueRay blueRay = (BlueRay) aparato;
            subeVolumenBlueRay(blueRay);
        } else {
            throw new SistemaAparatosException("Este aparato no soporta 'subirVolumen'");
        }

    }

    /**
     * metodo privado que sube volumen
     * @param blueRay
     * @throws SistemaAparatosException 
     */
    private void subeVolumenBlueRay(BlueRay blueRay) throws SistemaAparatosException {
        if (blueRay.getVolumenActual() < blueRay.getVolumenMaximo()) {

        } else {
            throw new SistemaAparatosException("Este aparato ya tiene 'Volumen maximo'");
        }
    }
    
    /**
     * Cambia al capitulo siguiente en el Blueray
     * @param blueRay 
     */
     public void cambiarCapituloSiguiente(BlueRay blueRay){
        blueRay.setCapituloActual(blueRay.getCapituloActual()+1);
    }

     /**
      * Cambia al capitulo anterior en el Blueray
      * @param blueRay 
      */
    public void cambiarCapituloAnterior(BlueRay blueRay){
        blueRay.setCapituloActual(blueRay.getCapituloActual()+1);
    }
    
    /**
     * Cambia Capitulo en el Blueray dado el capitulo
     * @param blueRay
     * @param capitulo 
     */
    public void cambiarCapitulo(BlueRay blueRay, int capitulo){
        blueRay.setCapituloActual(capitulo);
    }
    
    
    
}
