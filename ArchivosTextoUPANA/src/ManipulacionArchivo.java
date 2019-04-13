/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author C-Lo 12
 */
public class ManipulacionArchivo {
    public static void main(String[] args) {
           try{
               //código que podría generar un error
               //1.abrir el archivo
               OutputStream fsalida = new FileOutputStream(
                       "C:\\temp\\ejemplo.txt",true);
               //2. escribir en el archivo
               //out.write(65);
               //out.write(97);
               String nombre = "Ricardo";
               String fecha = "05/01/2001";
               Integer tam = new Integer(nombre.length());
               String sTam = tam.toString();
               //out.write(sTam.getBytes());
               fsalida.write(nombre.getBytes());
               //out.write("\n".getBytes());
               fsalida.write(124);
               //out.write(" ".getBytes());
               fsalida.write(fecha.getBytes());
               fsalida.write(126);
               //3. cerrar el archivo
               fsalida.close();
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
    }
}
