package mx.edu.uam.practica4.controles;
import mx.edu.uam.practica4.aparatos.Television;
import mx.edu.uam.practica4.exceptions.SistemaAparatosException;

/**
 *
 * @author jhernandezn
 */
public class ControlTV extends ControlRemoto {

    /**
     * Enciende Television
     * @param tv 
     */
    public void encender(Television tv) {
        super.encender(tv);
        System.out.println("Television Encendida");
    }

    /**
     * Apaga Television
     * @param tv 
     */
    public void apagar(Television tv) {
        super.apagar(tv);
        System.out.println("Television apagada");
    }

    /**
     * Sube volumen en al electrodomestico
     * @param aparato
     * @throws SistemaAparatosException 
     */
    public void subirVolumen(Television aparato) throws SistemaAparatosException  {
       
            Television tv = (Television) aparato;
            subeVolumenTV(tv);
      

    }

    
    /**
     * Metodo que sube Volumen de la Television @param tv
     * @param tv
     * @throws SistemaAparatosException 
     */
    private void subeVolumenTV(Television tv) throws SistemaAparatosException {
        if (tv.getVolumenActual() < tv.getVolumenMaximo()) {
            tv.setVolumenActual(tv.getVolumenActual()+1);
        } else {
            throw new SistemaAparatosException("Este aparato ya tiene 'Volumen maximo'");
        }
    }
    
    /**
     * Cambia Siguiente canal en el televisor
     * @param tv
     * @throws SistemaAparatosException 
     */
    public void cambiarCanalSiguiente(Television tv) throws SistemaAparatosException{
       
         if (tv.isEstaEncendido()) {
           tv.setCanalActual(tv.getCanalActual()+1);
        } else {
           throw new SistemaAparatosException("No se puede cambiar de canal la television esta apagada!");
        }
    }

    /**
     * Cambia al canal Anterior en el televisor
     * @param tv Objeto Television
     * @throws  SistemaAparatosException es un "custom exception" del proyecto
     */
    public void cambiarCanalAnterior(Television tv) throws SistemaAparatosException{
        
        if (tv.isEstaEncendido()) {
           tv.setCanalActual(tv.getCanalActual()-1);
        } else {
            throw new SistemaAparatosException("No se puede cambiar de canal la television esta apagada!");
        }
    }
    
    /**
     *  Cambia canal dado por parametro 'canal' en el televisor
     * @param tv
     * @param canal 
     */
    public void cambiarCanal(Television tv, int canal) throws SistemaAparatosException{
        
        if (tv.isEstaEncendido()) {
            tv.setCanalActual(canal);
        } else {
            throw new SistemaAparatosException("No se puede cambiar de canal la television esta apagadas");
        }
    }
}
