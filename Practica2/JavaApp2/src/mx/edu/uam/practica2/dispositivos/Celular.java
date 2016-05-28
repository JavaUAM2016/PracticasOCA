package mx.edu.uam.practica2.dispositivos;

/**
 *
 * @author invited
 */
public class Celular {

    public String modelo;
    String marca;
    public double precio;
    String color;
    long numero;
    boolean estaLibre = true;

    //constructor
    public Celular() {
    }

    //sobrecarga del constructor
    public Celular(String modelo, String marca, double precio, String color, long numero, boolean estaLibre) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.numero = numero;
        this.estaLibre = estaLibre;
    }

//    public visible para todos
//        (package friendly)  visible para el mismo paquete
//    protected visible para si mismo y sus hereditarios
//    private visible solo para si mismo
    
    public void marcaNumero(long numero) {
        if (estaLibre) {
            System.out.println("Marcando a... " + numero);
            estaLibre = false;
        } else {
            System.out.println("Alerta: Telèfono ocupado!!!!!");
        }

    }

    public void colgar() {
        estaLibre = true;
        System.out.println("Linea libre");
    }

    public void recibirLlamada() {
        if (estaLibre) {
            System.out.println("Ring...Ring...Ring");
            System.out.println("Conversando");
            estaLibre = false;

            //colgar();
        } else {
            System.out.println("Beep...Beep...Beep");
            System.out.println("Linea ocupada, deja mensaje");
        }
    }

    public void conectarseInternet(String url) {
        if(!estaLibre){
            System.out.println("No se puede conectar a Internet");
        }else{
            System.out.println("Chrome://" + url);
        }
    }

}
