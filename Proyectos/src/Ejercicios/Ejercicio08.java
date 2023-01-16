package Ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un numero del 1 al 7: ");
		int num=scan.nextInt();
		if (num<1||num>7)System.err.println("Error tiene que introducir un numero valido");
		else {
			switch(num) {
			case 1: System.out.println("Ha elegido: Lunes");
			break;
			case 2: System.out.println("Ha elegido: Martes");
			break;
			case 3: System.out.println("Ha elegido: Miércoles");
			break;
			case 4: System.out.println("Ha elegido: Jueves");
			break;
			case 5: System.out.println("Ha elegido: Viernes");
			break;
			case 6: System.out.println("Ha elegido: Sábado");
			break;
			case 7: System.out.println("Ha elegido: Domingo");
			break;
			
			
			
			
			
			}
			
			
			
		}
	}

}
