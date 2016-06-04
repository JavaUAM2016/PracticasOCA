/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.aparatos.Radio;

/**
 *
 * @author invited
 */
public class ControlRadio extends ControlRemoto{
      public void encenderRaddio( Radio R){
          
          if(R.isEncendido()==true){
              System.out.println("El radio ya estaba encendido");
          }else{
              R.setEncendido(true);
              System.out.println("Radio Emcendido");
          }
          
      }
      
      public void subirVolumen(Radio R){
          
          if(R.getEstacionActual()==30){
              System.out.println("Volumen maximo de radio");
          }else{
              R.setVolActual(R.getVolActual()+1);
              System.out.println("El volumen actual es: "+ R.getVolActual());
          }
      }
      
      public void bajarVolumen(Radio R){
          if(R.getVolActual()==0){
              System.out.println("Volumen minimo alcanzado");
          }else{
              R.setVolActual(R.getVolActual()+1);
              System.out.println("El volumen es: "+ R.getVolActual());
          }
          
      }
       public void subirEstacion(Radio R){
          R.setEstacionActual(R.getEstacionActual()+1.0);
           System.out.println("La estacion actual es: "+ R.getEstacionActual());
           
       }
       public void bajarEstacion(Radio R){
           R.setEstacionActual(R.getEstacionActual()-0.1);
       }
       
       public void cambiarEstacion ( Radio R, double c){
           R.setEstacionActual(c);
           System.out.println("La estacion actual es: "+ R.getEstacionActual());
       }
}
