package Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercC {

	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		int numeroIntroducido=0;
		Scanner scan =new Scanner(System.in);
		do {
			System.out.print("Introduce un numero positivo (si no lo es no se añade)[-1=salir]: ");
			numeroIntroducido=scan.nextInt();
			if(numeroIntroducido>0) {
				numeros.add(numeroIntroducido);
			}
			
			if(numeroIntroducido==-1) {
				System.out.println("Ha terminado de introducir numeros");
			}
		}while (numeroIntroducido!=-1);
		
		System.out.println("Numeros pares de la lista:");
		for(int i:numeros) {
			if(i%2==0)
				System.out.print(i+" ");			
		}
		System.out.println("\nNumeros que no son multiplos de 3");
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.get(i)%3==0) {
				numeros.remove(i);
			}
			
		}
		System.out.println(numeros);
		
		
		
	}

}
