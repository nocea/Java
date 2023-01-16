package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int nota=0;
		do {
		System.out.print("Introduce un número entre 0 y 10: ");
		Scanner scan=new Scanner(System.in);
		nota=scan.nextInt();
		
		
		switch(nota) {
		case 0,1,2,3,4: System.out.println("Insuficiente");
		break;
		case 5:System.out.println("Suficiente");
		break;
		case 6:System.out.println("Bien");
		break;
		case 7,8:System.out.println("Notable");
		break;
		case 9:System.out.println("Sobresaliente");
		break;
		case 10:System.out.println("Matricula");
		break;
		}
		}while(nota>=0&&nota<=10);
		System.err.println("FIN DEL PROGRAMA");
	}

}
