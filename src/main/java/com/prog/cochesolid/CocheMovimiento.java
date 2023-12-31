
package com.prog.cochesolid;
/*
Esta clase extiende la funcionalidad de Coche siguiendo el principio de Abierto-Cerrado
*/
public class CocheMovimiento extends Coche implements CocheMovimientoInterface {

    
    protected int velocidad;
    
    public CocheMovimiento(){
        super();
        velocidad=0;
    }
    @Override
    public void acelerar(int acelerando){
        velocidad +=acelerando;
    }
    @Override
    public void frenar(int frenando){
        velocidad-=frenando;
    }
    public void parar (){
        velocidad=0;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
