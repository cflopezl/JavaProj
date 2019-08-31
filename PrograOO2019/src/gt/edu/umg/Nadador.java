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
public class Nadador extends Atleta{
    private int medallas;
	private final int BONO_X_MEDALLAS=500;
        
        public Nadador() {
		// TODO Auto-generated constructor stub
	}

	public Nadador(String nombre, int medallas) {
		super(nombre);
		this.medallas=medallas;
	}
			
	public int getMedallas() {
		return medallas;
	}

	public void setMedallas(int medallas) {
		this.medallas = medallas;
	}

	@Override
	public double getSueldo(){
		if (medallas>=3) 
				return super.getSueldo()+getMedallas()*BONO_X_MEDALLAS;
		else
			return  super.getSueldo();
	}
}
