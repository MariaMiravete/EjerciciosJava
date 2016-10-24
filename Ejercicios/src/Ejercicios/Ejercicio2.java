package Ejercicios;

import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);	
		float a;
		float b;
		float suma;
		float resta;
		float producto;
		float div;
		
		System.out.println("dame un numero con decimales:");
		a=teclado.nextFloat();
		System.out.println("dame un numero con decimales:");
		b=teclado.nextFloat();
		
suma=a+b;
resta=a-b;
producto=a*b;
div=a/b;
System.out.println("la suma es: "+suma);
System.out.println("la resta es: "+resta);
System.out.println("el producto es: "+producto);
System.out.println("la div es: "+div);
	}
}



