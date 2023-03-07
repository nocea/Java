package Servicios;

public class ImplMenu implements InterfazMenu {

	@Override
	//Método que sirve para poder mostrar un ménu básico de opciones
		public void MENU() {
			System.out.println("1.Matricular Alumno");
			System.out.println("2.Borrar Alumno");
			System.out.println("3.Listar Alumnos");
			System.out.println("4.Salir");
			System.out.print("Introduzca una opción de las siguientes: ");	
		}

}
