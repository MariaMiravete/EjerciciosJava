package Ejercicios;

import java.util.Scanner;
class ejercico_16 {
	public static void main (String[]parametre){
	
		Scanner leer=new Scanner(System.in);
		String x;
		int z=0;
		
		do{
			System.out.println("Introduzca una Contraseña");
			x=leer.nextLine();
				z=z+1;
				
		}while(!x.equalsIgnoreCase("EUREKA")&&z<3);
		if (x.equalsIgnoreCase("EUREKA"))
		{
			System.out.println("Has acertado");
		}
			
			
			else{
				System.out.println("Intentos agotados");
			}
				
}
		}