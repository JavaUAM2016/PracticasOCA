package mx.edu.uam.practica4.electroDomestico;

/**
 *
 * @author Isaac MG
 * @version 28/05/2016
 */
public class Television extends Electrodomestico{
    
    //private String marca;
    private int tamano;
    //private boolean encendido;
    private int  canalActual;
    private int volumenActual;
    private int volMaximo;
    private int canalMax;
    
            
    public Television(String marca, int tamano, boolean encendido, int canalActual, int volumenActual, int volMaximo,int canalMax) {
        
        super.setMarca(marca);
        super.setEstaPrendido(encendido);
        
        this.tamano = tamano;
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
        this.volMaximo = volMaximo;
        this.canalMax = canalMax;
    }

    public Television() {
    }
    
    
    
/*    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
*/
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public boolean isEncendido() {
        return super.isEstaPrendido();
    }

    public void setEncendido(boolean encendido) {
        //this.encendido = encendido;
        super.setEstaPrendido(encendido);
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
    }

    public int getVolMaximo() {
        return volMaximo;
    }

    public void setVolMaximo(int volMaximo) {
        this.volMaximo = volMaximo;
    }

    public int getCanalMax() {
        return canalMax;
    }

    public void setCanalMax(int canalMax) {
        this.canalMax = canalMax;
    }
    
}
