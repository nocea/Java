package Servicios;

import java.util.List;
import java.util.Scanner;

import Entidades.Alumnos;

public class ImplAlumno implements InterfazAlumno {

	@Override
	public List<Alumnos> AlumnoNuevo(List<Alumnos> bd) {
		//Constructor vacio
		Alumnos nuevoAlumno=new Alumnos();
		Scanner scanAtributos=new Scanner(System.in);
		String nombre,apellidos,marca,modelo;
		int telefono;
		//Obtengo los datos
		//nombre
			System.out.print("Introduce el nombre del alumno: ");
				nombre=scanAtributos.next();
		//apellidos
			System.out.print("Introduce los apellidos del alumno: ");
				apellidos=scanAtributos.next();
		//telefono
			System.out.print("Introduce un teléfono de contacto: ");
				telefono=scanAtributos.nextInt();
		//marca
			System.out.print("Introduce la marca del portátil: ");
				marca=scanAtributos.next();
		//modelo
			System.out.print("Introduce el modelo del portátil: ");
				modelo=scanAtributos.next();
		//Los guardo en un alumno nuevo con el constructor vacio
		nuevoAlumno.setNombre(nombre);
		nuevoAlumno.setApellidos(apellidos);
		nuevoAlumno.setTelefono(telefono);
		nuevoAlumno.setMarca(marca);
		nuevoAlumno.setModelo(modelo);
		//Aqui llamo al método "CrearIdPortatil" para generar un string con para ese atributo.
		nuevoAlumno.setIdPortatil(CrearIdPortatil(nuevoAlumno));
		//Añado el nuevo objeto a la lista(base de datos)
		bd.add(nuevoAlumno);
		return bd;
	}
	//Este método sirve para poder crear un string para el idPortatil
	private String CrearIdPortatil(Alumnos alumno) {
		String idPortatil;
		/*Con los gets de marca y modelo utilizo solo las tres primeras letras de cada string con el método substring
		  y las concateno en el mismo String*/
			idPortatil=alumno.getMarca().substring(0, 3)+"-"+alumno.getModelo().substring(0, 3);
		//Devuelvo el string ya concatenado
		return idPortatil;
	}
	

	@Override
	//Borra un objeto Alumno de la lista según su posición en la misma.
	public List<Alumnos> BorrarAlumno(List<Alumnos> bd) {
		Scanner scanID= new Scanner(System.in);
			System.out.print("Introduce la id del alumno: ");
			//Elimino de la lista el id de esa posición.
				bd.remove(scanID.nextInt()-1);
		return bd;
	}

	@Override
	//Muestra toda la lista
	public void ListarAlumnos(List<Alumnos> bd) {
		System.out.println("----Listado De Alumnos----");
		for (int i = 0; i < bd.size(); i++) {
			System.out.println("ID:"+(i+1)+", Nombre: "+bd.get(i).getNombre()+", Apellidos: "+bd.get(i).getApellidos()+
					", Teléfono: "+bd.get(i).getTelefono()+" , ID_Portatil: "+bd.get(i).getIdPortatil());
		}
		System.out.println("----Fin Listado De Alumnos----");
		
	}

}
