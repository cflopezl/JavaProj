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
public abstract class Logger {
    protected int mask;
    protected Logger next;
    
    public Logger setNext(Logger l){
        next = l;
        return this;
    }
    
    abstract public void mensaje(String msg, int priority);
    
}
