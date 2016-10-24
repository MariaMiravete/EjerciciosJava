package Ejercicios;

import java.util.Scanner;
public class Ejercicio13 { //class

	public static void main(String[] args) { //main
		
		Scanner teclado = new Scanner(System.in);

		int a=0;
		int n;
		
		System.out.println("dame un numero:");
		n=teclado.nextInt();
		
		for (int i=1; i<=n; i++) {
			a=a+i;
			 
		}//for
		 System.out.println (a);//la ponemos fuera del bucle para que nos muestre solo la suma. y no las parciales.
		 
	}//main
} //class