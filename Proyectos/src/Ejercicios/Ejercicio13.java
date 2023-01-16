
package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int num=0;
		do {
			Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num=scan.nextInt();
		if(num<0)System.out.println("Negativo");
		else if(num>0)System.out.println("Positivo");
		
		}while(num!=0);

	}

}

