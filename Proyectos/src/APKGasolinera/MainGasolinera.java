package APKGasolinera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CuentaCorriente.CuentaCorrienteMario;

public class MainGasolinera {

	public static void main(String[] args) {
				Gasolinera nuevaGasolinera=new Gasolinera();
				List repostajes =new ArrayList<Gasolinera>();
				int opcion=0;
				do {
				Scanner opcionCaptura =new Scanner(System.in);
				MENU();
				opcion=opcionCaptura.nextInt();
				switch (opcion) {
				case 1:
					//repostaje normal
					repostajes.add(nuevaGasolinera.RepostajeNormal());
					break;
				case 2:
					//repostaje factura
					break;
				case 3:
					//ver todos los repostajes
					break;
				case 4:	
					//salir de la aplicacion
					break;
				}
				}while(opcion!=4);
				for (int i = 0; i < repostajes.size(); i++) {
					System.out.println(repostajes.get(i));
				}
				
	}
	static void MENU() {
		System.out.println("--------MENÚ--------");
		System.out.println("1-->Repostaje Normal");
		System.out.println("2-->Repostaje factura");
		System.out.println("3-->Ver todos los repostajes");
		System.out.println("4--->Salir de la Gasolinera");
	}

}
