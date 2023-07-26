package tp1;

import java.util.Scanner;

public class Exe5 {
	//Affichage dans l'ordre croissant

	public static void main(String[] args) {
		//code ici
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		int a = sc.nextInt();
		System.out.print("b :");
		int b = sc.nextInt();
		System.out.print("c :");
		int c = sc.nextInt();

		int tmp;

		if(b < a){
			tmp = a; 
			a = b ;
			b = tmp;
		};
		if (c < b){
			tmp = b;
			b = c; 
			c = tmp;
		}
		if (b < a){
			tmp = a; 
			a = b;
			b = tmp;
		}
		System.out.println("==> Apres ordonner : a=" + a + " b=" + b + " c=" + c);
	}
}
