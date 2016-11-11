package Ejercicios2;

import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		int cont, cont2;
		cont=0;
		cont2=0;
		for (int i=1; i<=100; i++){
			if ((i % 2)==0){
				cont=cont+1;
				System.out.println(i);
			}
			if ((i % 3)==0){
				cont2=cont2+1;
				System.out.println(i);
			}	

		}
		System.out.println("multiplos de 2: " + cont);
		System.out.println("multiplos de 3: " + cont2);
	}
}
