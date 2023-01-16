package Ejercicios;

import java.util.Scanner;

public class EjercE {

	public static void main(String[] args) {
		String[][] palabrasBidimensional=new String[3][2];
		Scanner scan =new Scanner(System.in);
		String palabra="";
		for(int x = 0; x < palabrasBidimensional.length; x++) { 
			for (int y = 0; y < palabrasBidimensional[x].length; y++) {
				do {
				System.out.print("Introduce una palabra de la fila "+x+" y columna "+ y+":");
			 palabra=scan.next();
				
				if(palabra.length()>4||palabra.length()<8) {
					palabrasBidimensional[x][y]=palabra;
				}
				else {
					System.err.println("Muy larga o muy corta");
				}
				}while(palabra.length()<4||palabra.length()>8);
			} 
			}
		System.out.println("El array bidimensional es: ");
		for(int x = 0; x < palabrasBidimensional.length; x++) { 
			for (int y = 0; y < palabrasBidimensional[x].length; y++) { 
			System.out.print(palabrasBidimensional[x][y]+" ");} }
		
		

	}

}
