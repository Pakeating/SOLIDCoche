

package com.prog.cochesolid;

/**
 *Autor: Francsico Linares Santamaria
 */
public class CocheSOLID {

    public static void main(String[] args) {
        Coche miCocheElectrico=new CocheElectrico();
        Coche miCocheCombustible=new CocheCombustible();
        Coche miCocheHibrido=new CocheHibrido();
        probarCoches(miCocheElectrico);
        probarCoches(miCocheCombustible);
        probarCoches(miCocheHibrido);
        
    }
    
    public static void probarCoches(Coche miCoche){
        if(miCoche instanceof CocheElectrico cocheElectrico){
            miCoche=cocheElectrico;
            miCoche.setModelo("Dacia Sandero");
            miCoche.setMotor("90cv");
            miCoche.setNumeroPuertas(4);
            miCoche.setPeso(0);
            miCoche.arrancar();
            cocheElectrico.acelerar(3);
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());
            cocheElectrico.frenar(1);
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());
            miCoche.parar();
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());  
        }
        if(miCoche instanceof CocheCombustible cocheCombustible){
            miCoche=cocheCombustible;
            miCoche.setModelo("Dacia Sandero");
            miCoche.setMotor("90cv");
            miCoche.setNumeroPuertas(4);
            miCoche.setPeso(0);
            miCoche.arrancar();
            cocheCombustible.acelerar(3);
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());
            cocheCombustible.frenar(1);
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());
            miCoche.parar();
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());  
        }
        if(miCoche instanceof CocheHibrido cocheHibrido){
            miCoche=cocheHibrido;
            miCoche.setModelo("Dacia Sandero");
            miCoche.setMotor("90cv");
            miCoche.setNumeroPuertas(4);
            miCoche.setPeso(0);
            miCoche.arrancar();
            cocheHibrido.acelerar(3);
            System.out.println("velocidad del coche: "+cocheHibrido.getVelocidad());
            cocheHibrido.frenar(1);
            System.out.println("velocidad del coche: "+cocheHibrido.getVelocidad());
            miCoche.parar();
            System.out.println("velocidad del coche: "+cocheHibrido.getVelocidad());  
        }
       
    }
}
