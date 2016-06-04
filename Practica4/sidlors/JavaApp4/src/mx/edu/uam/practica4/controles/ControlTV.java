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
     * metodo privado que implementa la funcionalidad de subir volumen a TV
     * @param tv
     * @throws SistemaAparatosException 
     */
    private void subeVolumenTV(Television tv) throws SistemaAparatosException {
        if (tv.getVolumenActual() < tv.getVolumenMaximo()) {

        } else {
            throw new SistemaAparatosException("Este aparato ya tiene 'Volumen maximo'");
        }
    }
    
    /**
     * Cambia Siguiente canal en el televisor
     * @param tv 
     */
    public void cambiarCanalSiguiente(Television tv){
        tv.setCanalActual(tv.getCanalActual()+1);
    }

    /**
     *  Cambia al canal Anterior en el televisor
     * @param tv 
     */
    public void cambiarCanalAnterior(Television tv){
        tv.setCanalActual(tv.getCanalActual()+1);
    }
    
    /**
     *  Cambia canal dado por parametro 'canal' en el televisor
     * @param tv
     * @param canal 
     */
    public void cambiarCanal(Television tv, int canal){
        tv.setCanalActual(canal);
    }
}
