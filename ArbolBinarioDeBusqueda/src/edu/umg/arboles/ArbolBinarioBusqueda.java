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
public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public ArbolBinarioBusqueda(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public ArbolBinarioBusqueda(){
        this.raiz=null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void insertar(Object valor) throws Exception{
        Comparador dato = (Comparador)valor;
        raiz = insertar(raiz, dato);
        
    }
    
    public Nodo insertar(Nodo raizSub, Comparador dato)throws Exception{
        if(raizSub == null)
            raizSub = new Nodo(dato);
        else if(dato.menorQue(raizSub.getDato())){
            Nodo iz = insertar(raizSub.getIzq(),dato);
            raizSub.setIzq(iz);
        }else if(dato.mayorQue(raizSub.getDato())){
            Nodo dr;
            dr = insertar(raizSub.getDer(),dato);
            raizSub.setDer(dr);
        }
        else throw new Exception("Nodo duplicado");
        return raizSub;
    }
}
