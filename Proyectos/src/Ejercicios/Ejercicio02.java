package Ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un número entero por pantalla: ");
		int numero=scan.nextInt();
		if (numero%10==0) System.out.println("El número "+numero+" es múltiplo de 10");
		else System.out.println("El número "+numero+" no es múltiplo de 10");

	}

}
