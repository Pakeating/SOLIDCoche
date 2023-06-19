
package com.prog.cochesolid;

/**
 *
 * @author PAKEATING
 */
public class CocheCombustible extends CocheMovimiento {
   
    @Override
    public void arrancar(){
        arrancado=true;
        System.out.println("Arrancando motor de combustion");
    }
    @Override
    public void parar(){
         velocidad=0;
         arrancado=false;
         System.out.println("Detenido motor de combustion");
    }
    @Override
    public void acelerar(int acelerando){
        velocidad +=acelerando;
        System.out.println("Acelerando coche de combustion");
    }
    @Override
    public void frenar(int frenando){
        velocidad-=frenando;
        System.out.println("Frenando coche de combustion");
    }
}
