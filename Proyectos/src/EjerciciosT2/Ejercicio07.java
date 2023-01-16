package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.print("Introduce el tamaño del array: ");
		Scanner scan =new Scanner(System.in);
		int tamaño=scan.nextInt();
		int [] array=new int [tamaño];
		
		RellenaArray(0,9,array);
		

	}
	static void RellenaArray(int min,int max,int[]array) 
	{ int suma=0;
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=(int) (Math.random() * (max + 1 - min)) + min;
			suma+=array[i];
            System.out.println(i+") "+array[i]);
		}
		System.out.println("Suma: "+suma);
	}

}
