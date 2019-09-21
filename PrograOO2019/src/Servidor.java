
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
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
public class Servidor {
    public static final int PUERTO = 1234;
    public static ServerSocket ss;
    public static Socket cs;
    public static DataOutputStream salidaCliente;
    
    public static void startServer() throws Exception{
        //1. Crear el socket servidor y dejarlos escuchando
        ss = new ServerSocket(PUERTO);
        cs = new Socket();
        System.out.println("(SERVIDOR) Escuchando ...");
        cs = ss.accept();
        System.out.println("(SERVIDOR) El cliente se conecto exitosamente");
        salidaCliente = new DataOutputStream(cs.getOutputStream());
        salidaCliente.writeUTF("Bienvenido la conexión fue Exitosa!!!\n");
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String mensaje;
        
        while((mensaje = entrada.readLine())!=null){
            System.out.println("(SERVIDOR)      -->"+mensaje);
        }
        
        
        //n. Cerrar el socket o que deje de escuchar
        ss.close();
    }
    
    public static void main(String[] args) throws Exception{
        startServer();
    }
}
