/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.funciones;

/**
 *
 * @author C-Lo 12
 */
public class ManejoArreglos {
    public static void main(String[] args) {
        int[][] arreglo = {
            {1,2,3,4},
            {10,11,12,13},
            {101,102,103,104},
            {1100,1200,1300,1400}
        };
        
        for (int i = 0; i < 4; i++) {
            System.out.println(arreglo[i]);
        }
        //System.out.println(arreglo[3]);
    }
}
