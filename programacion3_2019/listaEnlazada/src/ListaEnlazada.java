import java.util.Date;

public class ListaEnlazada{

    private Nodo inicio;
    private Nodo ultimo;

    public ListaEnlazada(){
        inicio=null;
        ultimo=null;
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
        else
            ultimo = nuevo;
        //3. el nuevo nodo es el inicial de la lista
        inicio = nuevo;
    }
    
    public void agregarFinal(Object dato){
        //escenario 1 la lista esta vacia
        if(estaVacia())
            agregarInicio(dato);
        else{
           //1. crear Nodo
            Nodo nuevo = new Nodo(dato); 
            //2. el siguiente del ultimo apunta al nuevo
            ultimo.setSig(nuevo);
            //3. el ultimo apunta al nuevo
            ultimo = nuevo;
        }
    }

    public void eliminarInicio(){
        //1.cambiar inicio al segundo nodo
        if(!estaVacia())
            inicio = inicio.getSig();
        if(inicio == null)
            ultimo = inicio;
    }

    public void eliminarFinal(){
        //1. Escenario cuando la lista tiene 1 nodo
        if(inicio==ultimo && inicio!=null){
            inicio=ultimo=null;
        }else if(!estaVacia()){
            //2. Escenario donde hay más de 1 nodo
            //2.1 encontrar penultimo
            Nodo penultimo = devolverPenultimo();
            //2.2 ultimo debe apuntar al penultimo
            this.ultimo=penultimo;
            //2.3 el siguiente del ultimo debe ser nulo
            ultimo.setSig(null);
        }

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
        
    public Nodo devolverPenultimo(){
        Nodo temp = inicio;
        while(temp.getSig()!=ultimo){
            //2. cambiar el apuntador al siguiente nodo
            temp=temp.getSig();
        }
        return temp;
    }
    
    

    public static void main(String[] args){
        ListaEnlazada lista1 = new ListaEnlazada();
        lista1.agregarFinal(50);
        lista1.agregarFinal(35);
        lista1.agregarFinal(5);
        //lista1.recorrer();
        lista1.eliminarFinal();
        lista1.eliminarFinal();
        lista1.eliminarFinal();
        //lista1.recorrer();
    }
}






