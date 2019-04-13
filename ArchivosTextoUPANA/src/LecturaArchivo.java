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
public class LecturaArchivo {
    public static void main(String[] args) {
        try{
            //1. abrir el archivo en modo lectura
            InputStream in = new FileInputStream(
                    "C:\\temp\\ejemplo.txt");
            //2. leer el archivo
            int b = in.read();
            while(b!=-1){
               System.out.print(""+(char)b); 
               b = in.read();
            }
            
            //3. cerrar el archivo
            in.close();
        }catch(Exception e){
            
        }
    }
}
