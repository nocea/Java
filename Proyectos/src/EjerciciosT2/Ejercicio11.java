package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String []array= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		String dia;
		int avanzar;
		int diaSemana=0;
		do {
			do {
		System.out.print("Introduce un dia de la semana(fin=salir): ");
		dia=scan.next();
		switch (dia) {
		case "Lunes","lunes":diaSemana=0;			
			break;
		case "Martes","martes":diaSemana=1;			
			break;
		case "Miercoles","miercoles","miércoles","Miércoles":diaSemana=2;			
			break;
		case "Jueves","jueves":diaSemana=3;			
			break;
		case "viernes","Viernes":diaSemana=4;			
			break;
		case "Sábado","sábado","Sabado","sabado":diaSemana=5;			
			break;
		case "Domingo","domingo":diaSemana=6;			
			break;
		case "Fin","fin":diaSemana=7;			
			break;	
			default:System.out.println("Valor introducido no válido.");diaSemana=-1;
				break;
		}
			}while(diaSemana==-1);
		if(diaSemana!=7) {	
		do {
		System.out.print("Introduce el numero de dias a avanzar:");
		avanzar=scan.nextInt();
		if (avanzar<=0) {
			System.err.println("\nEl numero tiene que ser mayor que 0");			
			}
		}while(avanzar<=0);
		System.out.println("Dentro de "+avanzar+" dias será "+array[SiguienteDia(diaSemana,avanzar)]);
		}
		}while(diaSemana!=7);
		
		System.out.println("Gracias por usar el programa");
	}
	public static int SiguienteDia(int dia,int diaAvanzar) {
		int proximoDia;
	 proximoDia=(dia+diaAvanzar)%7;
	 return proximoDia;
	 
		
	}

}
