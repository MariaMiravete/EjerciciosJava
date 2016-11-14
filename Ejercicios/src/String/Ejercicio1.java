package String;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		int primero=0;
		int contador=0;

		do { 
			System.out.println("introduce una frase");
			frase=teclado.nextLine();		
		}while (frase.length()>80);

		do  {
			System.out.println(frase.substring(primero,contador+1));
			contador++;
		}while (frase.length()>contador);

	} //main
}//class
