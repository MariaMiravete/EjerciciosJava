package Ejercicios2;

import java.util.Scanner;

public class Ejercicio9 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);

		int n;
		n=0;

		System.out.println("dame un numero:");
		n=teclado.nextInt();
		
		if (n<0){
			System.out.println("El n�mero es negativo");
		}else 
			System.out.println("El n�mero es positivo");	
		
	}//main
} //class