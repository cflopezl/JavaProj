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
    public static DataOutputStream salidaServidord;
    public static String mensajeServidor;
    
    public static void startClient() throws Exception{
        cs = new Socket(HOST, PUERTO);
        System.out.println("(Cliente) Ya fue realizada la conexion");
        
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
