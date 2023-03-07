package Controladores;
import Servicios.InterfazMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Import de clases que necesito
import Entidades.Alumnos;
import Servicios.ImplMenu;
import Servicios.InterfazMenu;
import Servicios.ImplAlumno;
import Servicios.InterfazAlumno;
public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancios las interfaces
		InterfazMenu intMenu =new ImplMenu();
		InterfazAlumno intAlumnos=new ImplAlumno();
		//creo una lista que servira como base de datos
		List<Alumnos> listaAlumnos=new ArrayList<>();
		int opcion=0;
		//Este bucle funciona mientras que la opcion no sea la de salida (4).
		do {
			Scanner opcionCaptura =new Scanner(System.in);
			//presento el menú de opciones
			intMenu.MENU();
			opcion=opcionCaptura.nextInt();
			switch (opcion) {
					case 1://Matricular alumno
							intAlumnos.AlumnoNuevo(listaAlumnos);
						break;
					case 2://Borrar Alumno
							intAlumnos.BorrarAlumno(listaAlumnos);
						break;
					case 3://Listar Alumnos
							intAlumnos.ListarAlumnos(listaAlumnos);
						break;
					case 4://Salir
							System.out.println("Gracias por usar la aplicación");
						break;
					default:
						System.out.println("Esa opción no está en el menú");
						break;
				}
			
			}while(opcion!=4);							
	}
}


