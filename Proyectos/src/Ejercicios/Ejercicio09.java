package Ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Ejercicio09 {

	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduce un mes del 1 al 12: ");
		int mes=scan.nextInt();
		if (mes<1||mes>12)
			System.err.println("Error introduce un mes válido.");
		
		else {
			switch(mes)	{
			case 1,3,5,7,8,10,12:System.out.println("El "+mes+"tiene 31 dias");
			break;
			
			case 4,6,9,11:System.out.println("El "+mes+"tiene 30 dias");
				break;
			case 2:System.out.print("Dime un año para saber los dias de Febrero:");
			int año=scan.nextInt();
			if(calendar.isLeapYear(año))System.out.println("Febrero tiene 29 dias");
			else System.out.println("Febrero tiene 28 dias");
					
			
			
			}
			//if (calendar.isLeapYear(año))
		
		}
		
		
		
		
		}

	}


