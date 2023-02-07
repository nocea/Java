package CuentaCorriente;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CuentaCorrienteMario {
	//Declaración atributos clase
	private String dni;
	private String nombreTitular;
	private double saldo;
	private int contador;
	//Generar getters and setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double sumaSaldo) {
		this.saldo = sumaSaldo;
	}
	//Métodos
	//1.Crear una cuenta
	public CuentaCorrienteMario CrearCuenta() {
		//se crea una nueva cuenta con un nombre
		CuentaCorrienteMario CuentaVacia=new CuentaCorrienteMario();
		//se piden los datos que faltan
		Scanner scan =new Scanner(System.in);
		System.out.print("Introduce su DNI: ");
		String meterDNI=scan.next();
		System.out.print("Introduce su Nombre completo: ");
		String meterNombre=scan.next();
		//se cambian los atributos de la cuenta
		CuentaVacia.setDni(meterDNI);
		CuentaVacia.setNombreTitular(meterNombre);
		CuentaVacia.setSaldo(0);
		//se devuelve la cuenta con los atributos rellenos.
		return CuentaVacia;
	}
	//2.Ingresar dinero
	//devuelve la lista del tipo CuentaCorriente pero modificado el dato del saldo
	//Se le introduce la CuentaCorriente que querramos.
	//busco la cuenta por el dni en la lista
	public List<CuentaCorrienteMario> IngresarDinero(List<CuentaCorrienteMario> bd) {
		//Pido el dni para encontrar la cuenta y a partir de esa cuenta ya le cambio el saldo.
		Scanner encontrarDNI=new Scanner(System.in);
		System.out.print("Introduce su dni: ");
		String buscaDNI=encontrarDNI.next();
		if(BuscaCuenta(buscaDNI,bd)) {
			//Pido el ingreso
			Scanner ingreso=new Scanner(System.in);
			System.out.print("Introduce el saldo a ingresar: ");
			double ingresoBanco=ingreso.nextDouble();
			//Obtengo el saldo por el contador de la cuenta
			double saldoActual=bd.get(contador).getSaldo();
			//Lo sumo
			double sumaSaldo=saldoActual+ingresoBanco;
			//Actualizo el saldo en esa cuenta
			bd.get(contador).setSaldo(sumaSaldo);
		}
		else System.err.println("No se ha podido encontrar la cuenta con DNI: "+buscaDNI);
		return bd;	
	}
	public List<CuentaCorrienteMario> SacarDinero (List<CuentaCorrienteMario> bd){
		Scanner encontrarDNI=new Scanner(System.in);
		System.out.println("Introduce su dni: ");
		String buscaDNI=encontrarDNI.next();
		if(BuscaCuenta(buscaDNI,bd)) {
			Scanner retirar=new Scanner(System.in);
			System.out.print("Introduce el saldo a retirar: ");
			double saldoRetirar=retirar.nextDouble();
			double saldoCuenta=bd.get(contador).getSaldo();
			double saldoFinal=saldoCuenta-saldoRetirar;
			bd.get(contador).setSaldo(saldoFinal);
			System.out.println("Ha retirado "+saldoRetirar+" euros");
		}
		else System.err.println("No se ha podido encontrar la cuenta con DNI: "+buscaDNI);
		return bd;
	}
	
	public boolean BuscaCuenta (String DNI,List<CuentaCorrienteMario> bd) {
		//se declara un contador a 0
		contador=0;
		//recorro la lista en busca del dni que sea igual en ella.
		for (int i = 0; i < bd.size(); i++) {
			//Que significa la siguiente linea:
			//1.De la lista va buscando cada cuenta y de cada cuenta el dni y lo guarda en una variable.
			String nuevoDNI=bd.get(i).getDni();
			//2.Si el DNI que se ha guardado es igual al que se ha introducido devuelve true
			//Se usa el equals poque con == no funciona bien con strings.
			if(nuevoDNI.equals(DNI)) 
				return true;
			
			//Aumenta el contador cada vuelta hasta que se de true.
			contador++;
		}
		return false;
	}
	public String MostrarCuenta(List<CuentaCorrienteMario> bd){
		String datos="";
		Scanner encontrarDNI=new Scanner(System.in);
		System.out.println("Introduzca su dni: ");
		String buscaDNI=encontrarDNI.next();
		if(BuscaCuenta(buscaDNI,bd)) {
			String dni=bd.get(contador).getDni();
			String nombre=bd.get(contador).getNombreTitular();
			double saldo=bd.get(contador).getSaldo();
			datos=("Numero DNI: "+dni+"; NombreCompleto: "+nombre+"; Saldo: "+saldo);	 
		}
		else System.err.println("No se ha encontrado la cuenta.");
		return datos;
	}

}
