/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.OutputStream;
import java.io.FileOutputStream;
/**
 *
 * @author C-Lo 12
 */
public class AdministrarProducto {
    public static final String PATH="C:\\temp\\";
    
    public static void escribirRegistro(){
        int id=3500;
        String nombre="Coca cola 750 ml";
        float precio=7.0f;
        try{
            //1. abrir/crear el arhivo 
            OutputStream aSalida = new FileOutputStream(PATH+"productos.inf",true);
            
            //2. escribir el registro

            //2.1 asignar los valores al registro
            String registro =""+id+"~"+nombre+"~"+precio;
            //2.2 calcular el tamaño del registro
            int tamanio = registro.length();
            registro = tamanio+registro;
            //2.3 guardar el registro en el archivo
            aSalida.write(registro.getBytes());
            
            //3. cerrar el archivo
            aSalida.close();
        }catch(Exception e){
            //e.printStackTrace
            System.out.println(""+e.getMessage());
        }
    }
    
    public static void leerRegistro(){
        
    }
    
    public static void main(String[] args) {
        leerRegistro();
    }
}
