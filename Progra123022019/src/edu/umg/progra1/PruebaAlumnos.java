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
public class PruebaAlumnos {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        
        a1.nombre="Kevin";
        a1.setCarne("10044");
        a2.nombre="Sheyla";
        a2.setCarne("2434");
        a1.estudiar();
        //a2=a1;
        a2.asignarCurso();
    }
   
}
