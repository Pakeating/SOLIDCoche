
package com.prog.cochesolid;

/**
 *Autor: Francisco linares Santamaria
 * Aplicando el Principio de Responsabilidad Unica, esta clase solo puede hacer lo relacionado al coche. 
 * No podría por ejemplo, escribir los datos de los propietarios en una base de datos.
 */
public class Coche {
    protected String modelo;
    protected int numeroRuedas;
    protected String motor;
    protected int numeroPuertas;
    protected int peso;
    protected boolean arrancado;
    protected int autonomía;

    public Coche(){
        arrancado=false;
    }
    public void arrancar(){
        arrancado=true;
    }
    public void parar(){
        arrancado=false;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getMotor() {
        return motor;
    }

    public int getAutonomía() {
        return autonomía;
    }

    public void setAutonomía(int autonomía) {
        this.autonomía = autonomía;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
    
}
