package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float a;
		float b;
		float c;


		System.out.println("dame un numero con decimales:");
		a=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		b=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		c=teclado.nextFloat();

		if (a>b && a>c) {//if1
			System.out.print ("a es el mayor");
		}
		else {//si llega aqui sabemos que a no es el mayor
			if (b>c) {//if2
				System.out.print ("b es el mayor"); 
			}
			else {
				System.out.print ("c es el mayor");

			}//if2
		}//if1
	}//main
}//class
	



