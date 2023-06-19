
package com.prog.cochesolid;

import java.util.ArrayList;

/**
 *  Interfaz para interactuar con la base de datos segun el principio de inversion de dependencias
 * @author Francisco linares Santamaria
 */
public interface BaseDatosInterface {

    public void escribirDato(String cadena)throws Exception;
    public ArrayList<String> recuperarDatos()throws Exception;
}
