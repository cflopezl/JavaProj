/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg;

/**
 *
 * @author C-Lo 12
 */
public class Archivo extends Logger{
    public Archivo(int mask){
        this.mask = mask;
    }
    
    public void mensaje(String msg, int priority){
        if(mask  <= priority){
            System.out.println("Guardando en archivo "+msg);
        }
        
        if(next != null)
            next.mensaje(msg, priority);
    }
    
}
