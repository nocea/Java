package Teoria;
import java.util.ArrayList;
import java.util.List;
public class colecciones_y_metodos {

	public static void main(String[] args) {
	List<Integer> l1;
	l1=new ArrayList<Integer>();
	 	l1.add(7);
	 	l1.add(3);
	 	l1.add(10);
	 	l1.add(24);
	 	System.out.println("Elementos de la lista");
	 	for (int i = 0; i <=l1.size(); i++) {
	 		System.out.println(l1);		
		}
	 	//Eliminar elementos
	 	l1.remove(3);
	 	l1.remove(0);
	 	//Elementos de la lista una vez
	 	System.out.println("Elemento de la lista una vez");
	 	int j=0;
	 	while(j<l1.size()) {
	 		System.out.println(l1.get(j));
	 		j++;
	 	}
	 	//Elementos pares de la lista
	 	System.out.println("Elementos en posición par de la lista.");
	 	for (int i = 0; i <l1.size(); i+=2) {
	 		
	 		
	 		System.out.println(l1.get(i));
	 		}
	 	//Añadir a una lista a otra lista creada previamente.
	 	System.out.println("LISTA CREADA PREVIAMENTE");
	 	List<Integer>l2=new ArrayList<Integer>();
	 	l2.add(12);
	 	l2.add(-9);
	 	
	 	l1.addAll(l2);
	 	for (int i = 0; i < l1.size(); i++) {
	 		System.out.println(l1.get(i)+" ");
			
		}
	 	
	 	//APARTADO ARRAY
	 	System.out.println("tamaño del array");
	 	double[]a= {5.5,6.65,8,90.912,-5};
	 	String[]b=new String [2];
	 	System.out.println(b.length);
	 	
	}

}
