/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica3;
import mx.edu.beavercheeks.practica4.controls.*;
import mx.edu.beavercheeks.practica4.devices.*;
import mx.edu.beavercheeks.practica4.familia.*;


/**
 *
 * @author sozir
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Device tv = new Television();
       Remote cTV = new TvRemote();
       
       Device st = new Stereo();
       Remote cST = new StereoRemote();
       
       Remote[] controles = {cTV,cST};
       
       Familiar padre = new Padre();
       
       padre.setControlRemoto(controles);
       cTV=padre.getControlRemoto()[0];
       cTV.apagaAparato(tv);
       ((TvRemote)cTV).cambiaCanalMas();
     }
    
}
