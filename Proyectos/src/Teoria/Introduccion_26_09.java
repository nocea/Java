package Teoria;

import java.util.Scanner;

public class Introduccion_26_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Impresion por pantalla
		//Se crea la variable de tipo scanner para introducir valores por teclado.
		Scanner scan= new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero: ");
		numero= scan.nextInt();
		System.out.println(numero);
		//casting a int
		int numero1=1;
		double b=2.5;
		numero1=(int)b;
		System.out.println(numero1);
		
		//Definicion de una constante
		final int constante=7;
		
		
	}

}
