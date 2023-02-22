package Prueba_Tercera_Evaluacion;

import java.util.Scanner;

public class Dni {
	//Atributos
	private char letra;
	private int numero;
	//Getters y Setters
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letraSeleccionada) {
		this.letra = letraSeleccionada;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	//Métodos
	public Dni GeneraDni() {
		Dni dniNuevo=new Dni();
		char [] arrayLetras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		int numeroDni=-1;
		while(numeroDni<0||numeroDni>99999999) {
			System.out.println("Introduce un nuevo numero de dni");
			Scanner scanDni=new Scanner(System.in);
			numeroDni=scanDni.nextInt();
		}
		
			int numeroLetra=numeroDni%23;
			char letraSeleccionada=arrayLetras[numeroLetra];
			dniNuevo.setLetra(letraSeleccionada);
			dniNuevo.setNumero(numeroDni);
			return dniNuevo;
	}
	public void MuestraDni(Dni dniNuevo) {
		System.out.println("Su dni ha sido calculado: "+dniNuevo.getNumero()+"-"+dniNuevo.getLetra());
	}
	

}
