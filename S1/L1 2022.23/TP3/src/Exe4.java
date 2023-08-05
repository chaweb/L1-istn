package tp3;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("hauteur");
		int h = sc.nextInt();
		// A compléter
		//étape 1
		for(int i=0 ; i <= h ; i++ ) {
			for(int j=0 ; j < h-i; j++){
				System.out.print(" ");
			}
			for(int j=0 ; j < h+(i*2); j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//étape 2
		for(int i=1 ; i < h-1 ; i++ ) {
			for(int j=0 ; j < h*3; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//étape 3
		for(int i=h ; i >= 0 ; i-- ) {
			for(int j=0 ; j < h-i; j++){
				System.out.print(" ");
			}
			for(int j=0 ; j < h+(i*2); j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
