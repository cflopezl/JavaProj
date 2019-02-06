/**
 * 
 * @author chlopez
 * @version 1.0.0
 */
public class Nodo{
    private Object dato;
    private Nodo sig;

    public Nodo(Object dato){
        this.dato = dato;
        this.sig = null;
    }

    public Object getDato(){
        return dato;
    }

    public void setDato(Object dato){
        this.dato=dato;
    }

    public Nodo getSig(){
        return this.sig;
    }

    public void setSig(Nodo sig){
        this.sig=sig;
    }
}