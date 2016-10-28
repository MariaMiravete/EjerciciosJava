package Ejercicios2;

import java.util.Scanner;

public class Ejercicio12 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);

		int n;
		n=0;

		System.out.println("dame un numero:");
		n=teclado.nextInt();
		for (int i=1; i>=100; i++) {
			if (n % 2==0){
				n=n+i;
			}
			System.out.println (n);
		}//for
		System.out.println("dame un numero:");
		n=teclado.nextInt();
		for (int i=1; i>=99; i=i+2) {
			n=n+i;
			System.out.println (n);
		}
		}//main
	} //class
