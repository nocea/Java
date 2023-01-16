package Ejercicios;
import java.util.Scanner;

public class EjercA {

	public static void main(String[] args) {
		int numero;
		Scanner scan =new Scanner(System.in);
		do {
			System.out.print("Introduce un numero entre 5 y 20: ");
			numero=scan.nextInt();
			if (numero>20||numero<5) {
				System.err.println("valor fuera de rango");
			}
			
		}while (numero>20||numero<5);
		for (int i = 1; i <=numero; i++) {
			System.out.print(i+" ");
			
		}
		for (int i = numero-1; i > 0; i--) {
			System.out.print(i+" ");
		}

	}

}
