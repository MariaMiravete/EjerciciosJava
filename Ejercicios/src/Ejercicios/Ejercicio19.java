
package Ejercicios;

import java.util.Scanner;

public class Ejercicio19 { //class

	public static void main(String[] args) { //main
		Scanner teclado = new Scanner(System.in);
		
		int dia=0;
		int mes=0;
		int año=0;
		String mestexto="";
		
		
		System.out.println("Intruce el dia:");
		dia=teclado.nextInt();
		System.out.println("Intruce el mes:");
		mes=teclado.nextInt();
		System.out.println("Intruce el año:");
		año=teclado.nextInt();
		
		
		
		switch (mes) {
		case 1:
		mestexto="enero";
		break;
		
		case 2:
		mestexto="febrero";
		break;
		
		case 3:
		mestexto="marzo";
		break;
		
		case 4:
		mestexto="abril";
		break;
		
		case 5:
		mestexto="mayo";
		break;
		
		case 6:
		mestexto="junio";
		break;
		
		case 7:
		mestexto="julio";
		break;
		
		case 8:
		mestexto="agosto";
		break;
		
		case 9:
		mestexto="septiembre";
		break;
		
		case 10:
		mestexto="octubre";
		break;
		
		case 11:
		mestexto="noviembre";
		break;
		
		case 12:
		mestexto="diciembre";
		break;
		}
		
		System.out.println ("Fecha: " +dia+ " de " +mestexto+ " de "+año);

	}//main
} //class