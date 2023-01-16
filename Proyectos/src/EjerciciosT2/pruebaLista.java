package EjerciciosT2;

import java.util.ArrayList;
import java.util.Iterator;

public class pruebaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayBidimensional1=new int[3][3];
		arrayBidimensional1[0][0]=10;
		arrayBidimensional1[0][1]=20;
		arrayBidimensional1[1][0]=30;
		arrayBidimensional1[1][1]=40;
		arrayBidimensional1[2][0]=50;
		arrayBidimensional1[2][1]=60;
		arrayBidimensional1[2][2]=70;
		for(int x = 0; x < arrayBidimensional1.length; x++) { 
			for (int y = 0; y < arrayBidimensional1[x].length; y++) { 
			System.out.println(arrayBidimensional1[x][y]);} }
		
		
		
	}

}





/*
(int)(Math.random() * (MAX - MIN + 1)) + MIN;
----PRIMO---
public static boolean esPrimo(int num) {
	    boolean esPrimo=true;	    
	    if (num==0||num==1||num==4) {
	        return false;
	    }  
	    for(int i=2;i<num;i++) {
	        if (num%i==0) {
	            return false;
	        }
	    }
	    return esPrimo;
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
	elementos          No es posible    v.remove(e)                v.remove(e)
.toLowerCase()                                   .sort() ordena elementos
añade un algo en la posicion que quieras lista l1.add(posicion,lo que quieras añadir);
Iterator<String> it = diasSemana.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
//Bucle for each
		int[] primos= {2,3,5,7};
		
		for(int var:primos) {
			System.out.println(var);
		}
int[][] arrayBidimensional1=new int[filas][columnas];
for(int x = 0; x < arrayBidimensional1.length; x++) { 
			for (int y = 0; y < arrayBidimensional1[x].length; y++) { 
			System.out.println(arrayBidimensional1[x][y]);} }
*/










/*
(int)(Math.random() * (MAX - MIN + 1)) + MIN;
----PRIMO---
public static boolean esPrimo(int num) {
	    boolean esPrimo=true;	    
	    if (num==0||num==1||num==4) {
	        return false;
	    }  
	    for(int i=2;i<num;i++) {
	        if (num%i==0) {
	            return false;
	        }
	    }
	    return esPrimo;
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
	elementos          No es posible    v.remove(e)                v.remove(e)
	
.toLowerCase()                                   .sort() ordena elementos

añade un algo en la posicion que quieras lista l1.add(posicion,lo que quieras añadir);

Iterator<String> it = diasSemana.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
//Bucle for each
		int[] primos= {2,3,5,7};
		
		for(int var:primos) {
			System.out.println(var);
		}
		
int[][] arrayBidimensional1=new int[filas][columnas];
for(int x = 0; x < arrayBidimensional1.length; x++) { 
			for (int y = 0; y < arrayBidimensional1[x].length; y++) { 
			System.out.println(arrayBidimensional1[x][y]);} }
*/






















