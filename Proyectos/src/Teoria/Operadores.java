package Teoria;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//operdores aritmeticos
		int martes=0;
		martes=martes+5;//suma
		martes=martes-9;//resta
		martes*=2;//multiplicacion
		martes/=8;//division
		martes=martes%1;//resto
		System.out.println(martes);
		//operadores lógicos
		boolean b1=(5==6)&&(7==7);
		boolean b2=('a'=='b')||(5==5);
		boolean b3=!("Hola"=="HoLa");
		System.out.println(b1+" "+b2+" "+b3);
		//operadores relacionales
		//operadores de asignacion
		float cc=0;
		int dd;
		dd=0;
		cc++;
		cc++;
		dd--;
		float suma=0;
		suma=cc+dd;
		System.out.println(suma);
	}

}
