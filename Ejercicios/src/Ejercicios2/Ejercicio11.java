package Ejercicios2;

import java.util.Scanner;

public class Ejercicio11 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);

		int n;
		n=0;

		System.out.println("dame un numero:");
		n=teclado.nextInt();
		for (int i=1; i>=n; i++) {

			n=i+1;
			if (n % 3==0){
				System.out.println (n);
			}
			//System.out.printf ("%3d \n", i);
		}//for
		System.out.println (n);
	}//main
} //class