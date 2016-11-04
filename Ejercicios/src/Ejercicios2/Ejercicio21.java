package Ejercicios2;

import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		 
		int i, resto, sumaI, sumaP;
		sumaP=0;
		sumaI=0;


		for (i=1; i<=1000; i++){
			resto= i % 2;
			switch (resto){
			case 0:
				sumaP=sumaP+i;
				break;
			case 1:
				sumaI=sumaI+i;
			}
		}

		System.out.println("Suma de Pares "+ sumaP);
		System.out.println("Suma de Impares "+ sumaI);
	}//main

}//class


