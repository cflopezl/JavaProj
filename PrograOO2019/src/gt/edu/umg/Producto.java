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
public class Producto {
    public static int count=1;
    public int id;
    public String nombre;

    public Producto(String nombre) {
        this.id = Producto.count;
        this.nombre = nombre;
        Producto.count++;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    public static void main(String[] args) {
        Producto azucar = new Producto("azucar");
        Producto cereal = new Producto("cereal");
        Producto leche = new Producto("leche");
        
        System.out.println(azucar);
        System.out.println(leche);
        System.out.println(cereal);
        
    }
    
    
}
