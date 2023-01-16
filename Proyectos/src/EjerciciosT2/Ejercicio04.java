package EjerciciosT2;

public class Ejercicio04 {

	public static void main(String[] args) {
		int[]a=new int[100];
		int suma=0;
		for (int i = 1; i < a.length; i++) {
			a[i]=i;
			System.out.print(a[i]+" ");
			suma+=a[i];
			
		}
		System.out.println("\nSuma: "+suma);
		System.out.println("Media: "+suma/a.length);
		

	}

}
