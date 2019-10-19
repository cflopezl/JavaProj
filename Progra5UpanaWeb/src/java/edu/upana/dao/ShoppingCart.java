/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.dao;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author C-Lo 12
 */
public class ShoppingCart implements Serializable{
    ArrayList<ShoppingProducto> lstProducto;
    
    public ShoppingCart(){
        lstProducto = new ArrayList<ShoppingProducto>();
    }

    public ArrayList<ShoppingProducto> getLstProducto() {
        return lstProducto;
    }
    
    public void add(ShoppingProducto shProducto){
        lstProducto.add(shProducto);
    }
}
