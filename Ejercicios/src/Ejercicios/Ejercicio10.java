package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 { //class

	public static void main(String[] args) { //main

		Scanner teclado = new Scanner(System.in);

		float a;
		
		
		System.out.println("dame un numero:");
		a=teclado.nextInt();
		
		while (a<=0) {
		System.out.print ("Vuelve a escribir un número");	
		a=teclado.nextInt();
		}
		if (a%2==0)  {
			System.out.print ("EL NÚMERO ES PAR");
		}	
		else {
			System.out.print ("EL NÚMERO ES IMPAR");
		}
			

	}//main
} //class