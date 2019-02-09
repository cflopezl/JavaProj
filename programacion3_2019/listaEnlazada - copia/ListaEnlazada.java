import java.util.Date;

public class ListaEnlazada{

    private Nodo inicio;

    public ListaEnlazada(){
        inicio=null;
    }

    public boolean estaVacia(){
        return inicio==null;
    }

    public void agregarInicio(Object dato){
        //1. crear Nodo
        Nodo nuevo = new Nodo(dato);
        //2. revisar si la lista no esta vacia
        if(!estaVacia())
            nuevo.setSig(inicio);
        //3. el nuevo nodo es el inicial de la lista
        inicio = nuevo;
    }

    public void eliminarInicio(){
        //1.cambiar inicio al segundo nodo
        if(!estaVacia())
            inicio = inicio.getSig();
    }

    public void recorrer(){
        Nodo temp = inicio;
        while(temp!=null){
            //1.mostar el dato
            System.out.print(temp.getDato().toString()
            +" -> ");
            //2. cambiar el apuntador al siguiente nodo
            temp=temp.getSig();
        }
        System.out.println("");
    }

    public static void main(String[] args){
        ListaEnlazada lista1 = new ListaEnlazada();

        lista1.agregarInicio("OLA KE ASE");
        lista1.agregarInicio(new Integer(12));
        lista1.agregarInicio(new Date());
        lista1.recorrer();
        lista1.eliminarInicio();
        lista1.recorrer();
    }
}






