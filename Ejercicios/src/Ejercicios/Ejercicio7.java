package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float a;
		float d;
		float c;
		float b;
		
	    System.out.println("dame el n�mero de ni�as:");
		a=teclado.nextFloat();
		System.out.println("dame el n�mero de ni�os:");
		b=teclado.nextFloat();
		
		c=a/(a+b)*100;
		d=b/(a+b)*100;
		System.out.println ("porcentaje de ni�as " +c);
		System.out.print ("porcentaje de ni�os " +d);
				
		
	
	}//main
} //class