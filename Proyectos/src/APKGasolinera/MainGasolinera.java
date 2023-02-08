package APKGasolinera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CuentaCorriente.CuentaCorrienteMario;

public class MainGasolinera {

	public static void main(String[] args) {
		//instancio la clase nueva
		Gasolinera nuevaGasolinera=new Gasolinera();
		//creo la lista que usare como base de datos momentanea.
		List<Gasolinera> repostajes =new ArrayList<Gasolinera>();
		int opcion=0;
		do {
			Scanner opcionCaptura =new Scanner(System.in);
			//presento el menú de opciones
			MENU();
			opcion=opcionCaptura.nextInt();
			switch (opcion) {
					case 1:
					//repostaje normal
					repostajes.add(nuevaGasolinera.RepostajeNormal());
						break;
					case 2:
					//repostaje factura
					repostajes.add(nuevaGasolinera.RepostajeFactura());
						break;
					case 3:
					//ver todos los repostajes
					nuevaGasolinera.VerRepostajes(repostajes);
						break;
					case 4:	
					//salir de la aplicacion
					System.out.println("Gracias por usar la gasolinera");
						break;
				}
			}while(opcion!=4);							
	}
	//metodo simple que muestra un menu orientativo.
	static void MENU() {
		System.out.println("--------MENU--------");
		System.out.println("1-->Repostaje Normal");
		System.out.println("2-->Repostaje factura");
		System.out.println("3-->Ver todos los repostajes");
		System.out.println("4-->Salir de la Gasolinera");
	}

}
