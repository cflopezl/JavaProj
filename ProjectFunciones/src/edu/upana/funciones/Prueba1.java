/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.funciones;

/**
 *
 * @author C-Lo 12
 */
public class Prueba1 {
    
    public static void pintarNombre(String pNombre, int pEdad){
        System.out.println("Nombre: "+pNombre+", edad:"+pEdad);
    }
     
    public static void main(String []args){
        String nombre;
        int edad;
        
        //1. asignar valores
        nombre = "Kely";
        edad = 19;
        //2. mostrar esta informacion en pantalla
        pintarNombre(nombre,edad);    
        edad +=10;
        pintarNombre(nombre,edad);  
    }
}
