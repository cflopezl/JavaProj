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
public class Futbolista extends Atleta{
    private boolean mundial;
    private final int BONO_MUNDIAL=10000;
    
    public Futbolista() {
		// TODO Auto-generated constructor stub
	}

	public Futbolista(String nombre, boolean mundial) {
		super(nombre);
		this.mundial=mundial;
	}
			
	public boolean getMundial() {
		return mundial;
	}

	public void setFinal(boolean mundial) {
		this.mundial = mundial;
	}

	@Override
	public double getSueldo(){
		if (mundial) 
				return super.getSueldo()+BONO_MUNDIAL;
		else
			return  super.getSueldo();
	}
}
