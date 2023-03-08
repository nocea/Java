package Servicios;
import java.util.List; 

import Entidades.Alumnos;
public interface InterfazAlumno {
	//Interfaz que define los métodos para el control de alumnos.
	//Cabecera para crear Alumnos
		public List<Alumnos> AlumnoNuevo(List<Alumnos>bd);
	//Cabecera para borrar Alumnos
		public List<Alumnos> BorrarAlumno(List<Alumnos>bd);
	//Cabecera para Listar todos los Alumnos
		public void ListarAlumnos(List<Alumnos> bd);
	
}
