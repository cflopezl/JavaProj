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
public class Maestro implements Comparador {
    private String nombre;

    public Maestro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean igualQue(Object q) {
        Maestro temp = (Maestro)q;
        return this.nombre.equals(temp.nombre);
    }

    @Override
    public boolean menorQue(Object q) {
        return true;
        }

    @Override
    public boolean mayorQue(Object q) {
        return true;
    }
    
}
