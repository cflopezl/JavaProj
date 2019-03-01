/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upana.funciones;

import java.util.Scanner;

/**
 *
 * @author C-Lo 12
 */
public class CalcularCubo {
    
    public static int potencia(int base){

        return (int) Math.pow(base, 3);
    }
    
    public static void main(String[] args) {
        String continuar="S";
        int base;
        Scanner scanner = new Scanner(System.in);
        
        while(continuar.equals("S")){
            //1. requerir la base
            System.out.print("Ingrese la base: ");
            base = scanner.nextInt();
            //2. Ejecutar la operación
            System.out.println("El resultado es: " + potencia(base));
            //3. Requerir si desea continuar
            System.out.print("Desea continuar (S/N): ");
            continuar = scanner.next();
        }
    }
}
