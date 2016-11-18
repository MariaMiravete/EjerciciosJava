package Ejercicios;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main (String[]parametre){

		Scanner leer = new Scanner(System.in);
		int x=0;
		int z=0;
		int n=0;
		float y=0f;
		int maximo=-999999999;
		int minimo=999999999;
		System.out.println("Introduce un numero entero");
		n=leer.nextInt();
		while(n!=0){


			if(n<=minimo)
			{
				minimo=n;	 
			}
			if(n>=maximo)
			{
				maximo=n;	
			}
			x=x+n;
			z=z+1;
			System.out.println("Introduce un numero entero");
			n=leer.nextInt();
		}
		if(z==0){
			System.out.println("Error, no hay datos");
		}
		else{
			y=(float)x/z;

			System.out.println("la media es "+y);
			System.out.println("El maximo es "+maximo);
			System.out.println("El minimo es "+minimo);


		}


	}
}