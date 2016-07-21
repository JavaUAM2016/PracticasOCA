/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica4.factory;

import mx.edu.beavercheeks.practica4.controls.Remote;
import mx.edu.beavercheeks.practica4.devices.Device;
import mx.edu.beavercheeks.practica4.familia.Familiar;

/**
 * Código que implementa la clase abstracta fábrica que servirá para definir los
 * métodos abstractos para obtener los tipos de objetos que se fabricarán.0
 * @author sozir
 * @date 20-07-2016
 */
public abstract class AbstractFactory 
{
    public abstract Remote getRemote(String remoteType);
    public abstract Device getDevice(String deviceType);
    public abstract Familiar getFamiliar(String familiarType);
}
