package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		double  numAcertar = (int)(Math.random()*((20-(-20))+1))+(-20);
		System.out.println((int)numAcertar);
		int numElegido;
		do {
			System.out.print("Acierta el número: ");
			numElegido=scan.nextInt();
			if(numElegido<numAcertar) {
				System.out.println("Tu número es menor");
			}
			else if(numElegido>numAcertar) {
				System.out.println("Tu número es mayor");
			}
			
		}while(numAcertar!=numElegido);
		System.out.println("Has acertado, el número era " + (int)numAcertar+".");
		
	}

}
