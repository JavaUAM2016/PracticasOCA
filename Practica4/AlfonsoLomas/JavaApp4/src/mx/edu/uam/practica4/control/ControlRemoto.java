package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Electrodomestico;

/**
 *
 * @author invited
 */
public abstract class ControlRemoto {
    
    private int numBaterias;
    private String tipoBaterias;

     public void encender(Electrodomestico electrodomestico){
        if(!electrodomestico.isEncendido()){
            electrodomestico.setEncendido(true);
            System.out.println("Prendiendo... ...");
        }else{
            System.out.println("Ya està prendido");
        }
    }
    
    public void apagar(Electrodomestico electrodomestico){
        if(electrodomestico.isEncendido()){
            electrodomestico.setEncendido(false);
            System.out.println("Apagando... ...");
        }else{
            System.out.println("Zzzzzzzzz....");
        }
    }
    
    public int getNumBaterias() {
        return numBaterias;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public String getTipoBaterias() {
        return tipoBaterias;
    }

    public void setTipoBaterias(String tipoBaterias) {
        this.tipoBaterias = tipoBaterias;
    }
       
}
