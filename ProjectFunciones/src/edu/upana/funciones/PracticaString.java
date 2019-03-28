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
public class PracticaString {
    public static void main(String[] args) {
        String valor="estadio";
        for (int i = valor.length()-1; i >= 0 ; i--) {
            System.out.print(valor.charAt(i));
        }
    }
}
