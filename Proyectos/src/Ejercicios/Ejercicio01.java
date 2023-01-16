package Ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un número entero por pantalla: ");
		int numero=scan.nextInt();
		if (numero%2==0) System.out.println("El numero "+numero+" es par");
		else System.out.println("El número "+numero+" es impar");
		
		
		

	}

}
