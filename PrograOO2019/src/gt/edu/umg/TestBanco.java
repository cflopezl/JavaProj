/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg;

import java.util.Set;

/**
 *
 * @author C-Lo 12
 */
public class TestBanco {
    public static void main(String[] args) {
        CuentaAhorro ctaOrdonez = new CuentaAhorro();
        CuentaAhorro ctaMA = new CuentaAhorro();
        
        ctaOrdonez.setNoCuenta("123456789");
        ctaOrdonez.setNombreCuenta("David Ordoñez");
        ctaMA.setNoCuenta("111111111");
        ctaMA.setNombreCuenta("Marco Antonio");
        
       
        System.out.println(ctaOrdonez);
        System.out.println(ctaMA);
        
        ctaOrdonez.copiar(ctaMA);
        
        System.out.println(ctaOrdonez);
        
        ctaOrdonez.setNombreCuenta("Ordoñez");
        System.out.println(ctaOrdonez);
        
        ctaOrdonez.setNoCuenta(ctaMA.getNoCuenta());
    }
}
