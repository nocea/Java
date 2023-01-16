package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char opcion;
		do {
		System.out.println("Introduce la operación que quieres realizar");
		System.out.print("Suma=s, ");
		System.out.print("Resta=r, ");
		System.out.print("Multiplicacion=m, ");
		System.out.print("Division=d, ");
		System.out.print("Resto=c, ");
		System.out.print("Final del programa=f: ");
		opcion=scan.next().charAt(0);
		
		
		System.out.println("Introduce el primer numero: ");
		int num1=scan.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int num2=scan.nextInt();		
		switch(opcion) 
		{
		case 's': 
			System.out.println(num1+num2);
			break;
		case 'r':System.out.println(num1-num2);
			break;
		case 'm':System.out.println(num1*num2);
			break;
		case 'd':System.out.println(num1/num2);
			break;
		case 'c':System.out.println(num1%num2);
			break;
		case 'f':System.out.println("Ha elegido salir");
			break;
			default:System.err.println("Opcion no valida");			
		}
		}while(opcion!='f');
		System.out.println("Gracias por usar la calculadora.");
	}

}
