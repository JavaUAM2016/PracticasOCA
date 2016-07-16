package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.PlayStation3;
import mx.edu.uam.practica4.exceptions.SistemaAparatosException;

public class ControlPs3 extends Control{
    
    public void conectaInternet(PlayStation3 ps3){
        if(ps3.isEncendido()){
             if(ps3.isWifi()){
                System.out.println("Desconectando...");
                ps3.setWifi(false);
            }
            else{
                System.out.println("Conectando a internet... :)");
                ps3.setWifi(true);
            }
        }
        
    }
    
    public void descargaJuego(PlayStation3 ps3,int tamJuego) throws SistemaAparatosException{
        if(ps3.isEncendido()){
            if(ps3.isWifi())
                if(tamJuego <= ps3.getCapacidadDiscoDuroMax())
                    System.out.println("Iniciando Descarga...please wait\n");
                else
                    throw new SistemaAparatosException("Capacidad Disco Duro Insuficiente..\n");
            else
                throw new SistemaAparatosException("Comprube su conexion a Internet ??\n");

        }
    }
    
    public void cargaJuego(PlayStation3 ps3,int noJuego) throws SistemaAparatosException{
        if(ps3.isEncendido()){
            if(noJuego > 0 && noJuego <= ps3.getVideoJuegosInstall()){
            ps3.setVideoJuegoActual(noJuego);
            System.out.println("Juego ["+ps3.getVideoJuegoActual()+"] Cargando...\n");
        }
        else
            throw new SistemaAparatosException("Número de Juego No valido...Exit\n");
        }  
    }
    
    public void agregaJugador(PlayStation3 ps3)throws SistemaAparatosException{
        if(ps3.isEncendido()){
            if(ps3.getJugadores() >= 0 && ps3.getJugadores()< ps3.getNoJugadoresMax()){
            ps3.setJugadores(ps3.getJugadores()+1);
            System.out.println("Nuevo Jugador Agregado..\n");
        }
        else
            throw new SistemaAparatosException("Operacion Invalida No se pueden agregar mas Jugadores.\n");
        }
    }
}
