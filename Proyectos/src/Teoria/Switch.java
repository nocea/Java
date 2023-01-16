package Teoria;

import java.util.Iterator;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		System.out.print("Introduce un mes: ");
		Scanner scan=new Scanner(System.in);
		mes=scan.nextInt();
		switch	(mes) {
		case 1,3,5,7,8,10,12:System.out.println("El mes "+mes+" tiene 31 dias");
		break;
		case 2:System.out.println("El mes tocapelotas");
		break;
		default: System.out.println("El mes "+mes+" tiene 30 dias");
		}
		int inicio=0;
		int fin=20;
		while (inicio<=fin) {
			
			System.out.print(inicio+" ");
			inicio+=5;	
		}
		System.out.println();
		for (int comienzo=0; comienzo<=fin;comienzo+=5) {
			System.out.print(comienzo+" ");
			
		}
	}

}
