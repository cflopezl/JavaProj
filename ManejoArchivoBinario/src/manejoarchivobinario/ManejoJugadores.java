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
public class ManejoJugadores {
    public static RandomAccessFile archivo;
    public static final int TAM_REGISTRO=88;
    
    public static void abrirArchivo() throws IOException{
        archivo = new RandomAccessFile(
                "C:\\temp\\jugadores.dat","rw");
    }
    
    public static void cerrarArchivo() throws IOException{
        archivo.close();
    }
    
    public static void writeString(String str, int dim) throws IOException{
        //1. rellenar el string para ajustarlo al tamaño
        StringBuffer buffer = new StringBuffer();
        buffer.append(str);
        buffer.setLength(dim);
        //2. escribir en formato Unicode el String
        archivo.writeChars(buffer.toString());
    }
    
    public static String readString(int dim)throws IOException{
        char campo[] = new char[dim];
        
        for(int i=0; i<dim; i++)
            campo[i]=archivo.readChar();
        
        return new String(campo).replace('\0',' ');
    }
    
    /**
     * Escribir el registro
    */
    public static void escribirJugador(String nickname, 
            String nombre, int posicion, int puntaje)
            throws IOException{
        //1. abrir archivo
        abrirArchivo();
        //2. el puntero lo movemos al final del archivo
        long tam = archivo.length();
        archivo.seek(tam);
        //3. escribir cada campo del registro
        archivo.writeInt(posicion);
        writeString(nickname,15);
        writeString(nombre,25);
        archivo.writeInt(puntaje);
        //4. cerrar el archivo
        cerrarArchivo();
    }
    
    public static void leerJugador()throws IOException{
        String nickname; 
            String nombre; 
            int posicion; 
            int puntaje;
        abrirArchivo();
        archivo.seek(TAM_REGISTRO);
        posicion=archivo.readInt();
        nickname = readString(15);
        nombre = readString(25);
        puntaje = archivo.readInt();
        System.out.println("pos="+posicion+
                ",nick="+nickname+",nom="+nombre
                +"puntaje="+puntaje);
        cerrarArchivo();
    }
    
    public static void main(String[] args) {
        try{
            System.out.println("Ingrese opción (1=escribir, 2=leer)");
            Scanner s = new Scanner(System.in);
            int opcion = s.nextInt();
            if(opcion==1)
                escribirJugador("otro", "Otro Lopez", 100, 124000);
            else
                leerJugador();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
