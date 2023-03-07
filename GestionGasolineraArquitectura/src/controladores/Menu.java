package controladores;
import java.util.ArrayList;
import java.util.List;

import Entidades.Repostaje;
import Servicios.ImplMenu;
import Servicios.ImplRepostaje;
import Servicios.InterfazMenu;
import Servicios.InterfazRepostaje;
public class Menu {
/*
 * Aqui se llama a los métodos de los servicios(acciones)
 * pero primero se instancia para poder utilizarlos
 */
	public static void main(String[] args) {
		InterfazMenu intMenu =new ImplMenu();
		InterfazRepostaje intRepostaje=new ImplRepostaje();
		List<Repostaje> bd=new ArrayList<>();
		intRepostaje.RepostajeFactura(bd);
	}

}
