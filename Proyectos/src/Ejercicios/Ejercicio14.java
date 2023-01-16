
package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int num=0;
		do {
			Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num=scan.nextInt();
		if(num==0)System.out.println();
		else {
		if(num%2==0)System.out.println("Par");	
		else if(num%2!=0)System.out.println("Impar");}
		
		}while(num!=0);

	}

}

