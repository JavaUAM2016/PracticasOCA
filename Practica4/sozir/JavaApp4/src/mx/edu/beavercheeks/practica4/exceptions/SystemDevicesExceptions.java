/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.exceptions;

/**
 * Clase que se usa para definir las exepciones personalizadas
 * y cómo sobreescribirán las excepciones por defecto.
 * @author sozir
 * @date 19-07-2016
 */
public class SystemDevicesExceptions extends Exception
{
    public SystemDevicesExceptions()
    {
        super();
    }
    
    public SystemDevicesExceptions(String message)
    {
        super(message);
    }
    
    public SystemDevicesExceptions(String message, Throwable cause)
    {
        super(message, cause);
    }
    
    public SystemDevicesExceptions(Throwable cause)
    {
        super(cause);
    }
}
