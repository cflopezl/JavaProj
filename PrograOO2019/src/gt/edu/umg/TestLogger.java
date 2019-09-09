/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg;

/**
 *
 * @author C-Lo 12
 */
public class TestLogger {
    public static void main(String[] args) {
        //definicion del Patrón cadena de responsabilidad
        Logger cadena= new Pantalla(1).setNext(new Archivo(2).setNext(new Correo(3)));
        
        cadena.mensaje("El saldo de la cuenta es insuficiente", 1);
        
        cadena.mensaje("Contraseña inválida",2);
        
        cadena.mensaje("La base de datos no está activa", 3);
    }
}
