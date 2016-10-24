package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 { //class

	public static void main(String[] args) { //main

		Scanner teclado = new Scanner(System.in);

		float a; //bachiller
		float b; //prueba acceso


		System.out.println("SI TIENES BACHILLER TECLEA 1. EN CASO CONTARIO CUALQUIER OTRO NUMERO:");
		a=teclado.nextInt();
		

		if (a==1)  {
			System.out.print ("PUEDES ACCEDER A GRADO SUPERIOR");
		}else{
			System.out.println("SI TIENES PRUEBA DE ACCESO TECLEA 1. EN CASO CONTARIO CUALQUIER OTRO NUMERO:");
			b=teclado.nextInt();
			if (b==1){
				
				System.out.print ("PUEDES ACCEDER A GRADO SUPERIOR");
			}
			else {
				System.out.print ("NO PUEDES ACCEDER A GRADO SUPERIOR");
			}
		}


	}//main
} //class
