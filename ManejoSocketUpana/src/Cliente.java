/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;
/**
 *
 * @author C-Lo 12
 */
public class Cliente {
    public static final int PUERTO=1234;
    public static final String HOST="localhost";
    public static Socket cs;
    public static DataOutputStream salidaServidor;
    public static String mensajeServidor;
    
    public static void startClient() throws Exception{
        cs = new Socket(HOST, PUERTO);
        System.out.println("(Cliente) Ya fue realizada la conexion");
        BufferedReader entrada = 
                new BufferedReader(
                        new InputStreamReader(cs.getInputStream()));
        mensajeServidor = entrada.readLine();
        System.out.println("(Cliente) Se recibio el mensaje del servidor:"
                +mensajeServidor);
        
        //enviar un mensaje al servidor
        salidaServidor= new DataOutputStream(cs.getOutputStream());
        for (int i = 0; i < 2; i++) {
            salidaServidor.writeUTF("Hola desde el cliente "+ i + "\n");
        }
        
        System.out.println("(Cliente) La app finalizo");
        cs.close();
    }
    
    public static void main(String[] args) {
        try{
            startClient();
        }catch(Exception e){
            System.out.println("error:"+e.getMessage());
        }
    }
}
