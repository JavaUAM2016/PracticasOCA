package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Electrodomestico;
import mx.edu.uam.practica4.electroDomestico.PlayStation3;

/**
 *
 * @author invited
 */
public class ControlPs3 extends ControlRemoto{
    
    //public void enciendePs3(PlayStation3 ps3){
    
     public void encender(PlayStation3 ps3){
        if(!ps3.isEncendido()){//apagado
            ps3.setEncendido(true);
            System.out.println("PS3 << ON >>\n");
        }
        else{
            ps3.setEncendido(false);
            System.out.println("PS3 [ Reset/OFF ]\n");
        }
    }
    
    //public void apagaPs3(PlayStation3 ps3){
    public void apagar(PlayStation3 ps3){
        if(ps3.isEncendido()){
            ps3.setEncendido(false);
            System.out.println("PS3 [ OFF ]\n");
        }
        else{
            ps3.setEncendido(true);
            System.out.println("PS3 << ON >>\n");
        }
    }
    
    public boolean conectaInternet(PlayStation3 ps3){
        if(!ps3.isWifi()){//wifi apagado
            System.out.println("PlayStation Network Sin Conexion...\n");
            return false;
        }
        else{
            System.out.println("PlayStation Network Conectando...\n");
            return true;
        }
    }
    
    public void descargaJuego(PlayStation3 ps3,int tamJuego){
        if(conectaInternet(ps3))
            if(tamJuego <= ps3.getCapacidadDiscoDuroMax())
                System.out.println("Iniciando Descarga...please wait\n");
            else
                System.out.println("Capacidad Disco Duro Insuficiente..\n");
        else
            System.out.println("Comprube su conexion a Internet ??\n");
    }
    
    public void cargaJuego(PlayStation3 ps3,int noJuego){
        if(noJuego > 0 && noJuego <= ps3.getVideoJuegosInstall()){
            ps3.setVideoJuegoActual(noJuego);
            System.out.println("Juego ["+ps3.getVideoJuegoActual()+"] Cargando...\n");
        }
        else
            System.out.println("Número de Juego No valido...Exit\n");
    }
    
    public void agregaJugador(PlayStation3 ps3){
        if(ps3.getJugadores() >= 0 && ps3.getJugadores()< ps3.getNoJugadoresMax()){
            ps3.setJugadores(ps3.getJugadores()+1);
            System.out.println("Nuevo Jugador Agregado..\n");
        }
        else
            System.out.println("Operacion Invalida No se pueden agregar mas Jugadores.\n");
    }

   
    
}//fin class
