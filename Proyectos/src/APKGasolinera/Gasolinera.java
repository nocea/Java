package APKGasolinera;

import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class Gasolinera {
	//Atributos
	private Date fecha;
	private double litros;
	private double importe;
	private String dni;
	private String matricula;
	//Getters and Setters
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
	public Gasolinera RepostajeNormal(){
		//creo una nueva gasolinera
		Gasolinera gasolineraVacia=new Gasolinera();
		Date fechaActual=new Date();
		//se piden los datos
		System.out.println("Introduce la cantidad de litros :");
		Scanner scanLitros=new Scanner(System.in);
		double litros=scanLitros.nextDouble();
		System.out.println("Introduce el importe :");
		Scanner scanImporte=new Scanner(System.in);
		double importe=scanImporte.nextDouble();
		//se cambian los datos de la nueva gasolinera
		gasolineraVacia.setLitros(litros);
		gasolineraVacia.setImporte(importe);
		gasolineraVacia.setFecha(fechaActual);
		//se devuelve la nueva gasolinera
		return gasolineraVacia;
	}
	public Gasolinera RepostajeFactura(){
		//creo una nueva gasolinera
		Gasolinera gasolineraVacia=new Gasolinera();
		Date fechaActual=new Date();
		//se piden los datos
		System.out.println("Introduce tu dni: ");
		Scanner nuevoDni=new Scanner(System.in);
		String dni=nuevoDni.next();
		System.out.println("Introduce tu matricula: ");
		Scanner nuevaMatricula=new Scanner(System.in);
		String matricula=nuevoDni.next();		
		System.out.println("Introduce la cantidad de litros :");
		Scanner scanLitros=new Scanner(System.in);
		double litros=scanLitros.nextDouble();
		System.out.println("Introduce el importe :");
		Scanner scanImporte=new Scanner(System.in);
		double importe=scanImporte.nextDouble();
		
		//se cambian los datos de la nueva gasolinera
		gasolineraVacia.setLitros(litros);
		gasolineraVacia.setImporte(importe);
		gasolineraVacia.setFecha(fechaActual);
		gasolineraVacia.setDni(dni);
		gasolineraVacia.setMatricula(matricula);
		//se devuelve la nueva gasolinera
		return gasolineraVacia;
	}
	public void VerRepostajes(List<Gasolinera> bd) {
		String dni;
		String matricula;
		double importe;
		double litros;
		Date fecha;
		for (int i = 0; i <bd.size(); i++) {
			dni=bd.get(i).getDni();
			matricula=bd.get(i).getMatricula();
			importe=bd.get(i).getImporte();
			litros=bd.get(i).getLitros();
			fecha=bd.get(i).getFecha();
			 if(matricula==null||dni==null) {
				 System.out.println("Repostaje Normal--> Fecha: "+fecha+"; Importe: "+importe+"; Litros:"+litros);
			 }
			 else
				 System.out.println("Repostaje Factura--> Fecha: "+fecha+"; DNI: "+dni+"; Matricula: "+matricula+"; Importe: "+importe+"; Litros:"+litros);
		}
	}

}
