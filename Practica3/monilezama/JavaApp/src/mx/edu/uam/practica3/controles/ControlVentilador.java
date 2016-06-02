
package mx.edu.uam.practica3.controles;


import mx.edu.uam.practica3.aparatos.Ventilador;

public class ControlVentilador {
    
    
    public void prende(Ventilador ven){
        if(ven.isEncendido()==false){
            ven.setEncendido(true);
           System.out.println("Se prendio el ventilador...");
        }else
             ven.setEncendido(false);
            System.out.println("Se apago el ventilador...");
    }
    
    
    
    public void subeVel(Ventilador ven){
       if(ven.isEncendido()){
           if(ven.getVelActual()<ven.getVolMax()){
               ven.setVelActual(ven.getVelActual()+1);
               System.out.println("Se subio la velocidad..") ;
           }
            
       }else
            System.out.println("El ventilador esta apagado, no se puede subir la velocidad..");
    }
    public void bajaVel(Ventilador ven){
        if(ven.isEncendido()){
            if(ven.getVelActual()>0){
                ven.setVelActual(ven.getVelActual()-1);
                System.out.println("Se bajo la velocidad..");
            }
        }else
            System.out.println("El ventilador  esta apagado no se puede bajar la velocidad..");
        
    }
    
    public void girar(Ventilador ven){
        if(ven.isEncendido()){
            if(ven.isGirando()){
                System.out.println("El ventilador dejo de girar..");
            }else{
                System.out.println("El ventilador esta girando...");
            }
            
        }else{
            System.out.println("El ventilador esta apagado no puede girar..");
        }
    }
}

