package Teoria;

public class Introduccion_20_09 {

	public static void main(String[] args) {
		
		//DECLARANDO VARIABLES
		int edad;//Numeros enteros cortos
		
		long distancia;//Numeros enteros largos
		
		float peso;//Numeros reales cortos
		double numeroDecimales;//Numeros reales largos
		
		boolean esPrimo;//Verdadero o falso
		String nombre;//Cadena de caracteres
		char letra;// Caracter o letra individual.
		/*EL TIPO VOID
		NO SE PUEDEN DECLARAR VARIABLES DEL TIPO VOID.(HASTA LOS METODOS)
		ES UN TIPO DE DATO QUE NO DEVUELVE NADA.*/
		
		/*DOS VARIABLES NO SE PUEDEN LLAMAR IGUAL AUNQUE
		AUNQUE SEAN DE DISTINTOS TIPOS
		EJ: long variable1
		    Long variable1 */
		
		//INICIALIZAR-ASIGNAR
		edad=10;
		numeroDecimales=123.13231231231231;
		esPrimo=true;
		nombre="Frase de ejemplo";
		letra='m';
		distancia=1231123123;
		peso=85.2f;
		//TIPOS DE PRINT
				System.out.print("Frase en una linea con print ");
				System.out.printf("%n%.2f%n%.3f%n",12.2698,5.1243123);/*se muestra un valor
				con un formato predetrminado, en este caso con los dos primeros 
				decimales y un salto de linea. 
				*/
		//EXPRESIONES
		    /*int a;
		    a=3*4/0;
		    System.out.println(a);ESTO DARIA UN ERROR DE EJECUCION YA QUE NO SE PUEDE HACER UNA DIVISION POR CERO.*/
			System.out.println(esPrimo);
			System.out.println(peso);
			System.out.println(distancia);
			System.out.println(letra);
			System.out.println(nombre);
			System.out.println(numeroDecimales);
			System.out.println(edad);
			System.out.println("Prueba de texto");

	}

}