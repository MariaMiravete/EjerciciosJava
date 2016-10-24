package Ejercicios;



import java.util.Scanner;
public class Escaner {
	public static void main(String[] parametro)
	{
		Scanner teclado = new Scanner(System.in); // definimos  un objeto teclado para lectura de datos
	
		int entero;
		float decimales;
		String mitexto; // vamos a leer diferentes tipos de datos
		
		System.out.println("dame un entero:");
		entero=teclado.nextInt();
		System.out.println("dame un numero con decimales:");
		decimales=teclado.nextFloat(); teclado.nextLine();
		System.out.println("dame un texto:");
		mitexto=teclado.nextLine();
		System.out.println("el entero fue:"+entero);
		System.out.println("el decimal fue:"+decimales);
		System.out.println("el texto fue:"+mitexto);
	}
}