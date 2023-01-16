package Teoria;

import java.util.Scanner;

public class Utilidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce tu nombre: ");
		Scanner scan= new Scanner(System.in);
		String miNombre;
		miNombre=scan.next();
		System.out.println(miNombre);
		System.out.println("Introduce un numero: ");
		int numeroLectura1=scan.nextInt();
		System.out.println("Introduce otro numero: ");
		int numeroLectura2=scan.nextInt();
		int suma=numeroLectura1+numeroLectura2;
		System.out.println("La suma de los dos numeros es igual a: "+suma);
		boolean comparacion=numeroLectura1<numeroLectura2;
		System.out.println(comparacion);
		System.out.println("Adios,"+miNombre);

	}

}
