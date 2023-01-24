package CuentaBancaria;

import java.util.ArrayList;
import java.util.List;

/*
 * Modelo de las cuentas corrientes
 * */
public class CuentaBancaria {
	/*
	 *Si no definimos ningún constructor por campos,
	 *se puede utilizar el constructor vacio por defecto.
	 *En el momento que se defina un constructor por campos
	 *específico,si se quiere usar el constructor por defecto
	 *será necesario definirlo.
	 */
	//Atributos de la clase
	/*
	 *Private: solo la misma clase podrá acceder a atributos de forma directa.
	 */
	private String dni;
	private String nombreTitular;
	private double saldo;
	//Getters(recibir valor) y Setters(modificar valor)Forma de poder acceder a los campos en private.
	/*
	 *Se utilizara para que software externo a la clase pueda tener acceso a 
	 *los atributos.
	 **/
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
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//Métodos(acciones)
	public void crearCuenta() {
	}
	public double ingresoCuenta(){
		return 0.0;
		
	}
	public ArrayList<CuentaBancaria> muestraCuentaUsuario(String dni){
		return null;
	}
	public boolean sacarDinero(int dineroSacar) {
		return true;
	}
}


