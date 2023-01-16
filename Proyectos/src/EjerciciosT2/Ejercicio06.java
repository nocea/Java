package EjerciciosT2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fraseUsuario;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca una frase: ");
		fraseUsuario=scan.next();
		
		char[] fraseUsuarioChar;
		fraseUsuarioChar=fraseUsuario.toCharArray();
		int i =0;
		while(i<fraseUsuarioChar.length) {
			System.out.println(fraseUsuarioChar[i]);
			i++;
		}
	}

}
