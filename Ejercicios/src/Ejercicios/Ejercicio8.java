package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 { //class

	public static void main(String[] args) { //main

		Scanner teclado = new Scanner(System.in);

		String mes="octubre"; //mes del descuento
		float importe=400; //importe sin descuento
		float importeDescuento=0; //descuento que se aplicara a la prenda
		
		
		
		if (mes=="octubre" || mes=="Octubre") { //if1
			importeDescuento=importe-(importe/100*15);
		
		System.out.println (importeDescuento );
		}
		
		else 
			System.out.println (importe);
		
	    
				
		
	
	}//main
} //class