package Ejercicios2;
import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	 

		int mi, ci, di, ui, n;
		String romano="";
		System.out.println("Intoduce un número: ");
		n=teclado.nextInt();
		mi=n/1000;
		n=n-mi*1000;
		ci=n/100;
		n=n-ci*100;
		di=n/10;
		ui=n-di*10;
		//ui=n;


		switch (mi) {
		case 0:
			break;
		case 1:
			romano="M";
			break;
		case 2:
			romano="MM";
			break;
		case 3:
			romano="MMM";
			break;
		case 4:
			romano="MMMM";	
		}

		switch (ci) {
		case 0:
			break;

		case 1:
			romano=romano+"C";
			break;
		case 2:
			romano=romano+"CC";
			break;
		case 3:
			romano=romano+"CCC";
			break;
		case 4:
			romano=romano+"CD";	
			break;
		case 5:
			romano=romano+"D";
			break;
		case 6:
			romano=romano+"DC";
			break;
		case 7:
			romano=romano+"DCC";
			break;
		case 8:
			romano=romano+"DCCC";	
			break;
		case 9:
			romano=romano+"CM";	
			break;

		}

		switch (di) {
		case 0:
			break;
		case 9:
			romano=romano+"XC";	
			
			break;
		case 8 :
			romano=romano+"LXXX";
			break;
		case 7:
			romano=romano+"LXX";
			break;
		case 6:
			romano=romano+"LX";
			break;
		case 5:
			romano=romano+"L";
			break;
		case 4:
			romano=romano+"XL";
			break;
		case 3:
			romano=romano+"XXX";
			break;
		case 2:
			romano=romano+"XX";
			break;
		case 1:
			romano=romano+"X";	
		}
		

		switch (ui) {
		case 0:
			
			break;
		case 9:
			romano=romano+"IX";
			break;
		case 8 :
			romano=romano+"VIII";
			break;
		case 7:
			romano=romano+"VII";
			break;
		case 6:
			romano=romano+"VI";
			break;
		case 5:
			romano=romano+"V";
			break;
		case 4:
			romano=romano+"IV";
			break;
		case 3:
			romano=romano+"III";
			break;
		case 2:
			romano=romano+"II";
			break;
		case 1:
			romano=romano+"I";

		}

			System.out.println(romano);

	}
}









