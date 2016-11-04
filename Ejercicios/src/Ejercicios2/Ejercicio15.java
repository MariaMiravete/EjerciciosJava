package Ejercicios2;

import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {


		Scanner teclado=new Scanner(System.in);
		int n1,n2, aux, cont1, cont2, suma;
		suma=0;
		cont1=0;
		cont2=0;

		System.out.println("introduce ");
		n1=teclado.nextInt();
		System.out.println("introduce ");
		n2=teclado.nextInt();

		if(n1>n2){

			aux=n1;
			n1=n2;
			n2=aux;

		}

		for (int i=n1; i<=n2; i++){
			cont1=cont1+1; //total
			if ((i % 2)==0){
				cont2=cont2+1; //pares
			}else  {
				suma=suma+i; //impares
			}

		}
		System.out.println("total de números: " + cont1);
		System.out.println("total de números pares: " + cont2);
		System.out.println("suma de números impares: " + suma);
	}
}
