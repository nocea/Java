package Ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Introduce un numero: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int factorial=1;
		if(num==0) {System.out.println("El factorial de cero es 1");}
		else {
			
			//inicializo la i igualando la al numero introducido 7 por ejemplo.
			//facorial es 1 siempre,lo igualo a factorial y lo multiplico por i que es el 
			//el primer numero quedaria 1*7 y se guarda en factorial.
			//la i va bajando de uno en uno el seguiente seria 7*6 y se guarda 
			//el siguiente 42*5 (uno menos)y asi hasta llegar al 1 por la condicion del for
			//que hace que la i no sea menor que 1.
		for (int i=num;i>0;i--) {
			
			
			factorial=factorial*i;
		}
		System.out.println(factorial);
			
			
			
		}
	}
			
			
			
		
	}


