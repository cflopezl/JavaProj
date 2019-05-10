/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivobinario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author C-Lo 12
 */
public class BinarioDOS {

    
    public static void escribir(int edad, String nombre, int nota){
        try{
            FileOutputStream escritura = 
                    new FileOutputStream("C:\\Temp\\upana\\arcBinario.upana",true);
            DataOutputStream manejador = new DataOutputStream(escritura);
            manejador.writeInt(edad);
            manejador.writeUTF(nombre);
            manejador.writeInt(nota);
            manejador.close();
            
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }
    
    public static void leer() throws Exception{
        DataInputStream dis=null;
        try{
            FileInputStream lectura = 
                    new FileInputStream("C:\\Temp\\upana\\arcBinario.upana");
            dis = new DataInputStream(lectura);
            while(true){
                int edad = dis.readInt();
                System.out.println(""+edad);
                System.out.println(""+dis.readUTF());
                System.out.println(""+dis.readInt());
            }
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
        dis.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //escribir(23,"Carlos",80);
        leer();
    }
    
}
