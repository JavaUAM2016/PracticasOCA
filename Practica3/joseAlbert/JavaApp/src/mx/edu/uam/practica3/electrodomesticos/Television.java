package mx.edu.uam.practica3.electrodomesticos;

/**
 *
 * @author invited
 */
public class Television {
    
    private String marca;
    private int tamaño;
    private boolean encendido;
    private int canalActual;
    private int volumenActual;
    private final int volumenMaximo=20;
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
    
    public boolean getEncendido(){
        return encendido;
    }
    public void setEncendido(boolean encendido){
        this.encendido=encendido;
    }
    
    public int getCanalActual(){
        return canalActual;
    }
    public void setCanalActual(int canalActual){
        if(canalActual<0){
            System.out.println("ERROR: El canal no puede ser negativo");
        }
        else{
            this.canalActual = canalActual;
        }
    }
    
    public int getVolumenActual(){
        return volumenActual;
    }
    public void setVolumenActual(int volumenActual){
        if(volumenActual<0)
            System.out.println("ERROR: El volumen no puede ser menor a cero");
        else if(volumenActual>volumenMaximo)
            System.out.println("ERROR: El volumen maximo es " + volumenMaximo);
        else{
            this.volumenActual = volumenActual;
        }
    }
}
