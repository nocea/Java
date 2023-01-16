package Ejercicios;

import java.util.Scanner;

public class EjercB {

	public static void main(String[] args) {
		int numero=0;
		int contador=0;
		char [] letraDNI= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		Scanner scan =new Scanner(System.in);
		
			do {
			System.out.print("Introduce el número de tu dni: ");
			numero=scan.nextInt();
			if (numero<10000000||numero>99999999) {
				System.err.println("Valor no válido");
			}
			}while(numero<10000000||numero>99999999);
			int letra=numero%23;
			char letraDni=letraDNI[letra];
			System.out.println("DNI Completo: "+numero+"-"+letraDni);

	}

}
