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
public class Alumno{
    public String carne;
    String nombre;
    private byte edad;
    
    public void setEdad(byte pEdad){
        edad = pEdad;
    }
    
    public void mostrarDetalles(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
    }
    
}
