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
public class Nodo {
    private Object dato;
    private Nodo izq;
    private Nodo der;
    
    public Nodo(Object dato){
        this.dato= dato;
        izq=der=null;
    }
    
    public Nodo(Object dato, Nodo izq, Nodo der){
        this.dato=dato;
        this.izq=izq;
        this.der=der;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    
}
