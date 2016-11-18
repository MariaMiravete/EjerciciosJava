package Ejercicios;
import java.util.Scanner;
public class Ejercicio15 {
	
	public static void main(String[] parametro)
	{
		Scanner leer = new Scanner(System.in);

		int x=0;
		int z=0;
		int n=0;
		System.out.println("Introduzca un numero");
		n=leer.nextInt();

		do
		{
			z=z+1;
			x=x+n;
			n=leer.nextInt();


		}
		while(n!=-1);
		n=x/z;
		System.out.println(n);

	}
}
