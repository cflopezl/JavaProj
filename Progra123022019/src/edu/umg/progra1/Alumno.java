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
public class Alumno {
    private String carne;
    public String nombre;
    public int edad;
    
    public void setCarne(String pCarne){
        
        carne = pCarne;
    }
    
    public void estudiar(){
        System.out.println(nombre + " Estudiando..." + carne);
    }
    
    public void asignarCurso(){
        System.out.println(nombre + " Asignando cursos");
    }
}
