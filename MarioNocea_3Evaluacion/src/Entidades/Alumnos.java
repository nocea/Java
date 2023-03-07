package Entidades;

public class Alumnos {
	//Atributos
	
	private String nombre="aaaaaaaaa";
	private String apellidos="aaaaaaaaa";
	private int telefono=0;
	private String idPortatil="aaaaaaaaa";
	private String marca="aaaaaaaaa";
	private String modelo="aaaaaaaaa";
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getIdPortatil() {
		return idPortatil;
	}
	public void setIdPortatil(String idPortatil) {
		this.idPortatil = idPortatil;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/*No uso toString porque me parece mas claro eliminar los ids de los alumnos según su posicion en la lista y al mostrarlos esta
	  no sale en el toString*/
	
	
	
}
