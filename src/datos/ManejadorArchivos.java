/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Mateo
 */
public class ManejadorArchivos {
    public static ArrayList LeerArchivo(String ruta){
        //Lectura del contenido del Archivo
        String cont, anterior="";
        ArrayList<String> lineas = new ArrayList<>();
        FileReader f = null;
        try {f = new FileReader(ruta);} catch (FileNotFoundException ex) {}
        try (BufferedReader b = new BufferedReader(f)) {
            while((cont = b.readLine())!=null) {
                anterior=cont;
                anterior=anterior.trim().toUpperCase();
                if(!anterior.isEmpty())
                    lineas.add(anterior);
            }
            f.close();
        } catch (IOException ex) {}
        return lineas;
    }
    public static void EscribirArchivoSustitucion(ArrayList<String> lineas) throws IOException{
        File archivo = new File("sustitucion.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for(int i=0;i<lineas.size();i++){
                bw.write(lineas.get(i));
                bw.newLine();
            }
            bw.close();
        }catch (IOException ex) {}
    }
    public static void EscribirArchivoTransposicion(ArrayList<String> lineas) throws IOException{
        File archivo = new File("transposicion.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for(int i=0;i<lineas.size();i++){
                bw.write(lineas.get(i));
                bw.newLine();
            }
            bw.close();
        }catch (IOException ex) {}
    }
}
