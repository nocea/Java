package EjerciciosT2;

import java.util.Iterator;
import java.util.LinkedList;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//1º apartado
		LinkedList<String> diasSemana = new LinkedList<String>();
		diasSemana.add("lunes");
		diasSemana.add("Martes");
		diasSemana.add("Miércoles");
		diasSemana.add("Jueves");
		diasSemana.add("Viernes");
		diasSemana.add("Sábado");
		diasSemana.add("Domingo");
		
		//2º apartado
		diasSemana.add(4, "Juernes");
		
		for(int i=0;i<diasSemana.size();i++) {
			System.out.print(diasSemana.get(i)+" ");
		}
		System.out.println();
		
		//3º apartado
		LinkedList<String> diasSemanaCopia=new LinkedList<String>(diasSemana);
		for(int j=0;j<diasSemanaCopia.size();j++) {
			System.out.print(diasSemana.get(j)+" ");
		}
		System.out.println();
		
		//4º apartado
		diasSemana.addAll(diasSemanaCopia);
		for(int k=0;k<diasSemana.size();k++) {
			System.out.print(diasSemana.get(k)+" ");
		}
		System.out.println();
		
		//5º apartado
		System.out.print(diasSemana.get(3)+" "+diasSemana.get(4)+"\n");
		
		//6º apartado
		System.out.println(diasSemana.getFirst()+" "+diasSemana.getLast());
	
		//7º apartado adaptado
		//Vamos a borrar todos los elementos Juernes (2)
		System.out.println();
		LinkedList<String>listaEliminar=new LinkedList<String>();
		listaEliminar.add("Juernes");
		
		if(diasSemana.removeAll(listaEliminar))
			System.out.println("Se ha borrado el elemento Juernes");
		else
			System.out.println("No existe el elemento Juernes");
		
		for(int l=0;l<diasSemana.size();l++) {
			System.out.print(diasSemana.get(l)+" ");
		}
		System.out.println();
		
		//8º apartado
		Iterator<String> it = diasSemana.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//9º apartado
		if(diasSemana.contains("Lunes"))
				System.out.print("En la lista original hay al menos un elemento que se llama lunes");
		System.out.println();
		
		//10º apartado
		if((diasSemana.contains("Lunes"))||(diasSemana.contains("lunes"))){
				System.out.print("En la lista original hay al menos un elemento que se llama lunes, sin importar si está en mayúscula o minúscula\n");
		}
		
		//Ordena alfabéticamente, primero las que empiezan por mayúscula y después la que empiezan por minúscula
		diasSemana.sort(null);
		for(int m=0;m<diasSemana.size();m++) {
			System.out.print(diasSemana.get(m)+" ");
		}
		System.out.println();
		
		//11º apartado
		diasSemana.clear();
		for(int n=0;n<diasSemana.size();n++) {
			System.out.print(diasSemana.get(n)+" ");
		//No muestra nada porque la lista es vacía (clear)
		}
	}
	
		
	

}