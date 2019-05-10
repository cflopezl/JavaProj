/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivobinario;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author C-Lo 12
 */
public class ArchivoAccesoDirecto {
    public static RandomAccessFile archivo = null;
    public static String nombreArchivo ="C:\\temp\\enteros.dat";
    
    public static void abrirArchivo()throws Exception{
        archivo = new RandomAccessFile(nombreArchivo,"rw");
    }
    
    public static void escribirEntero(int valor)throws IOException{
        //mover el apuntador al final del archivo
        long longitud = archivo.length();
        archivo.seek(longitud);
        archivo.writeInt(valor);
    }
    
    public static void main(String[] args) {
        try{
            abrirArchivo();
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingrese un numero");
            int dato = scn.nextInt();
            escribirEntero(dato);
            //System.out.println("ubicacion actual del PUNTERO al abrir el archivo: " + archivo.getFilePointer());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        }
        
}
