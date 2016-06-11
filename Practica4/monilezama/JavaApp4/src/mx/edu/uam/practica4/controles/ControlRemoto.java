
package mx.edu.uam.practica4.controles;
import mx.edu.uam.practica4.aparatos.Electrodomestico;


public abstract class ControlRemoto {
    private int numBaterias;
    private String tipoBaterias;
    boolean encender=true;
  

    
    public void encender(Electrodomestico aparato){}

    public int getNumBaterias() {
        return numBaterias;
    }

    public String getTipoBaterias() {
        return tipoBaterias;
    }

    public boolean isEncender() {
        return encender;
    }

    public void setEncender(boolean encender) {
        this.encender = encender;
    }

    public void setNumBaterias(int numBaterias) {
        this.numBaterias = numBaterias;
    }

    public void setTipoBaterias(String tipoBaterias) {
        this.tipoBaterias = tipoBaterias;
    }
    
     public void prender(Electrodomestico t){
        if(!t.isEncendido()){
            t.setEncendido(true);
           System.out.println("Se prendio...");
        }else{
            t.setEncendido(false);
            System.out.println("Se apago...");
        }
            
    }

    

 
    
    

   
  


    
}
