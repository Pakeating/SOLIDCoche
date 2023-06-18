

package com.prog.cochesolid;

/**
 *Autor: Francsico Linares Santamaria
 */
public class CocheSOLID {

    public static void main(String[] args) {
        CocheMovimiento miCoche=new CocheMovimiento();
        miCoche.setModelo("Dacia Sandero");
        miCoche.setMotor("90cv");
        miCoche.setNumeroPuertas(4);
        miCoche.setPeso(0);
        miCoche.arrancar();
        
        miCoche.acelerar(3);
        System.out.println("velocidad del coche: "+miCoche.getVelocidad());
        miCoche.frenar(1);
        System.out.println("velocidad del coche: "+miCoche.getVelocidad());
        miCoche.parar();
        System.out.println("velocidad del coche: "+miCoche.getVelocidad());
        
    }
}
