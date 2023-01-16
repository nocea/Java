package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int numSemana;
		String dia;
		do {
			System.out.println("Introduce un dia de la semana [1...7]:");
			numSemana=scan.nextInt();
			if (numSemana<1||numSemana>7) {
				System.out.println("Numero fuera de rango");
			}
			else {
				dia=DevuelveDia(numSemana);
				System.out.println("El dia "+numSemana+" es "+dia);
			}
			
		}while (numSemana<1||numSemana>7);

	}
	static String DevuelveDia(int numero) {
		String dia="";
		switch (numero) {
		case 1:
			dia="Lunes";
			
			break;
		case 2:
			dia="Martes";
			
			break;
		case 3:
			dia="Miercoles";
			
			break;
		case 4:
			dia="Jueves";
			
			break;
		case 5:
			dia="Viernes";
			
			break;
		case 6:
			dia="Sabado";
			
			break;
		case 7:
			dia="Domingo";
			
			break;
			

		
		}
		return dia;
		
	}

}
