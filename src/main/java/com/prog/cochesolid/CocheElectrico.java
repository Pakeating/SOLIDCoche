
package com.prog.cochesolid;

/**
 *
 * @author PAKEATING
 */
public class CocheElectrico extends CocheMovimiento {
    @Override
    public void arrancar(){
        arrancado=true;
        System.out.println("Arrancando motor electrico");
    }
    @Override
    public void parar(){
         velocidad=0;
         arrancado=false;
         System.out.println("Detenido motor electrico");
    }
    @Override
    public void acelerar(int acelerando){
        velocidad +=acelerando;
        System.out.println("Acelerando coche electrico");
    }
    @Override
    public void frenar(int frenando){
        velocidad-=frenando;
        System.out.println("Frenando coche electrico");
    }
}
