package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 { //class

	public static void main(String[] args) { //main

		Scanner teclado = new Scanner(System.in);

		float a;
		
		System.out.println("dame un numero:");
		a=teclado.nextInt();
		
		
		if (a%2==0)  {
			System.out.print ("EL N�MERO ES PAR");
		}	
		else {
			System.out.print ("EL N�MERO ES IMPAR");
		}
			

	}//main
} //class
