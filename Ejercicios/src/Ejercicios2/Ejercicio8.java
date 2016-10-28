package Ejercicios2;

import java.util.Scanner;

public class Ejercicio8{ //class


	public static void main(String[] args) { //main

		Scanner teclado = new Scanner(System.in);
		String letra;
		do{
			System.out.println("dame S o N:");
			letra=teclado.nextLine();
		}while (!letra.equals("S") && !letra.equals("N"));//hacer mientras el dato este mal
		System.out.println("Volvemos a jugar:");
		System.out.println("dame S o N:");
		letra=teclado.nextLine();
		while (!letra.equals("S") && !letra.equals("N")){
			System.out.println("T he dicho S o N (cacho torpe):");
			letra=teclado.nextLine();
		}
	}//main
} //class
