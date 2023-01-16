package EjerciciosT2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio12 {

	public static void main(String[] args) {
		int []array=new int[10];
		List<Integer> miLista = new ArrayList<Integer>();
		int numeroAleatorio;
		for (int i = 0; i < array.length; i++) {
			numeroAleatorio=(int)(Math.random()*(35-20+1)+20);
			array[i]=numeroAleatorio;
			if(array[i]>=25) {
				miLista.add(array[i]);
			}
			System.out.println(i+") "+array[i]);
			
		}
		System.out.println("Mayores de 25 del array");
		System.out.println("-----------------------");
		for (int i = 0; i < miLista.size(); i++) {
			System.out.println(i+") "+miLista.get(i));
		}

		
		

	}

}
