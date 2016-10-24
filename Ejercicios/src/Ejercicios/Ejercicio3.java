package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		float a;
		float b;
	
		System.out.println("dame un numero con decimales:");
		a=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		b=teclado.nextFloat();
		
		if (a<b) {
			System.out.print ("a es menor que b");
			}
		else {
			if (a==b) {
				System.out.print ("a es igual que b"); 
			}
			else {
				System.out.print ("b es menor que a"); 
			}
		}
			
	}

}
