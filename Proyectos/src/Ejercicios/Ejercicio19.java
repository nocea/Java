package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra: ");
		Scanner scan=new Scanner(System.in);
		String palabra=scan.next();
	
		
		for (int i =0 ; i < palabra.length(); i++) {
			System.out.println("Letra "+(i+1)+": "+palabra.substring(i,i+1));
			
		}
			
		}
	}


