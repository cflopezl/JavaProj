
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C-Lo 12
 */
public class Cliente {
    public static final int PUERTO = 1234;
    public static final String HOST = "localhost";
    public static Socket cs;
    public static DataOutputStream salidaServidor;
    
    public static void startClient()throws Exception{
        cs = new Socket(HOST, PUERTO);
        System.out.println("(cliente) Me logre conectar con el servidor");
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String mensaje = entrada.readLine();
        System.out.println("(cliente)       Mensaje del servidor-->"+mensaje);
        
        salidaServidor = new DataOutputStream(cs.getOutputStream());
        
        for (int i = 0; i < 2; i++) {
            salidaServidor.writeUTF(" Que pex desde el cliente " + (i+1) + "\n");
        }
        
        //cerrar la comunicacion
        cs.close();
    }
    
    public static void main(String[] args)throws Exception {
        startClient();
    }
}
