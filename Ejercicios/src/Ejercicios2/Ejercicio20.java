package Ejercicios2;

import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {


		Scanner teclado=new Scanner(System.in);
		int n, f, fact;
		fact=1;
				
		System.out.println("introduce un número ");
		n=teclado.nextInt();
		

		for (int i=n; i>1; i--){
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}
