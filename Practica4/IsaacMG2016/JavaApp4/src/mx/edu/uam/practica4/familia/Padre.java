package mx.edu.uam.practica4.familia;

import mx.edu.uam.practica4.control.ControlRemoto;

/**
 *
 * @author invited
 */
public class Padre extends Familiar{
    
    private String var1;
    private int var2;

    public Padre(String nombre,int edad,ControlRemoto [] control,String var1, int var2) {
        
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setControl(control);
        this.var1 = var1;
        this.var2 = var2;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

}//fin class 
