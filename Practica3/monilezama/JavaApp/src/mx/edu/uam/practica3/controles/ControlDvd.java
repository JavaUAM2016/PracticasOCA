package mx.edu.uam.practica3.controles;
import mx.edu.uam.practica3.aparatos.Dvd;
/**
 *
 * @author monica
 */
public class ControlDvd {
     public void prende(Dvd dvd){
        if(!dvd.isEncendido()){
            dvd.setEncendido(true);
            System.out.println("El dvd esta encendido...");
        }else
            if(!dvd.isBandejaAbierta()){
                 dvd.setEncendido(false);
                 System.out.println("El dvd esta apagado...");
            }else{
                System.out.println("Debe cerrar la bandeja para poder apagar el dvd");
            }
           
     }
     
     public void reproducir(Dvd dvd){
         if(dvd.isEncendido()){
             if(dvd.isDiscoInsertado()){
                 if(dvd.isReproduciendo()){
                     System.out.println("Se ha pausado la reproduccion de " + dvd.getVideo());
                     dvd.setReproduciendo(false);
                 }else{
                     System.out.println("Reproduciendo "+ dvd.getVideo());
                     dvd.setReproduciendo(true);
                 }
             }else{
                 System.out.println("No se ha insertado disco");
             }
         }else{
             System.out.println("El dvd esta apagado");
         }
     }
             
    public void adelantarReproduccion(Dvd dvd){
          if(dvd.isEncendido()){
             if(dvd.isDiscoInsertado()){
                 if(dvd.isReproduciendo()){
                     dvd.setCapituloActual(dvd.getCapituloActual()+1);
                     System.out.println("Se adelanto el capitulo");
                  }else{
                     System.out.println("No se esta reproduciendo ningun  video");
                 }
             }else{
                 System.out.println("No se ha insertado disco");
             }
         }else{
             System.out.println("El dvd esta apagado");
         }
     }
     public void atrasarReproduccion(Dvd dvd){
          if(dvd.isEncendido()){
             if(dvd.isDiscoInsertado()){
                 if(dvd.isReproduciendo()){
                     dvd.setCapituloActual(dvd.getCapituloActual()-1);
                      System.out.println("Se atraso el capitulo");
                  }else{
                     System.out.println("No se esta reproduciendo ningun  video");
                 }
             }else{
                 System.out.println("No se ha insertado disco");
             }
         }else{
             System.out.println("El dvd esta apagado");
         }
     }
     public void cambiarCapitulo(Dvd dvd , int capitulo){
         if(dvd.isEncendido()){
             if(dvd.isDiscoInsertado()){
                 if(dvd.isReproduciendo()){
                     dvd.setCapituloActual(capitulo);
                      System.out.println("Se cambio el capitulo al " + capitulo);
                  }else{
                     System.out.println("No se esta reproduciendo ningun  video");
                 }
             }else{
                 System.out.println("No se ha insertado disco");
             }
         }else{
             System.out.println("El dvd esta apagado");
         }
     }
     public void expulsarBandeja(Dvd dvd){
         if(dvd.isEncendido()){
            
                 dvd.setBandejaAbierta(true);
                 dvd.setReproduciendo(false);
                 dvd.setDiscoInsertado(false);
                 System.out.println("Se ha expulsado la bandeja");
           
           }else{
             System.out.println("El dvd esta apagado, no se puede expulsar la bandeja");
         }
     }
     
     public void insertarDisco(Dvd dvd, String video){
         dvd.setDiscoInsertado(true);
         dvd.setVideo(video);
         System.out.println("Se inserto el disco " + video);
     }
}
