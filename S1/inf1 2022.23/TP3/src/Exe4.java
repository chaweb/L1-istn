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
			System.out.println(" ".repeat(h-i) + "*".repeat(h+(i*2)));
		}

		//étape 2
		for(int i=1 ; i < h-1 ; i++ ) {
			System.out.println("*".repeat(3*h));
		}

		//étape 3
		for(int i=h ; i >= 0 ; i-- ) {
			System.out.println(" ".repeat(h-i) + "*".repeat(h+(i*2)));
		}
		sc.close();
	}

}
