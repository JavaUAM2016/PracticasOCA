package mx.edu.uam.practica4.exceptions;

/**
 *
 * @author jhernandezn
 */
public class SistemaAparatosException extends Exception {
    
    public SistemaAparatosException(){
     super();
    }

    public SistemaAparatosException(String message) {
        super(message);
    }

    public SistemaAparatosException(String message, Throwable cause) {
        super(message, cause);
    }

    public SistemaAparatosException(Throwable cause) {
        super(cause);
    }
    
    
}
