/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umg.dao;

import java.io.Serializable;

/**
 *
 * @author C-Lo 12
 */
public class ShoppingProducto implements Serializable{
    Producto producto;
    int cantidad;
    
    public ShoppingProducto(String codigo, String nombre, double precio, int cantidad){
        producto = new Producto(codigo,nombre,precio);
        this.cantidad=cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
