/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocifrado;

import datos.ManejadorArchivos;
import java.util.ArrayList;

/**
 *
 * @author Mateo
 */
public class Criptoanalisis {
    private ArrayList<String> lineas;
    private String ruta,sistema;
    private Double porcentajeV,porcA,porcE,porcU;

    public Double getPorcU() {
        return porcU;
    }
    private int frecA,frecE,frecI,frecO,frecU;
    public Criptoanalisis(String ruta){
        this.ruta=ruta;
        this.lineas=new ArrayList<>();
        this.lineas=ManejadorArchivos.LeerArchivo(this.ruta);
    }

    public Double getPorcA() {
        return porcA;
    }

    public Double getPorcE() {
        return porcE;
    }

    public String getSistema() {
        return sistema;
    }

    public Double getPorcentajeV() {
        return porcentajeV;
    }

    public int getFrecA() {
        return frecA;
    }

    public int getFrecE() {
        return frecE;
    }

    public int getFrecI() {
        return frecI;
    }

    public int getFrecO() {
        return frecO;
    }

    public int getFrecU() {
        return frecU;
    }
    
    public void AlgoritmoAnalisis(){
        String union="";
        Double porcV,porcA,porcE,porcU;
        int contC=0,contV=0,contA=0,contE=0,contI=0,contO=0,contU=0;
        for(int i=0;i<this.lineas.size();i++){
            union=union+this.lineas.get(i);
        }
        System.out.println("LONGITUG DOC: "+union.length());
        for(int j=0;j<union.length();j++){
            if(union.codePointAt(j)==117 || union.codePointAt(j)==111 || union.codePointAt(j)==105 || union.codePointAt(j)==97 || union.codePointAt(j)==101 || union.codePointAt(j)==65 ||union.codePointAt(j)==69 || union.codePointAt(j)==73 || union.codePointAt(j)==79 || union.codePointAt(j)==85){
                contV++;
                if(union.codePointAt(j)==65)
                    contA++;
                if(union.codePointAt(j)==69)
                    contE++;
                if(union.codePointAt(j)==73)
                    contI++;
                if(union.codePointAt(j)==79)
                    contO++;
                if(union.codePointAt(j)==85)
                    contU++;
            }else{
                contC++;
            }
        }
        porcV=((double)contV*100)/((double)union.length());
        porcA=((double)contA*100)/((double)union.length());
        porcE=((double)contE*100)/((double)union.length());
        porcU=((double)contU*100)/((double)union.length());
        System.out.println("PORCA: "+porcA+" PORCE"+porcE);
        this.porcU=porcU;
        this.porcA=porcA;
        this.porcE=porcE;
        this.porcentajeV=porcV;
        this.frecA=contA;
        this.frecE=contE;
        this.frecI=contI;
        this.frecO=contO;
        this.frecU=contU;
        if(porcV>33 && porcA>8 && porcE>8){
            this.sistema="TRANSPOSICIÓN";
        }else{
            this.sistema="SUSTITUCIÓN";
        }
    }
    
}
