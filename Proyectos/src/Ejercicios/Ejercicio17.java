package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.print("Introduce un número a acertar: ");
		Scanner scan=new Scanner(System.in);
		int numAcertar=scan.nextInt();
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
		System.out.println("Has acertado, el número era " + numAcertar+".");
		

	}

}
