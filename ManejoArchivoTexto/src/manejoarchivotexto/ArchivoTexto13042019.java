/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivotexto;
import java.io.*;
/**
 *
 * @author C-Lo 12
 */
public class ArchivoTexto13042019 {
    public static void main(String[] args) {
        try{
            String nombre = "Televisor LG 45 SMART 4K";
            float precio=3781.99F;
            
            //1.Crear o abrir el archivo en modo escritura
            OutputStream arcSalida = new FileOutputStream(
                    "C:\\Temp\\Productos.inf",true);
            //2. Escribir datos al archivo
            /*
            arcSalida.write(nombre.getBytes());
            Float f = new Float(precio);
            String sPrecio = f.toString();
            arcSalida.write(sPrecio.getBytes());
*/
            String registro = nombre + "|" + precio;
            int tamanio = registro.length();
            registro = "" + tamanio + registro;
            arcSalida.write(registro.getBytes());
            //3. cerrar el archivo
            arcSalida.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
