/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosocketupana;

import java.io.*;
import java.net.*;

/**
 *
 * @author C-Lo 12
 */
public class Servidor {
    public static final int PUERTO=1234;
    public static String mensajeServidor;
    public static ServerSocket ss;
    public static Socket cs;
    public static DataOutputStream salidaCliente;
    
    public static void startServer() throws Exception{
        //Se crea el socket del server y se deja escuchando
        ss = new ServerSocket(PUERTO);
        cs = new Socket();
        System.out.println("(SERVIDOR) Escuchando");
        cs = ss.accept();
        System.out.println("(SERVIDOR) El cliente se conecto exitosamente");
        
        System.out.println("(SERVIDOR) La app finalizo");
        ss.close();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            startServer();
        }catch(Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }
    
}
