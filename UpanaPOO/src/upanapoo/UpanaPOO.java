/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upanapoo;

/**
 *
 * @author C-Lo 12
 */
public class UpanaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        Alumno a3 = new Alumno();
        //Alumno []arregloDeInt = new Alumno[30];
        a1.nombre = "Kely Quevedo";
        a1.setEdad((byte)19);
        a2.nombre = "José Carrillo";
        a2.setEdad((byte)20);
        a2.mostrarDetalles();
        a1.mostrarDetalles();
        a2.mostrarDetalles();
        a3.setEdad((byte)41);
        a3.nombre="Christian";
        a3.mostrarDetalles();
    }
    
}
