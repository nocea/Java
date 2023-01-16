package EjerciciosT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.print("Cuantos numeros quiere introducir: ");
		Scanner scan=new Scanner(System.in);
		//Guardo el numero de numeros que quiero introducir
		int numeros=scan.nextInt();
		int numeros2=0;
		List<Integer> l1;
		l1=new ArrayList<Integer>();
		//Guardo los elementos en la lista
		for (int i = 0; i < numeros; i++) {
			System.out.print("Introduzca el numero de la posición "+i+": ");
			numeros2=scan.nextInt();
			l1.add(numeros2);
		}
		System.out.print("(");
		//Presento la lista
		for (int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");
			
		}
		System.out.print(")");
		

	}

}
