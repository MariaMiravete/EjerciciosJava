package Ejercicios2;

import java.util.Scanner;
public class Ejercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);

		int n,n2, opcion;
		float suma=0, resta=0, division=0, multiplicacion=0;

		System.out.println("introduce un número ");
		n=teclado.nextInt();
		System.out.println("introduce un número ");
		n2=teclado.nextInt();

		do {
			System.out.println("1.sumar");
			System.out.println("2.Restar");
			System.out.println("3.Dividir");
			System.out.println("4.Multiplicar");
			System.out.println("0.Salir");
			
			opcion=teclado.nextInt();
			
			switch (opcion) {			
			case 0:
			break;
			case 1:
				suma=n+n2;
				System.out.println(suma);

				break;
			case 2:
				if (n<n2){
					resta=n2-n;
				} 
				else {	
					resta=n-n2;	
				}
				System.out.println(resta);
				break;
			case 3:
				multiplicacion=n*n2;
				System.out.println(multiplicacion);
				break;
			case 4:
				if (n<n2){
					division=(float)n2/n;
				} 
				else {	
					division=(float)n/n2;	
				}
				System.out.println(division);
				break;
			default:
				System.out.println("opcion no valida");
			}	
		}while (opcion!=0);
	}//main

}//main
