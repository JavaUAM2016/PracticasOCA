/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.beavercheeks.practica3.devices;

/**
 *
 * @author sozir
 */
public class Television 
{
    private String marca;
    private int tamanio;
    private boolean encendido;
    private int canalActual;
    private int volumenActual;
    private int volumenMax;

    public Television()
    {
        this.marca = "LG";
        this.tamanio = 32;
        this.encendido = false;
        this.volumenMax = 100;
    }
    
    public boolean getTVStatus()
    {
        return this.encendido;
    }
    
    public boolean setTVStatus(boolean howsTV)
    {
        this.encendido = howsTV;
        return this.encendido;
    }
    
    public int getVolumenActual()
    {
        return this.volumenActual;
    }
    
    public int setVolumenActual(int cuantoMueve)
    {
        this.volumenActual += cuantoMueve;
        return volumenActual;
    }
    
    public int getVolumenMax()
    {
        return this.volumenMax;
    }
    
    public int getCanalActual()
    {
        return this.canalActual;
    }
      
    public int setCanalActual(int cuantoMueve)
    {
        this.canalActual += cuantoMueve;
        return canalActual;
    }
    
    public int setCanalCustom (int queCanal)
    {
        this.canalActual = queCanal;
        return canalActual;
    }
}
