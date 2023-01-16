package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			
			System.out.print("Introduce un numero: ");
			Scanner scan= new Scanner(System.in);
			num=scan.nextInt();
			if(num<0)System.err.println("Fin del programa");
			else {
			int potencia=(int) Math.pow(num, 2);
			System.out.println("Elevado a dos: "+potencia);		
			}
		}while(num>=0);
	}

}
