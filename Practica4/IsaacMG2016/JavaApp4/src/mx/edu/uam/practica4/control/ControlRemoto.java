package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electroDomestico.Electrodomestico;

/**
 *
 * @author Isaac MG
 */
public abstract class ControlRemoto {
    
    private int numBaterias;
    private String tipoBaterias;
    
    public void encender(Electrodomestico e){
        if(!e.isEstaPrendido()){//apagado
            System.out.println("<< POWER ON >>\n");
            e.setEstaPrendido(true);
        }
        else{
            System.out.println("[[ POWER OFF ]]\n");
            e.setEstaPrendido(false);
        }    
    }
    
    public void apagar(Electrodomestico e){
        if(e.isEstaPrendido()){
            System.out.println("[[ POWER OFF ]]\n");
            e.setEstaPrendido(false);
        }
        else{
            System.out.println("<< POWER ON >>\n");
            e.setEstaPrendido(true);
        }        
    }
    
}
