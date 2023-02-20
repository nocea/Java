package APKGasolinera;

import java.util.List;
//util para poder obtener la fecha
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GasolineraExtra {
	//Atributos
	private String fecha;
	private double litros;
	private double importe;
	private String dni;
	private String matricula;
	private boolean facturaONormal;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isFacturaONormal() {
		return facturaONormal;
	}
	public void setFacturaONormal(boolean facturaONormal) {
		this.facturaONormal = facturaONormal;
	}
	//Getters and Setters
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public GasolineraExtra RepostajeNormal(){
		//creo una nueva gasolinera
		GasolineraExtra gasolineraVacia=new GasolineraExtra();
		//pongo una variable que me da la fecha actual
		String fechaActual = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm:ss a").format(LocalDateTime.now());
		//se piden los datos
		System.out.print("Introduce la cantidad de litros: ");
		Scanner scanLitros=new Scanner(System.in);
		double litros=scanLitros.nextDouble();
		System.out.print("Introduce el importe: ");
		Scanner scanImporte=new Scanner(System.in);
		double importe=scanImporte.nextDouble();
		//se cambian los datos de la nueva gasolinera
		gasolineraVacia.setLitros(litros);
		gasolineraVacia.setImporte(importe);
		gasolineraVacia.setFecha(fechaActual);
		gasolineraVacia.setFacturaONormal(false);
		//se devuelve la nueva gasolinera
		return gasolineraVacia;
	}
	public GasolineraExtra RepostajeFactura(){
		//creo una nueva gasolinera
		GasolineraExtra gasolineraVacia=new GasolineraExtra();
		String fechaActual = DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm:ss a").format(LocalDateTime.now());
		//se piden los datos
		System.out.print("Introduce tu dni: ");
		Scanner nuevoDni=new Scanner(System.in);
		String dni=nuevoDni.next();
		System.out.print("Introduce tu matricula: ");
		Scanner nuevaMatricula=new Scanner(System.in);
		String matricula=nuevoDni.next();		
		System.out.print("Introduce la cantidad de litros: ");
		Scanner scanLitros=new Scanner(System.in);
		double litros=scanLitros.nextDouble();
		System.out.print("Introduce el importe: ");
		Scanner scanImporte=new Scanner(System.in);
		double importe=scanImporte.nextDouble();
		
		//se cambian los datos de la nueva gasolinera
		gasolineraVacia.setLitros(litros);
		gasolineraVacia.setImporte(importe);
		gasolineraVacia.setFecha(fechaActual);
		gasolineraVacia.setDni(dni);
		gasolineraVacia.setMatricula(matricula);
		gasolineraVacia.setFacturaONormal(true);
		//se devuelve la nueva gasolinera
		return gasolineraVacia;
	}
	public void VerRepostajes(List<GasolineraExtra> bd) {
		//declaro variables para guardar despues dentro del bucle
		String dni;
		String matricula;
		double importe;
		double litros;
		String fecha;
		int opcion=0;
		//pregunto que repostajes mostrar
		System.out.print("Que repostajes quiere mostrar[1.NORMAL---2.FACTURA---3.TODOS]: ");
		Scanner scan =new Scanner(System.in);
		opcion=scan.nextInt();
		switch (opcion) {
			//si es repostaje normal
			case 1:
				System.out.println("--------Repostajes Normales--------");
				for (int i = 0; i < bd.size(); i++) {
					importe=bd.get(i).getImporte();
					litros=bd.get(i).getLitros();
					fecha=bd.get(i).getFecha();
						//en caso de false va a mostrar solo los normales
						if(bd.get(i).isFacturaONormal()==false)
							System.out.println("ID: "+i+"-->Fecha: "+fecha+" Importe: "+importe+" Litros: "+litros);
							
				}
				break;
			//si es repostaje con factura
			case 2:
				System.out.println("--------Repostajes con Factura--------");
				for (int a = 0; a < bd.size(); a++) {
					importe=bd.get(a).getImporte();
					litros=bd.get(a).getLitros();
					fecha=bd.get(a).getFecha();
					dni=bd.get(a).getDni();
					matricula=bd.get(a).getMatricula();
						if(bd.get(a).isFacturaONormal()==true)
							System.out.println("ID: "+a+"-->Fecha: "+fecha+" DNI: "+dni+" Matricula: "+matricula+" Importe: "+importe+" Litros: "+litros);
			}
				break;
			case 3:
				System.out.println("--------Todos los repostajes--------");
				for (int y = 0; y < bd.size(); y++) {
					importe=bd.get(y).getImporte();
					litros=bd.get(y).getLitros();
					fecha=bd.get(y).getFecha();
					dni=bd.get(y).getDni();
					matricula=bd.get(y).getMatricula();
					System.out.println("ID: "+y+"-->Fecha: "+fecha+" DNI: "+dni+" Matricula: "+matricula+" Importe: "+importe+" Litros: "+litros);
				}
				break;
			}
		
		}
	public List<GasolineraExtra> EliminarRepostaje(List<GasolineraExtra> bd){
		int idIntroducir;
		System.out.print("Introduce el id del repostaje que desea eliminar:");
		Scanner scanID=new Scanner(System.in);
		idIntroducir=scanID.nextInt();
		bd.remove(idIntroducir);
		return bd;
	}
	//Modificar un repostaje
	public List<GasolineraExtra> ModificarRepostaje(List<GasolineraExtra> bd){
		//Se pide que repostaje se quiere modificar
		int idIntroducir;
		int modificar;
		System.out.print("Introduzca el id del repostaje para modificarlo: ");
		Scanner scanID=new Scanner(System.in);
		idIntroducir=scanID.nextInt();
		//Se pide que se necesita modificar del repostaje
		System.out.println("¿Qué necesita modificar del repostaje?");
		System.out.println("1-->Litros");
		System.out.println("2-->Importe");
		System.out.println("3-->DNI");
		System.out.println("4-->Matricula");
		Scanner scanOpcion=new Scanner(System.in);
		modificar=scanOpcion.nextInt();
		switch (modificar) {
		//En cada caso muestro el valor actual de cada campo y pido el nuevo valor,posteriormente lo actualizo.
		case 1:
			Scanner scanLitros=new Scanner(System.in);
			double nuevosLitros;
			System.out.println("Litros actuales--> "+bd.get(idIntroducir).getLitros());
			System.out.print("Introduzca el nuevo valor: ");
			nuevosLitros=scanLitros.nextDouble();
			bd.get(idIntroducir).setLitros(nuevosLitros);
			
			break;
		case 2:
			Scanner scanImporte=new Scanner(System.in);
			double nuevoImporte;
			System.out.println("Importe actual--> "+bd.get(idIntroducir).getImporte());
			System.out.print("Introduzca el nuevo valor: ");
			nuevoImporte=scanImporte.nextDouble();
			bd.get(idIntroducir).setImporte(nuevoImporte); 
			
			break;
		case 3:
			Scanner scanDNI=new Scanner(System.in);
			String nuevoDNI;
			System.out.println("Dni actual--> "+bd.get(idIntroducir).getDni());
			System.out.print("Introduzca el nuevo valor: ");
			nuevoDNI=scanDNI.next();
			bd.get(idIntroducir).setDni(nuevoDNI);
			//Lo cambio para que sea factura para que al mostrarlo aparezca en la lista de repostajes con factura si no lo era antes.
			bd.get(idIntroducir).setFacturaONormal(true);
				
			break;
		case 4:
			Scanner scanMatricula=new Scanner(System.in);
			String nuevoMatricula="";
			System.out.println("Matricula actual--> "+bd.get(idIntroducir).getMatricula());
			System.out.print("Introduzca el nuevo valor: ");
			nuevoDNI=scanMatricula.next();
			bd.get(idIntroducir).setMatricula(nuevoMatricula);
			bd.get(idIntroducir).setFacturaONormal(true);
			
			break;
		}
		//actualizo la fecha a cuando se ha hecho la modificación.
		bd.get(idIntroducir).setFecha(DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm:ss a").format(LocalDateTime.now()));
		System.out.println("!Cambiado¡");	
		
		
		return bd;
	}
	
	}

