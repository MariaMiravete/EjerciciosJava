package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float a;
		float b;
		float c;

		float d;

		
		System.out.println("dame un numero con decimales:");
		a=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		b=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		c=teclado.nextFloat();

		if (a<0) {//if1
			d=a*b*c;
			System.out.print (+d);
		}
		else {
			d=a+b+c;
			System.out.print (+d);
		}//if1
	}//main
}//class
	



