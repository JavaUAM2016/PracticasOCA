/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.controles;

import mx.edu.uam.practica4.electroDomesticos.BlueRay;
import mx.edu.uam.practica4.electroDomesticos.Electrodomestico;


/**
 *
 * @author invited
 */
public class ControlBlueRay extends ControlRemoto{
    
    public void enciende(Electrodomestico br){
        if (br.isEstaEncendido())
            System.out.println("Encendiendo.... El blueray ya esta encendido, no es posible encenderlo nuevamente");
        else{
            br.setEstaEncendido(true);
            System.out.println("El blueray se encendera.. Ahora el blueray esta encendido");
        }
    }
    
    public void apaga(Electrodomestico br){
        if(br.isEstaEncendido()){
            br.setEstaEncendido(false);
            System.out.println("El blueray se apagara... blueray apagado");
        }
        else{
            System.out.println("Apagando...  El blueray ya esta apagado");
        }
        
    }
    
    public void cambiaFormatoPantalla(BlueRay br, String formato){
        
        br.setFormatoPantalla(formato);
        System.out.println("Formato de la pantalla cambiado a "+br.getFormatoPantalla());
        
    }
    
    public void subirCapitulo(BlueRay br){
        int capActual;
        
        capActual = br.getCapituloActual()+1;
        br.setCapituloActual(capActual);
        System.out.println("Subiste de capitulo... estas en el capitulo "+br.getCapituloActual());
    }
    
    public void bajarCapitulo(BlueRay br){
        int capActual;
        
        if(br.getCapituloActual()==1)
            System.out.println("Te encuentras en el primer capitulo, no hay capitulos anteriores");
        else{
            capActual = br.getCapituloActual()-1;
            br.setCapituloActual(capActual);
            System.out.println("Bajaste de capitulo... estas en el capitulo "+br.getCapituloActual());
        }
        
    }
    
    
    
}
