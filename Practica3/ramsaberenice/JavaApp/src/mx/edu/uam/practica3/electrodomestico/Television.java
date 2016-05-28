package mx.edu.uam.practica3.electrodomestico;

/**
 *
 * @author invited
 */
public class Television {

    private String marca;
    private int pulgadas;
    private boolean encendido;
    private float canalActual;
    private int volumenActual;

    public Television(String marca, int pulgadas, boolean encendido, float canalActual, int volumenActual) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.encendido = encendido;
        this.canalActual = canalActual;
        this.volumenActual = volumenActual;
    }
    
    public String getMarca() {
        System.out.println("Marca del televisor: " + marca);
        return marca;
    }

    public void setMarca(String marca) {
        System.out.println("Marca del televisor: " + marca);
        this.marca = marca;
    }

    public int getPulgadas() {
        System.out.println("Pulgadas del televisor: " + pulgadas);
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
        System.out.println("Pulgadas del televisor: " + pulgadas);
    }

    public boolean isEncendido() {
        if(encendido == true)
            System.out.println("ENCENDIDO!!");
        else
            System.out.println("APAGADO!!");
        
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
        
        if(encendido == true)
            System.out.println("ENCENDIDO!!");
        else
            System.out.println("APAGADO!!");
    }

    public float getCanalActual() {
        System.out.println("Canal actual: " + canalActual);
        return canalActual;
    }

    public void setCanalActual(float canalActual) {
        this.canalActual = canalActual;
        System.out.println("Canal actual: " + canalActual);
    }

    public int getVolumenActual() {
        System.out.println("Volumen actual: " + volumenActual);
        return volumenActual;
    }

    public void setVolumenActual(int volumenActual) {
        this.volumenActual = volumenActual;
        System.out.println("Volumen actual: " + volumenActual);
    }

}
