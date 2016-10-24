package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float a;
		float d;
		float c;
		float b;
		
	    System.out.println("dame el número de niñas:");
		a=teclado.nextFloat();
		System.out.println("dame el número de niños:");
		b=teclado.nextFloat();
		
		c=a/(a+b)*100;
		d=b/(a+b)*100;
		System.out.println ("porcentaje de niñas " +c);
		System.out.print ("porcentaje de niños " +d);
				
		
	
	}//main
} //class