/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.progra1;

/**
 *
 * @author C-Lo 12
 */
public class Prueba {
    
    public static void pintarDatos(String pNombre, int pEdad){
        String informacion="Nombre: "+pNombre+", edad:"+pEdad;
        System.out.println(informacion);
        pNombre="Christian";
    }
    
    public static void main(String[] args) {
        int edad;
        String nombre;
        
        edad=26;
        nombre="Angel";
        pintarDatos(nombre, edad);
        
        /*edad=21;
        nombre="Fernando";
        pintarDatos(nombre, edad);
        pintarDatos("Mario",28);*/
    }
           
}
