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
public class Atleta {
    	private int id;
	private String nombre;
	private double sueldo;
	private static int idCorrelativo=1;
	private final double SUELDO_BASE=3500;
        
        public Atleta() {
	}

	public Atleta(String nombre) {
		super();
		this.id = idCorrelativo++;
		this.nombre = nombre;
		this.sueldo = SUELDO_BASE;		
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void entrenar(){
		System.out.println("Yo " + getNombre() + " estoy entrenando!"); 
	}
    
}
