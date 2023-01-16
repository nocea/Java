package Ejercicios;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio=10;
		int fin=70;
		
			while(inicio<=fin) {
				if(inicio%3==0)
					System.out.print(inicio+" ");
				inicio+=1;	
			}
			/*CON FOR contando los multiplos y no presentandolos.
			  int contador=0;
			  for(int inicio=10;inicio<=70;inicio++){
			  if(inicio%3==0)contador++;
			  }
			  System.out.print("Números múltiplos de 3: "+contador);*/
	}
	}


