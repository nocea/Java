package Servicios;
import java.util.List;

import Entidades.Repostaje;
public interface InterfazRepostaje {
	/*
	 * Se crea un Impl y una Interfaz por cada uno de los controladores y de entidades que tenga
	 */
	/*
	 * En la interfaz solo se definen las cabeceras de los metodos.
	 */
	public List<Repostaje> RepostajeNormal(List<Repostaje> bd);
	public List<Repostaje> RepostajeFactura(List<Repostaje> bd);
	public List<Repostaje> EliminarRepostaje(List<Repostaje> bd);
	public void ListarRepostajes(List<Repostaje> bd);
}
