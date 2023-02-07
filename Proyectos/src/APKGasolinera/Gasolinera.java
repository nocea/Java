package APKGasolinera;

import java.util.List;
import java.util.Scanner;

public class Gasolinera {
	//Atributos
	private String fecha;
	private double litros;
	private double importe;
	private String dni;
	private String matricula;
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
	public Gasolinera RepostajeNormal(){
		Gasolinera nuevo=new Gasolinera();
		System.out.println("Introduce la cantidad de litros :");
		Scanner scanLitros=new Scanner(System.in);
		double litros=scanLitros.nextDouble();
		System.out.println("Introduce el importe :");
		Scanner scanImporte=new Scanner(System.in);
		double importe=scanImporte.nextDouble();
		//Por aqui----------------------------------------------------------------------
		String fecha=
		nuevo.setLitros(litros);
		nuevo.setImporte(importe);
		nuevo.setFecha(fecha);
		return nuevo;
	}

}
