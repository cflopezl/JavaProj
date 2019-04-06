/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivotexto;

import java.io.*;

/**
 *
 * @author C-Lo 12
 */
public class ManipularArchivo {
    public static void main(String[] args) {
        try{
            File f = new File("c:\\temp\\");
            System.out.println(""+f.length());
            String [] arreglo = f.list();
            for(int i=0; i<arreglo.length; i++)
                System.out.println(arreglo[i]);
        }catch(Exception e){
            e.printStackTrace();
        }
           
    }
}
