package Ejercicios2;

import java.util.Scanner;

public class Ejercicio10 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);

		int n;
		n=0;

		System.out.println("dame un numero:");
		n=teclado.nextInt();
		
		if (n % 2==0){
			System.out.println("El número es par");
		}else 
			System.out.println("El número es impar");	
		
	}//main
} //class