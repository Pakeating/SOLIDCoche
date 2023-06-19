
package com.prog.cochesolid;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Clase que realiza la lectura y escritura en un archivo local de los datos 
 * @author PAKEATING
 */
public class LocalDB implements BaseDatosInterface {
    private String ruta="./LocalDB.txt";
    private BufferedWriter guardar;
    private Scanner lectura;
    @Override
    public void escribirDato(String cadena) throws IOException{
        guardar=new BufferedWriter(new FileWriter(ruta,true));
        guardar.write(cadena+"\n");
        guardar.close();
        
    }

    @Override
    public ArrayList<String> recuperarDatos() throws FileNotFoundException {
        lectura=new Scanner(new File(ruta));
        ArrayList<String> consulta=new ArrayList<String>();
        while(lectura.hasNextLine()){
            consulta.add(lectura.nextLine());
        }
        return consulta;
        
    }
    
}
