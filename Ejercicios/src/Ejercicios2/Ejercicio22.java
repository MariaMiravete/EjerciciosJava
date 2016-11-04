package Ejercicios2;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		int i;
		String frase;
		Scanner teclado=new Scanner(System.in);

		System.out.println("frase?");
		frase=teclado.nextLine();
		System.out.println(frase);
		for (i=1; i<5; i++){
			frase="    "+frase;
			System.out.println(frase);
		}
	}////////main
}//class
