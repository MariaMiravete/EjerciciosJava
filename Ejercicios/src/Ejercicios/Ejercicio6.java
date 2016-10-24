package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float a;
		

		float d;
		double raiz;
		
		System.out.println("dame un numero con decimales:");
		a=teclado.nextFloat();
		
		if (a<=0) {//if1
			System.out.print ("Error");
		}
		else {
			d=a*a;
			raiz=Math.sqrt(a);
		     System.out.println ("el cuadrado es " +d);
		     System.out.print ("la raiz cuadrada es " +raiz);
		}//if1
	}//main
}//class
