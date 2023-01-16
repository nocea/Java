package EjerciciosT2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class setEjemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>s1=new HashSet<Integer>();
		
		
		s1.add(8);
		s1.add(9);
		s1.add(-5);
		
		
		LinkedList<Integer> l1= new LinkedList<Integer>();
		//foreach
		for(int i:s1) {
			System.out.println(i+" ");
		}
		System.out.println(s1);
		
		//TreeSet (con orden alfabetico o por tamaño)
		TreeSet<String> tr1= new TreeSet<String>();
		tr1.add("altair");
		tr1.add("hola3");
		tr1.add("hola");
		
		System.out.println(tr1);
		//LinkedHashSet mantiene el orden en el que se añaden
		LinkedHashSet<Double> lh1= new LinkedHashSet<Double>();
		lh1.add(3.2);
		lh1.add(-5.0);
		lh1.add(-89.0);
		lh1.add(3.3);
		System.out.println(lh1);

	}
	/*Operación           array           List                        Set
	Declaración         int [] a;       List<Integer> v;          Set<Integer> c;
	Inicialización   a = {2, 30, 24}  v = new ArrayList<Integer>(); c = new HashSet<Integer>()
	Tamaño               a.length         v.size()                 c.size()
	Acceso a una celda     a[i]          v.get(i)                 No es posible
	Modificación de
	una celda             a[i] = e;       v.set(i, e)             No es posible
	Añadir elementos No es posible       v.add(i, e)               v.add(i, e)
	Eliminar
	elementos          No es posible    v.remove(e)                v.remove(e)*/

}
