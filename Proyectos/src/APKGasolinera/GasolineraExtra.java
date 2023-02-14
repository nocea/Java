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
		System.out.println("Introduce el id del repostaje que desea eliminar:");
		Scanner scanFecha=new Scanner(System.in);
		idIntroducir=scanFecha.nextInt();
		bd.remove(idIntroducir);
		return bd;
	}
	//FALTA EL METODO PARA MODIFICAR UN REPOSTAJE
	}

