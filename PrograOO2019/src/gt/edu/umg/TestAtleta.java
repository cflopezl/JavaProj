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
public class TestAtleta {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
		Atleta []delegacionGt = new Atleta[5];
                delegacionGt[0] = new Atleta("Juan Maegli");
                //1.0 Futbolista
		delegacionGt[1] = new Futbolista("Carlos Ruiz", true);
		delegacionGt[2] = new Futbolista("Jose Manuel Contreras", false);
                //1.0 Esto es polimorfismo, porque una variable de un tipo se covierte en otro (clase derivada), aunque sigue siendo de tipo Atleta
		delegacionGt[3] = new Nadador("Pedro López",2);
		delegacionGt[4] = new Nadador("Gisela Morales",8);
                
                for(Atleta temp : delegacionGt){
			System.out.println(temp.getId() + ". " + temp.getNombre() + " gana " + temp.getSueldo());			
		}
    }
}
