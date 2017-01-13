/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocifrado;

import datos.ManejadorArchivos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Mateo
 */
public class Cifrado {
    private String ruta;
    private ManejadorArchivos manejador;
    private ArrayList<String> lineas,lineaCodificada,lineaCodificada2;
    private int desplazamientoN = 0;
    private int tamMatriz=0;
    private char tablaCesar[] = {
        'A', 'B', 'C', 'D', 'E',
        'F', 'G', 'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'Ñ',
        'O', 'P', 'Q', 'R', 'S',
        'T', 'U', 'V', 'W', 'X',
        'Y', 'Z'
    };
    
    public Cifrado(String ruta,int n,int tam){
        this.ruta=ruta;
        this.lineas=new ArrayList<>();
        this.lineaCodificada=new ArrayList<>();
        this.lineaCodificada2=new ArrayList<>();
        this.desplazamientoN=n;
        this.tamMatriz=tam;
        this.lineas=ManejadorArchivos.LeerArchivo(this.ruta);
    }
    
    public void CifradoSustitucion() throws IOException{
        //System.out.println(this.lineas.size());
        for(int i=0;i<this.lineas.size();i++){
            //System.out.print("|"+this.lineas.get(i)+"|\n");
            this.lineaCodificada.add(encriptarTextoClaro(this.lineas.get(i)));
        }
        /*for(int i=0;i<this.lineaCodificada.size();i++){
            System.out.print("|"+this.lineaCodificada.get(i)+"|\n");
        }*/
        ManejadorArchivos.EscribirArchivoSustitucion(this.lineaCodificada);
    }

    public int getDesplazamientoN() {
        return desplazamientoN;
    }

    public int getTamMatriz() {
        return tamMatriz;
    }

    public ArrayList<String> getLineaCodificada() {
        return lineaCodificada;
    }

    private String encriptarTextoClaro(String texto) {
        String textoCifrado = "";
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) != ' ')
                textoCifrado += getTextoCifrado(texto.charAt(i)) + "";
            else
                textoCifrado += " ";
        }
        return textoCifrado;
    }
    private char getTextoCifrado(char texto) {
        int indiceX = 0;
 
        for (int i = 0; i < tablaCesar.length; i++) {
            if (texto == tablaCesar[i]) {
                indiceX = i;
                break;
            }
        }
 
        return tablaCesar[(indiceX + getDesplazamientoN()%27) % 27];
        //return tablaCesar[(indiceX + (27 - getDesplazamientoN()%27)) % 27]; (DESCIFRAR)
    }

    public ArrayList<String> getLineaCodificada2() {
        return lineaCodificada2;
    }
    
    public void CifradoTransposicion() throws IOException{
        String union="";
        int fil=0,cont=0,k=0;
        for(int i=0;i<this.lineas.size();i++){
            union=union+this.lineas.get(i);
        }
        union=union.replaceAll(" ","_");
        if(union.length()%getTamMatriz()==0)
            fil=union.length()/getTamMatriz();
        else
            fil=union.length()/getTamMatriz()+1;
        char [][] main=new char [fil][getTamMatriz()];
        //System.out.println(union);
        for(int i=0;i<fil;i++){
            for(int j=0;j<getTamMatriz();j++){
                if(k<union.length()){
                    main[i][j]=union.charAt(k);
                    k++;
                }else
                    main[i][j]='x';
            }
        }
        /*for(int i=0;i<fil;i++){
            for(int j=0;j<getTamMatriz();j++){
                System.out.print(main[i][j]);
            }
            System.out.println("");
        }*/
        //GENERACIÓN DE CLAVE
        int pos,num=0;
        int lim = getTamMatriz();
        Stack < Integer > Clave = new Stack < Integer > ();
        for (int i = 0; i < lim ; i++) {
            pos = (int) Math.floor(Math.random() * lim );
        while (Clave.contains(pos)) {
            pos = (int) Math.floor(Math.random() * lim );
        }
        Clave.push(pos);
        }
        //System.out.println("Núm. aleatorios sin repetición:");
        System.out.println(Clave.toString());
        while(num<getTamMatriz()){
            String cadena="";
            for(int i=0;i<fil;i++){
                cadena=cadena+main[i][Clave.get(num)];
            }
            this.lineaCodificada2.add(cadena);
            num++;
        }
        ManejadorArchivos.EscribirArchivoTransposicion(this.lineaCodificada2);
    }

}
