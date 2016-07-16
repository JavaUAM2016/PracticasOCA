package mx.edu.uam.practica4.control;

import mx.edu.uam.practica4.electrodomestico.Electrodomestico;

public abstract class Control{
    
    private String tamPilas;
    private int numPilas;

    public String getTamPilas() {
        return tamPilas;
    }

    public void setTamPilas(String tamPilas) {
        this.tamPilas = tamPilas;
    }

    public int getNumPilas() {
        return numPilas;
    }

    public void setNumPilas(int numPilas) {
        this.numPilas = numPilas;
    }
    
    public void onOff(Electrodomestico elec){
        if(elec.isEncendido()){
            System.out.println("Apagando...zzZZ");
            elec.setEncendido(false);
        }
        else{
            System.out.println("Encendiendo...:)");
            elec.setEncendido(true);
        }
    } 
}
