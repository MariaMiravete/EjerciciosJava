package Ejercicios2;

import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {


		Scanner teclado=new Scanner(System.in);
		int n, max, min;

		System.out.println("introduce ");
		n=teclado.nextInt();
		max=n;
		min=n; 

		for (int i=1; i<5; i++){
			System.out.println("introduce ");
			n=teclado.nextInt();
			if (n>=max)	{
				max=n;
			}

			if (n<=min)	{
				min=n;
			}
		}
		System.out.println("maximo: " + max);
		System.out.println("minimo: " + min);
	}
}
