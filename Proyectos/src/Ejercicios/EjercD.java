package Ejercicios;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class EjercD {

	public static void main(String[] args) {
		LinkedList<Integer> lista1=new LinkedList<Integer>();
		int numero=0;
		for (int i = 0; i <=20; i++) {
			numero=(int)(Math.random() * (10 - 1 + 1)) + 1;
			lista1.add(numero);
		}
		System.out.println("Lista Original");
		System.out.println(lista1);
		TreeSet<Integer> lista2=new TreeSet<Integer>(lista1);
		lista1.addAll(lista2);
		System.out.println("Lista sin elementos repetidos");
		System.out.println(lista2);

	}

}
