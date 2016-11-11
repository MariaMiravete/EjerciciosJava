package Ejercicios2;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);

		int fact, n, mult,i,j, contadiv;	
		fact=1;


		System.out.println("introduce un número ");
		n=teclado.nextInt();

		//factorial

		for (i=n; i>1; i--){
			fact=fact*i;
		}

		System.out.println("El factorial es: "+ fact);		


		//multiplicación
		for ( i=1; i<=10; i=i+1) {
			System.out.printf("%3d * %3d = %3d \n",n,i, n*i);
		}//for

		//primo
		contadiv=0;

		for (i=2; i<=Math.sqrt(n); i++) { //voy a probar si puedo dividir n por i
			if (n%i==0) {
				contadiv ++;
			}//pruebo un divisor

		}//termino de probar todos los divisores
		if (contadiv==0) {
			System.out.println("el número es primo");
		} else {
			System.out.println("el número no es primo");	
		}
	}//main

}//class













