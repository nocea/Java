package Ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Abase,Bpotencia;
		System.out.print("Introduzaca un número por pantalla: ");
		Scanner scan=new Scanner(System.in);
		Abase=scan.nextInt();
		System.out.print("Introduzca un segundo numero por pantalla: ");
		Bpotencia=scan.nextInt();
		int total=1;
		
		while (Bpotencia> 0) {
            total = total * Abase;//la potencia se reduce cada vez que se hace una multiplicacion.
            Bpotencia--;}
		System.out.println("El resultado es: "+ total);
		
		
	}

}
