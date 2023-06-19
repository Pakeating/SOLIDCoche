

package com.prog.cochesolid;

import java.util.ArrayList;

/**
 *Autor: Francsico Linares Santamaria
 */
public class CocheSOLID {

    public static void main(String[] args) {
        BaseDatosInterface baseDatos=new LocalDB();
        
        Coche miCocheElectrico=new CocheElectrico();
        miCocheElectrico.setModelo("Dacia Sandero");
        miCocheElectrico.setMotor("90cv");
        miCocheElectrico.setNumeroPuertas(4);
        miCocheElectrico.setPeso(0);
        
        Coche miCocheCombustible=new CocheCombustible();
        miCocheCombustible.setModelo("Renault Clio");
        miCocheCombustible.setMotor("90cv");
        miCocheCombustible.setNumeroPuertas(4);
        miCocheCombustible.setPeso(0);
        
        Coche miCocheHibrido=new CocheHibrido();
        miCocheHibrido.setModelo("Toyota Prius");
        miCocheHibrido.setMotor("90cv");
        miCocheHibrido.setNumeroPuertas(4);
        miCocheHibrido.setPeso(0);
        
        probarCoches(miCocheElectrico);
        probarCoches(miCocheCombustible);
        probarCoches(miCocheHibrido);
        try {
            baseDatos.escribirDato(miCocheElectrico.toString());
            baseDatos.escribirDato(miCocheCombustible.toString());
            baseDatos.escribirDato(miCocheHibrido.toString());
        } catch (Exception e) {
            System.out.println("Problemas escribiendo en la base de datos: "+ e.getMessage());
        }
        
        try {
            ArrayList<String> consulta=baseDatos.recuperarDatos();
            consulta.forEach(value -> System.out.println(value));
        } catch (Exception e) {
            System.out.println("Problemas leyendo de la base de datos: "+ e.getMessage());
        }
        
    }
    
    public static void probarCoches(Coche miCoche){
        if(miCoche instanceof CocheElectrico cocheElectrico){
            
            miCoche.arrancar();
            cocheElectrico.acelerar(3);
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());
            cocheElectrico.frenar(1);
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());
            miCoche.parar();
            System.out.println("velocidad del coche: "+cocheElectrico.getVelocidad());
            
        }
        if(miCoche instanceof CocheCombustible cocheCombustible){
            
            miCoche.arrancar();
            cocheCombustible.acelerar(3);
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());
            cocheCombustible.frenar(1);
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());
            miCoche.parar();
            System.out.println("velocidad del coche: "+cocheCombustible.getVelocidad());  
        }
        if(miCoche instanceof CocheHibrido cocheHibrido){
            
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
