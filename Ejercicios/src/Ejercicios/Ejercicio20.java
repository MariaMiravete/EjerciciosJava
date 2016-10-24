package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);
		
		String alumno"";
		float nota1=0;
		float nota2=0;
		float nota3=0;
		
		//suma=0;
		
		System.out.println("Introduce el nombre:");
		alumno=teclado.nextLine();
		
		
		while (!alumno.equalsIgnoreCase("")) {
		
		System.out.println("dame una nota:");
		nota1=teclado.nextFloat();
		System.out.println("dame una nota:");
		nota2=teclado.nextFloat();
		System.out.println("dame una nota:");
		nota3=teclado.nextFloat();
		
		System.out.println (0,1*nota1+0,);
		
		System.out.println("Introduce el nombre:");
		alumno=teclado.nextLine();
		
		
		} //while		
					 
		
		
		//System.out.println (suma);
	}//main
} //class