/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.arboles;

/**
 *
 * @author C-Lo 12
 */
public class Test {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        try{
            arbol.insertar(new Alumno(50,"Paulino"));
            arbol.insertar(new Alumno(25,"William"));
            arbol.insertar(new Alumno(17,"Annabella"));
            arbol.insertar(new Alumno(75,"Mirsa"));
        }catch(Exception e){
            e.printStackTrace();
        }
            
           
    }
}
