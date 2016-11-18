package String;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase, fraseCod;
		int num, i, letra;
		do{
			System.out.println("Frase?");
			frase=teclado.nextLine();
		} while (frase.equals(frase.toUpperCase())==false); 

		do{
			System.out.println("numero?");
			num=teclado.nextInt();
		} while (num<1 || num>10); 
		fraseCod="";
		for (i=0; i<frase.length(); i++){
			letra=frase.charAt(i);//como letra es entero guardará el código ASCII
			letra=letra+num;
			fraseCod=fraseCod+(char)letra; //al código ASCII de letra le hacemos un casting para que sea un char			
		}
		
		
//HACERLO -num para descodificar
		
		System.out.println("Antes de codificar: " + frase);
		System.out.println("Despues de codificar: " + fraseCod);
		//AHORA MACHACAMOS FRASE
		for (i=0; i<frase.length(); i++){
			frase.replace(frase.charAt(i),(char)((int)frase.charAt(i)+num));
			
		}
		System.out.println((char)((int)frase.charAt(i)+num) +" " + frase);
		
	}//main

}//class
