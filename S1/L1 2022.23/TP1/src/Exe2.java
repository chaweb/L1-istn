package tp1;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ecrire un nombre sympathique: ");

		int a = scanner.nextInt();

		System.out.print("Ecrire un nombre sympathoche: ");

		int b = scanner.nextInt();

		scanner.close();

		//afficher les valeurs de a et b
		System.out.println("sympathique : "+a + "; sympathoche : "+ b);
		
		//echanger les valeurs de a et b 
		int c;
		c=a;
		a=b;
		b=c;

		//afficher les nouvelles valeurs de a et b
		System.out.println("nouvelle sympathique : "+ a + "; nouveau sympathoche : "+ b);

		//afficher la valeur du double de a
		System.out.println("le double de sympathique :"+ 2*a);

		//afficher la valeur de la moitié de b
		System.out.println("la moitié de sympathique :"+b/2);

		//afficher le quotient et le reste de la division de a par b
		System.out.println("le quotient  de sympathique/sympathoche est : " + (a / b) + "; le reste est" + (a % b) );

		//afficher la plus grande valeur entre 
		System.out.println("la plus grande valeur est : " + (a > b ? ("sympathique :" + a) : ("sympathoche :" + b)));

	}
}
