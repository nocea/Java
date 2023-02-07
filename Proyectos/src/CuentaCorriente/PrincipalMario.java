package CuentaCorriente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrincipalMario {

	public static void main(String[] args) {
		//Instancio Cuenta Corriente
		CuentaCorrienteMario cuenta=new CuentaCorrienteMario();
		//Lista que funciona como base de datos ,se guardaran todas las cuentas.
		List listaCcc =new ArrayList<CuentaCorrienteMario>();
		//menú
		int opcion=0;
		do {
		Scanner opcionCaptura =new Scanner(System.in);
		MENU();
		opcion=opcionCaptura.nextInt();
		
		switch (opcion) {
		case 1: 
			//Se llama al metodo de crear cuenta y se añade a la base de datos.
			listaCcc.add(cuenta.CrearCuenta());
			System.err.println("Se ha creado la cuenta.");
			break;
		case 2:
			//En la lista se guarda la nueva lista con el ingreso ya hecho.
			listaCcc=cuenta.IngresarDinero(listaCcc);
			break;
		case 3:
			listaCcc=cuenta.SacarDinero(listaCcc);
			break;
		case 4:
			System.out.println(cuenta.MostrarCuenta(listaCcc));
	
		case 5:
			System.out.println("Gracias por usar la aplicación del banco");
		}
		}while(opcion!=5);
		
//		muestra todas las cuentas para pruebas
//		for (int i = 0; i < listaCcc.size(); i++) {
//			System.out.println(listaCcc.get(i));
//		}

	}
	static void MENU() {
		//método que muestra el menu de la aplicacion por pantalla
		System.out.println("-----MENÚ-----");
		System.out.println("1->Crear Cuenta");
		System.out.println("2->Ingreso");
		System.out.println("3->Retirada");
		System.out.println("4->Mostrar Datos de tu cuenta");
		System.out.println("5->Salir de la aplicación");
	}

}
