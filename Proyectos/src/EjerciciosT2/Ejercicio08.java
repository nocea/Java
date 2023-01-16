package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio08 {
 static int MIN=1;static int MAX=100;
	public static void main(String[] args) {
		System.out.print("Introduce el tamaño del array: ");
		Scanner scan =new Scanner(System.in);
		int tamaño=scan.nextInt();
		int [] array=new int [tamaño];
		MuestraArray(array);
		int mayor=ArrayMayor(array);
		System.out.println("Mayor= "+mayor);
		
	}
	static int NumeroAleatorio(int min,int max) {
		int numero;
		int valido=0;
		
			
		
	    numero=(int) (Math.random() * (MAX + 1 - MIN)) + MIN;
	    if(esPrimo(numero)) {
	    	valido=numero;
	    }
	    return valido;
	    
	    
		
			
		
		
		
	}
	static boolean esPrimo(int numero) {
		    for(int i=2;i<numero;i++) {
		        if(numero%i==0)
		            return false;
		    }
		    return true;
		}	
	static void MuestraArray(int[]array)
	{
		for (int i = 0; i < array.length; i++) {
			array[i]=NumeroAleatorio(MIN,MAX);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);			
		}
	}
	static int ArrayMayor(int[]array) 
	{
		int mayor=MIN;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>mayor) {
				mayor=array[i];
			}
			
		}
		return mayor;
	}
}
