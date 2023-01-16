package Ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduce una letra: ");
		char letra=scan.nextLine().charAt(0);
		if (Character.isUpperCase(letra)) System.out.println("La letra está en mayúsculas");
		else System.out.println("La letra está en minusculas");

	}

}
